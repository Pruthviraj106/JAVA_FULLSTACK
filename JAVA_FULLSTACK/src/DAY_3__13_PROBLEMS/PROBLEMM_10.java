package DAY_3__13_PROBLEMS;
//10.	Program to swap two numbers using bitwise operators.

public class PROBLEMM_10 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + ", b: " + b);
    }


}
