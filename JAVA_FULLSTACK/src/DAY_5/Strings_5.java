//5. Write a java program to print current date and time in the specified format.


package DAY_5;
import java.util.Calendar;
public class Strings_5 {
	public static void main(String[] args) {
		 Calendar c = Calendar.getInstance();
		 System.out.println("Current Date and Time :");
		 System.out.format("%tB %te, %tY%n", c, c, c);
		 System.out.format("%tl:%tM %tp%n", c, c, c);
		 }

}
