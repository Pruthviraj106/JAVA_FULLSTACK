//2. Write a Java program to get the character (Unicode code point) before 
//the specified index within the String.

package DAY_5;

public class Strings_2 {
	public static void main(String[] args) {
		 String str = "w3resource.com";
		 System.out.println("Original String : " + str);
		 // codepoint before index 1
		 int val1 = str.codePointBefore(1);
		 // codepoint before index 9
		 int val2 = str.codePointBefore(9);
		 // prints character before index1 in string
		 System.out.println("Character(unicode point) = " + val1);
		 // prints character before index9 in string
		 System.out.println("Character(unicode point) = " + val2);
		 }

}

