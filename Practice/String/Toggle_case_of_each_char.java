package String;
import java.util.Scanner;
public class Toggle_case_of_each_char{
	public static void main(String[] args) {
	Scanner z = new Scanner ( System.in);
	System.out.println("Entre the string: ");
    String s = z.nextLine();
    String toggle= "";
    for (int i = 0; i < s.length(); i++) {
    	char c = s.charAt(i);
    	if (Character.isUpperCase(c))
    		toggle= toggle + Character.toLowerCase(c);
    	else if (Character.isLowerCase(c)) 
            toggle= toggle + Character.toUpperCase(c);
    	else 
            toggle= toggle + c;
    }
    System.out.println("Toggled: "+ toggle);

}
}
