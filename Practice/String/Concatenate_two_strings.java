package String;
import java.util.Scanner;

public class Concatenate_two_strings {

	public static void main(String[] args) {
		Scanner z = new Scanner ( System.in); 
		System.out.println("Entere the value of str: ");
        String s1 = z.nextLine();
        System.out.println("Entere the value of str: ");
        String s2 = z.nextLine();
        String c = s1 + s2;
        System.out.println(c);

	}

}
