package Arrays;
import java.util.Scanner;

public class Array_Merge {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n1 = z.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = z.nextInt();
        }
        int n2 = z.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = z.nextInt();
        }

        int merged[] = new int[n1 + n2];
        int k = 0;

        for (int i = 0; i < n1; i++) {
            merged[k++] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[k++] = arr2[i];
        }

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
