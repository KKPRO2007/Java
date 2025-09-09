package String;
import java.util.Scanner;
public class Reverse_string {

	public static void main(String[] args) {
		 Scanner z = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = z.nextLine();
            String r = "";
            for (int i = s.length() - 1; i >= 0; i--) 
                r += s.charAt(i);
            System.out.println(r);

	}

}
