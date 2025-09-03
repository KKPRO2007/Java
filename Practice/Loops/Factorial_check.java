package Loops;
import java.util.Scanner;
public class Factorial_check {
	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		System.out.println("entre the no: ");
		int n = z.nextInt();
		int f = 1;
		for(int i = 1; i<= n; i++)
			f = f * i;
		System.out.println(f);
		
	}
	}

