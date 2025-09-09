package String;
import java.util.Scanner;
public class Copy_one_to_another_str {

	public static void main(String[] args) {
		Scanner z = new Scanner ( System.in); 
		System.out.println("Entere the value of str: ");
        String s1 = z.nextLine();
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

	}

}
