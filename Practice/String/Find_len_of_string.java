package String;
import java.util.Scanner;
public class Find_len_of_string {
    public static void main(String[] args) {
    	Scanner z = new Scanner ( System.in); 
    	System.out.println("Entere the value to find len: ");
        String s = z.nextLine();
        int len = s.length();
        System.out.println(len);
    }
}
