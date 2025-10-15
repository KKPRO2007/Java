package Loops;

import java.util.Scanner;

public class print_odd_no {

	public static void main(String[] args) {
			Scanner x= new Scanner(System.in);
			System.out.println("entre the number: ");
			int n =x.nextInt();
			int i = 1;
			int count = 0;
			 while (i <= n) {
		            System.out.println(i);
		            i += 2;
		            count++;
		            System.out.println("count is "+count);
	}

}
}
