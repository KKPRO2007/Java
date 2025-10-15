package Arrays;
import java.util.*;
public class merged_main {

	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		int n1=z.nextInt();
		int a1[]=new int[n1];

		for(int i=0;i<n1;i++)
			a1[i]=z.nextInt();
		

		int n2=z.nextInt();
		int a2[]=new int[n2];

		for(int i=0;i<n2;i++)
			a2[i]=z.nextInt();
		
		int m[]= new int [n1+n2];
		int k =0;
		
		for(int i=0;i<n1;i++)
			m[k++]=a1[i];
		for(int i=0;i<n2;i++)
			m[k++]=a2[i];
		
		for(int i=0;i<m.length;i++)
			System.out.print(m[i]+" ");
			
		

	}

}
