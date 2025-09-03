package Loops;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		System.out.println("entre the no: ");
		int n = z.nextInt();
		int a = 0; 
		int b = 1;
		System.out.println("fibonaaci series :");
		for( int i = 1; i<= n; i++) {
			System.out.print(a + " ");
			int c = a +b;
			a = b;
			b = c;
		}
			
	}

}
