package String;
import java.util.Scanner;
public class Lowercase_string_to_uppercase {
	public static void main(String[] args) {
		Scanner z = new Scanner ( System.in);
		System.out.print("Enter a lowercase string: ");
        String s = z.nextLine();
        String u= s.toUpperCase();
        System.out.println("Uppercase string: " + u);

	}

}
