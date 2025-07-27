package DAY_3__13_PROBLEMS;
//4.	Write a program to find largest of two no’s using Ternary operator.
import java.util.Scanner;
public class PROBLEM_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Largest: " + max);
    }
}



