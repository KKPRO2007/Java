package Arrays;
import java.util.Scanner;

public class Array_Frequency {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }

        int b[] = new int[max + 1]; 
        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0)
                System.out.println(i + " = " + b[i]);
        }
    }
}
