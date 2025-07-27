package DAY_3__13_PROBLEMS;
//9.	Program to swap two numbers without using temporary variable.

public class PROBLEM_9 {
	public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);
    }


}
