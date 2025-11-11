package DSA;
import java.util.*;

public class Settry {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        Set<Integer> hashSet = new HashSet<>();

        System.out.println("Enter numbers (type -1 to stop):");

        while (true) {
            int input = z.nextInt();
            if (input == -1) break;
            hashSet.add(input);
        }

        System.out.println("Unique elements in the set: " + hashSet);
        z.close();
    }
}
