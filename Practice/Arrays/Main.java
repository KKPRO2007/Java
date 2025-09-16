package Arrays;
import java.util.Scanner;
public class Main {
	public static void main ( String []k) {
		Scanner z = new Scanner ( System.in);
		System.out.println("entre the array value");
		int c = z.nextInt();
		int n [] = new int [c];
		System.out.println("entre the input for string");
		for(int i = 0; i<c; i++)
			n[i]=z.nextInt();
		int max = n[0];
		for (int i = 1; i<c; i++)
			if(n[i]>max)
				max= n[i];
		int b []= new int [max +1];
		for ( int i=0; i<c; i++)
			b[n[i]]++;
		
		System.out.println("the freq of array");
		for ( int i = 0; i<b.length ;i++) {
			if (b[i]>0)
				System.out.println(i + " = " + b[i]);
		
		
		
		}
		
		
	}

}
