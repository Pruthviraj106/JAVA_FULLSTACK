//1. Write a Java program to get the character at the given index within the String.
package DAY_5;
import java.util.Scanner;

public class Strings_1 {
//	public static void main(String[] args)
//	 {
//	 String str = "Java Exercises!";
//	 System.out.println("Original String = " + str);
//	 // Get the character at positions 0 and 10.
//	 int index1 = str.charAt(0);
//	 int index2 = str.charAt(10);
//	 // Print out the results.
//	 System.out.println("The character at position 0 is " +(char)index1);
//	 System.out.println("The character at position 10 is " +(char)index2);
//	 }
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for a sentence
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Ask for one position
        System.out.print("Enter a position (starting from 0): ");
        int pos = sc.nextInt();

        // Check if position is valid
        if (pos >= 0 && pos < str.length()) {
            char ch = str.charAt(pos);
            System.out.println("Original String = " + str);
            System.out.println("The character at position " + pos + " is " + ch);
        } else {
            System.out.println("Invalid position. String length is " + str.length());
        }

}
}
