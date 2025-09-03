package Loops;
import java.util.Scanner;
public class Armstrong_for_all_digit {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.println("entre the no: ");
		int n = z.nextInt();
		int temp = n;
		int len = (int) Math.log10(n)+1;
		int sum = 0;
		while (n > 0)
		{
			int k = n%10;
			n = n / 10;
			sum = sum + (int) Math.pow(k,len);
		}
           if(sum==temp)
        	   System.out.println("its armstrong");
           else
        	   System.out.println("its not armstrong");
	}

}
