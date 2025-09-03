package Loops;
import java.util.Scanner;
public class Armstrong_check {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.println("entre the no: ");
		int n = z.nextInt();
		int sum = 0;
		int num = n;
		while(n>0) {
			int d = n%10;
			sum = sum +(d*d*d);
			n=n/10;
		}
         if(sum==num)
        	 System.out.println("its armstrong");
         else
        	 System.out.println("its not armstrong");
	}

}
