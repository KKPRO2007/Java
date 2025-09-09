package String;
import java.util.Scanner;
public class Count_total_no_of_vowels_n_consonant {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
        System.out.print("Enter value of str: ");
        String input = z.nextLine();
        
        int vow = 0, con = 0;
        String lowerInput = input.toLowerCase();

        for (int i = 0; i < lowerInput.length(); i++) {
            char c = lowerInput.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vow++;
            } else if (c >= 'a' && c <= 'z') {
                con++;
            }
        }

        System.out.println("No of vowels: " + vow);
        System.out.println("No of consonants: " + con);
	}

}
