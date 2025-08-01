//Write a Java program to check if a file or directory specified by pathname exists or not.
package DAY_6;

import java.io.File;
public class Exercise3 {
       public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\Pruthvi Raj\\OneDrive\\Documents\\CC_prg1.pdf");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
       }
  }
