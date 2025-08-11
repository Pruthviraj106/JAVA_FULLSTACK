package Day_15;
import java.util.*;

public class JumbleWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();  // Input word

        // Convert to list of characters
        List<Character> letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(c);
        }

        // Shuffle the letters
        Collections.shuffle(letters);

        // Print jumbled word
        for (char c : letters) {
            System.out.print(c);
        }

        sc.close();
    }
}