package Lab_sheet_1;
import java.util.Scanner;

public class Experiment_4 {
    public int findlargest(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int a = z.nextInt();
        int b = z.nextInt();
        int c = z.nextInt();

        if (a < -1_000_000 || a > 1_000_000 ||
            b < -1_000_000 || b > 1_000_000 ||
            c < -1_000_000 || c > 1_000_000) {
            System.out.println("Invalid input. Numbers must be between -1000000 and 1000000.");
        } else {
            Experiment_4 obj = new Experiment_4();
            System.out.println(obj.findlargest(a, b, c));
        }
    }

}
