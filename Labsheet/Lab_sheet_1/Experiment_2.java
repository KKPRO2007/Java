package Lab_sheet_1;
import java.util.Scanner;

public class Experiment_2 {
    public void performoperations(int a, int b) {
        System.out.println("sum: " + (a + b));
        System.out.println("difference: " + (a - b));
        System.out.println("product: " + (a * b));

        if (b == 0)
            System.out.println("quotient error, division by zero");
        else
            System.out.println("quotient: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int a = z.nextInt();
        int b = z.nextInt();

        if (a < -10000 || a > 10000 || b < -10000 || b > 10000)
            System.out.println("invaild, number must be between -10000 and 10000");
        else {
            Experiment_2 obj = new Experiment_2();
            obj.performoperations(a, b);
        }
    }
}
