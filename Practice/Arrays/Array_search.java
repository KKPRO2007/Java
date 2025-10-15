package Arrays;
import java.util.Scanner;
public class Array_search {
	public static void main (String [] k)
	{
		Scanner z = new Scanner (System.in);
		int n = z.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
			a[i]=z.nextInt();
		
		int key = z.nextInt();
		boolean found = false;
		for(int i=0; i<n; i++)
			if(a[i]== key) {
				System.out.println("found");
		found = true;
		break;}
            if(!found)
            	System.out.println("Not found");
		
		 
	}

}
