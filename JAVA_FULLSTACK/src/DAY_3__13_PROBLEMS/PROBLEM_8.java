package DAY_3__13_PROBLEMS;
//8.	Program to swap two numbers using temporary variable.

public class PROBLEM_8 {
	public static void main(String[] args) {
        int a = 10, b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }


}
