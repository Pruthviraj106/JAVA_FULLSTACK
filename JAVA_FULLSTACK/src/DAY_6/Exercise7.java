//Write a Java program to determine the last modified date of a file.

package DAY_6;

import java.io.File;
import java.util.Date;

public class Exercise7 {
       public static void main(String[] args) {
       File file = new File("C:\\\\Users\\\\Pruthvi Raj\\\\OneDrive\\\\Documents\\\\CC_prg1.pdf");
       Date date=new Date(file.lastModified());
	   System.out.println("\nThe file was last modified on: "+date+"\n");	   
     }
}
