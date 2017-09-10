import Number.RomanNumber;

public class program {
    public static void main(String args[]){
        RomanNumber romanNumber = new RomanNumber();
        System.out.println(romanNumber.toRomanNumber(1001));
        System.out.println(romanNumber.toIntegerNumber("MI"));
        System.out.println(romanNumber.toIntegerNumber("MMMMXII"));
    }
}
