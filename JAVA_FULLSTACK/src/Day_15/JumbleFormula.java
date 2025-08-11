package Day_15;
import java.util.*;

public class JumbleFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formula = sc.nextLine(); // Example: a+b*c-d

        // Convert to list of characters
        List<Character> chars = new ArrayList<>();
        for (char c : formula.toCharArray()) {
            chars.add(c);
        }

        // Shuffle
        Collections.shuffle(chars);

        // Print jumbled formula
        for (char c : chars) {
            System.out.print(c);
        }

        sc.close();
    }
}