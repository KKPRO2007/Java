package String;
import java.util.Scanner;
public class Str_palindrome_or_not {

	public static void main(String[] args) {
		 Scanner z = new Scanner(System.in);
	        System.out.print("Enter value for str: ");
	        String input = z.nextLine();
	        String l = input.toLowerCase();

	        String reversed = "";
	        for (int i = l.length() - 1; i >= 0; i--) 
	            reversed += l.charAt(i);
	        
	        if (l.equals(reversed)) 
	            System.out.println("its a palindrome.");
	         else 
	            System.out.println("itsnt a palindrome.");
	
	}
}
