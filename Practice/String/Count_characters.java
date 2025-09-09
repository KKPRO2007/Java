package String;
import java.util.Scanner;
public class Count_characters {

	public static void main(String[] args) {
		Scanner z = new Scanner ( System.in); 
		System.out.println("Entere the value of str: ");
        String s = z.nextLine();
        int a = 0, dig = 0, sc = 0;
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (Character.isAlphabetic(c)) 
                a++;
             else if (Character.isDigit(c)) 
                dig++;
             else 
                sc++;
        }
        System.out.println("Number of alphabets: " + a);
        System.out.println("Number of digits: " + dig);
        System.out.println("Number of special char: " + sc);
	}

}
