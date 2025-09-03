package Loops;
import java.util.Scanner;
public class Check_palindrome_2 {
	public static void main (String [] a) {
		
		Scanner z = new Scanner (System.in);
		System.out.println(" entre the no: ");
		int n = z.nextInt();
		int rev = 0;
		int num = n;
		while ( n>0) {
			int k = n % 10;
			n = n / 10;
			rev = rev * 10 + k;
		}
		if ( num == rev)
			System.out.println("its palindrome");
		else 
			System.out.println("its not plindrome");
		}
	}


