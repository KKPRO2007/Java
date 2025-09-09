package String;
import java.util.Scanner;
public class Count_no_of_words {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String s = z.nextLine();

        s = s.trim();

        if (s.isEmpty()) 
            System.out.println("no of words is 0");
         else {
            String[] a = s.split("\\s+");
            System.out.println("no of words: " + a.length);

	}

}
}
