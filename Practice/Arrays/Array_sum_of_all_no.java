package Arrays;

import java.util.Scanner;

public class Array_sum_of_all_no {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int sum=0;
        int[] a = new int[n];
  
        for (int i = 0; i < n; i++) {
            a[i] = z.nextInt();
          sum= sum + a[i];
        }
            System.out.println(sum);
        }
    }

