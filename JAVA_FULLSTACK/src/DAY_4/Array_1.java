//1. Write a Java program to remove a specific element from an array.

package DAY_4;
import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        int count = 0;
        for (int num : array) {
            if (num == elementToRemove) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        } else {
            int[] newArray = new int[array.length - count];
            int index = 0;

            for (int num : array) {
                if (num != elementToRemove) {
                    newArray[index++] = num;
                }
            }
            System.out.println("Original Array: " + Arrays.toString(array));
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
        }

        scanner.close();
    }


}
