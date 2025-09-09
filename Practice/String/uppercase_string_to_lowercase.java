package String;
import java.util.Scanner;
public class uppercase_string_to_lowercase {
	public static void main(String[] args) {
		Scanner z = new Scanner ( System.in);
		System.out.print("Enter a Uppercase string: ");
        String s = z.nextLine();
        String l= s.toLowerCase();
        System.out.println("Lowercase string: " + l);

	}

}
