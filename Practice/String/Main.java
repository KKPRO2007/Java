package String;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		System.out.println("enter the string");
		String s = z.nextLine();
		String l = s.toLowerCase();
		String r="";
		for( int i = l.length()-1; i >= 0; i--)
			r+=l.charAt(i);
		if(l.equals(r))
			System.out.println("its pn");
		else
			System.out.println("its not pn");
			
		
		

	}

}
