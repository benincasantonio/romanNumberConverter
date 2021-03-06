package Number;

public class RomanNumber {
    //array of the roman numbers
    private String[] roman = {"M", "CM", "D", "C", "CD", "L","XL", "X", "IX", "V", "IV", "I"};
    private int[] decimal = {1000, 900, 500, 400, 100, 50, 40, 10, 9, 5, 4, 1};

    public String toRomanNumber(int num){
        StringBuilder romanNumber = new StringBuilder();
        for(int i = 0; i < roman.length;i++){
            while(num % decimal[i] < num){
                romanNumber.append(roman[i]);
                num-=decimal[i];
            }
        }
        return romanNumber.toString();
    }

    public int toIntegerNumber(String romanNumber){
        int result = 0;
        for (int i = 2; i > 0; i--){
            for(int j = 0; j < decimal.length; j++){
                while(romanNumber.contains(roman[j]) && roman[j].length() == i){
                    result += decimal[j];
                    romanNumber = romanNumber.replaceFirst(roman[j],"");
                }
            }
        }
        return result;
    }
}
