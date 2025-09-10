package String;
import java.util.Scanner;

public class Toggle_case_of_each_char {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = z.nextLine();
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= 'A' && c <= 'Z')
                s2 = s2 + (char)(c + 32);  
            else if (c >= 'a' && c <= 'z')
                s2 = s2 + (char)(c - 32);  
            else
                s2 = s2 + c;  
        }
        System.out.println("Toggled: " + s2);
    }
}
