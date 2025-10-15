package Arrays;

import java.util.Scanner;

public class Array_count_all_negtive {
	
	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		int n = z.nextInt();			
		int a[]=new int [n];
		for (int i=0; i<n; i++)
			a[i] =z.nextInt();
		
		int evenCount = 0; 
		 for (int i=0; i<n; i++)
		 if (a[i] < 0) {
		evenCount++;
		 }	
        System.out.println(evenCount);
		
	}

}


