package Loops;

import java.util.Scanner;

public class Sum_of_odd_no {

		public static void main(String[] args) {
			Scanner x= new Scanner(System.in);
			System.out.println("entre the number: ");
			int n =x.nextInt();
			int i = 1;
			int sum=0;
			int count=0;
			 while (i <= n) {
				 sum = sum + i;
				   i += 2;     
				   count++;
	}
			 System.out.println(i);
			    System.out.println(sum);
			    System.out.println(count);

}
}