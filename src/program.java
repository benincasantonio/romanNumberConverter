import Number.RomanianNumber;

public class program {
    public static void main(String args[]){
        RomanianNumber romanianNumber = new RomanianNumber();
        String n = romanianNumber.toRomanianNumber(9);
        System.out.println(n);
    }
}
