package Arrays;
import java.util.Scanner;
public class Main {
	public static void main ( String []k) {
		Scanner z = new Scanner ( System.in);
		System.out.println("entre the size");
		int n = z.nextInt();
		int a [] = new int [n];
		System.out.println("enter thr elements: ");
		for (int i = 0; i<n;i++)
			a[i]=z.nextInt();
		int max = a[0];
		for (int i=1;i<n;i++) {
			if(a[i]>max)
				max=a[i];
		}
			int b[]= new int [max+1];
			for (int i=0;i<n;i++ )
				b[a[i]]++;
			
			System.out.println("the freq of the array: ");
			int cf=0;
			for (int i = 0; i<b.length ;i++)
			{
				if(b[i]>0)
					System.out.println(i+"="+b[i]);
				cf++;
			}
			
			System.out.println("the unq of the array: ");
			for (int i = 0; i<b.length ;i++)
			{
				if(b[i]==1)
					System.out.println(i);
			}
			
			System.out.println("the dup of the array: ");
			int cd=0;
			for (int i = 0; i<b.length ;i++)
			{
				if(b[i]>1)
					System.out.println(i);
				cd++;
			}
			System.out.println("the count of dup: "+ cd);
			System.out.println("the count of frq: "+ cf);
			
					
				
		
		
		
		
		}
		
		
	}


