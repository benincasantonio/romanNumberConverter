package Number;

public class RomanianNumber {
    public String[] unit = {
            "",
            "I",
            "II",
            "III",
            "IV",
            "V",
            "VI",
            "VII",
            "VIII",
            "IX",
    };

    public RomanianNumber(){

    }

    public String toRomanianNumber(int num){
        String number = Integer.toString(num);

        StringBuilder romanNumber = new StringBuilder();
        for(int i = (number.length() - 1); i >= 0; i--){
            String rNum = unit[Character.getNumericValue(number.charAt(i))];
            romanNumber.append(rNum);
        }
        return romanNumber.toString();
    }

    public int toIntegerNumber(String romaninaNum){
        return 1;
    }
}
