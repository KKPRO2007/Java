package Arrays;
import java.util.Scanner;

public class D2array_sum {
	
    public static void main(String[] args) {
    	Scanner z = new Scanner (System.in);
    	
    	int r=z.nextInt();
    	int c=z.nextInt();
    	int a[][] = new int [r][c];
    	int sum=0;
    	
    	   for (int i = 0; i < r; i++) {
               for (int j = 0; j < c; j++) {
                   a[i][j] = z.nextInt();
    	  sum = sum+a[i][j];
    	 
               }
    	   }
    	 
    	   System.out.println(sum);
    }
}
