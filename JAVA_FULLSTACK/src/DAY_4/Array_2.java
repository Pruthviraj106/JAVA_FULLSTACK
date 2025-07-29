//Write a Java program to insert an element (specific position) into an array.

package DAY_4;
import java.util.Arrays;
import java.util.Scanner;


public class Array_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size + 1]; // +1 to allow space for new element

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter the position to insert (0 to " + size + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
        } else {
            for (int i = size; i > position; i--) {
                array[i] = array[i - 1];
            }

            array[position] = element;

            System.out.println("Array after insertion: " + Arrays.toString(array));
        }

        scanner.close();
    }

}
