package lab_sheet_4;
import java.util.Scanner;

public class Experiment_3 {
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Reversed: " + reverseNumber(n));
    }
}
