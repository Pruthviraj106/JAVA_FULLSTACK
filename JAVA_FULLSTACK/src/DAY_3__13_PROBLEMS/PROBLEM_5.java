package DAY_3__13_PROBLEMS;
//5.	Write a program to find largest of three no’s using Ternary operator.
import java.util.Scanner;
public class PROBLEM_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest: " + max);
    }
}


