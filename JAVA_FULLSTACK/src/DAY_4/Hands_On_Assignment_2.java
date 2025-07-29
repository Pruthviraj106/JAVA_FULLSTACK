
/*Create a new class called Calculator with the following methods:
1. A static method called powerInt(int numl, int num2)
This method should return numl to the power num.
2. A static method called powerDouble(double num, int num2).
This method should return numl to the power num.
3. Invoke both the methods and test the functionalities.
Hint: Use Math. pow(double,double) to calculate the power.*/


package DAY_4;

	class Calculator {
	    public static int powerInt(int num1, int num2) {
	        return (int) Math.pow(num1, num2);
	    }

	    public static double powerDouble(double num1, int num2) {
	        return Math.pow(num1, num2);
	    }
	}

	public class Hands_On_Assignment_2 {
	    public static void main(String[] args) {
	        int intResult = Calculator.powerInt(2, 3);  // 2^3 = 8
	        System.out.println("powerInt(2, 3): " + intResult);

	        double doubleResult = Calculator.powerDouble(2.5, 3);  // 2.5^3 = 15.625
	        System.out.println("powerDouble(2.5, 3): " + doubleResult);
	    }

}
