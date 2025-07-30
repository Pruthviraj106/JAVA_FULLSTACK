//3. Write a Java program to concatenate a given string to the end of another string.

package DAY_5;
import java.util.Scanner;

public class Strings_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get string 1 from user
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);

        System.out.println("The concatenated string: " + str3);

    }


}
