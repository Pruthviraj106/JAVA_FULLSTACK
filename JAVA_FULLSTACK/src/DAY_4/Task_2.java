package DAY_4;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the 1st array: ");
        int a = scanner.nextInt();

        int[] array1 = new int[a];
        System.out.println("Enter " + a + " integers:");
        for (int i = 0; i < a; i++) {
            array1[i] = scanner.nextInt();
        }
           
        System.out.print("Enter the size of the 1st array: ");
            int b = scanner.nextInt();

            int[] array2 = new int[b];
            System.out.println("Enter " + b + " integers:");
            for (int i = 0; i < b; i++) {
                array2[i] = scanner.nextInt();
            }
        
           
           int[] result = new int[a+ b];
           for (int i = 0; i < a; i++) {
               result[i] = array1[i];
           }
           for (int i = 0; i < b; i++) {
               result[a + i] = array2[i];
           }

           // Display result
           System.out.println("First array: " + Arrays.toString(array1));
           System.out.println("Second array: " + Arrays.toString(array2));
           System.out.println("Concatenated array: " + Arrays.toString(result));
        }

	}

