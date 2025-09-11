package Arrays;
import java.util.Scanner;
public class Array_freq_unique_duplicate {
	public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = z.nextInt();
		int a[]=new int [n];
		System.out.println("entre the elements: ");
		for (int i=0; i<n; i++)
			a[i] =z.nextInt();
		int max= a[0];

		{
			for (int i = 1; i < n; i++) {
			if(a[i]>max)
					max=a[i];
		}
		int b[]= new int[max+1];
		for (int i=0; i<n; i++)
		{
			b[a[i]]++;
		}
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]+" ");
		System.out.println();
		System.out.println("print unique elements");
		for (int i=0; i<b.length; i++)
		{
			if(b[i]==1)
				System.out.println(i+" ");
		}
		System.out.println();
		System.out.println("print duplicate elements");
		for (int i=0; i<b.length; i++)
		{
			if(b[i]>1)
				System.out.println(i+" ");
		}
		System.out.println(0);
		System.out.println("print frequence of each elemrnt ");
		for (int i=0; i<b.length; i++)
		{
			if(b[i]>0)
				System.out.println(i+" = "+b[i]);
		}
	
		
}
	}
}
