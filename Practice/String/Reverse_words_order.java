package String;
import java.util.Scanner;
public class Reverse_words_order {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = z.nextLine();

        String[] a = input.split(" ");

        String r = "";
        for (int i = a.length - 1; i >= 0; i--) {
            r += a[i];
            if (i != 0) 
                r += " ";
        }
        System.out.println("Reversed order of words: " + r);
    }

	}

