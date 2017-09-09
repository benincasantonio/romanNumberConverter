import java.util.Scanner;
import Number.RomanNumber;
public class program {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        RomanNumber romanNumber = new RomanNumber();
        System.out.println(romanNumber.toRomanNumber(num));
    }
}
