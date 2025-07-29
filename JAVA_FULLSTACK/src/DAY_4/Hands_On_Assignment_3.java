/*Write a program to help Rohit achieve this for any given two numbers.

 The prototype of the method should be -int addLastDigits(int input1, int input2);

where input1 and input2 denote the two numbers whose last digits are to be added.
Note: The sign of the input numbers should be ignored.
i.e.
if the input numbers are 267 and 154, the sum of last two digits should be 11

if the input numbers are 267 and -154, the sum of last two digits should be 11

if the input numbers are -267 and 154, the sum of last two digits should be 11

if the input numbers are -267 and -154, the sum of last two digits should be 11*/


package DAY_4;

public class Hands_On_Assignment_3 {
    public static int addLastDigits(int input1, int input2) {
        // Convert to positive if negative
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);

        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Sum of last digits of (267, 154): " + addLastDigits(267, 154));     // 7 + 4 = 11
        System.out.println("Sum of last digits of (267, -154): " + addLastDigits(267, -154));   // 7 + 4 = 11
        System.out.println("Sum of last digits of (-267, 154): " + addLastDigits(-267, 154));   // 7 + 4 = 11
        System.out.println("Sum of last digits of  (-267, -154): " + addLastDigits(-267, -154)); // 7 + 4 = 11
    }


}
