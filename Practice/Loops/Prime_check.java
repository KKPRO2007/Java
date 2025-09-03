package Loops;
	import java.util.Scanner;
	public class Prime_check {

		public static void main(String[] args) {
			Scanner z = new Scanner ( System.in);
			System.out.println("entre the no: ");
			int n = z.nextInt();
			int flag = 0;
			for ( int i = 2; i<=n/2; i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("its prime");
			else 
				System.out.println("its not prime");
					
			}

	}


