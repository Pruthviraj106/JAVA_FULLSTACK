//6. Write a Java program to create a unique identifier of a given string. 
//Hash Code is the memory address location

package DAY_5;

public class Strings_6 {
	public static void main(String[] args)
	 {
	 String str = "Python Exercise.";
	 // Get the hash code for the above string.
	 int hash_code = str.hashCode();
	 // Display the hash code.
	 System.out.println("The hash for " + str +
	 " is " + hash_code);
	 }

}
