package Arrays;
import java.util.Scanner;
public class Array_odd_no_count {
	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		int n = z.nextInt();
		int evenCount = 0;
		int a[]=new int [n];

		for (int i=0; i<n; i++)
			a[i] =z.nextInt();
		 
		 for (int i=0; i<n; i++)
		 if (a[i] % 2 != 0) {

		 evenCount++;
		 }
	        System.out.println(evenCount);		 

}
}


