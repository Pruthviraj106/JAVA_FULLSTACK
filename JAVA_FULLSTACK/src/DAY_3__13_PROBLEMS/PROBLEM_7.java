package DAY_3__13_PROBLEMS;
//7.	Program to find one’s complement (bitwise) of any number. 
import java.util.Scanner;

public class PROBLEM_7 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int a = sc.nextInt();
	        System.out.println("One's Complement: " + (~a));
	    }


}
