package Arrays;

import java.util.Scanner;

public class Array_copy_elements {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();

        int[] a = new int[n];
        int[] b = new int[n]; 
        for (int i = 0; i < n; i++) {
            a[i] = z.nextInt();
        }

       
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        System.out.println("array 1st : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("Copy array 2nd: ");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i] + " ");
        }

        z.close();
    }
}
