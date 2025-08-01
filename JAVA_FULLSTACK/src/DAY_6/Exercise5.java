//Write a Java program to check if the given pathname is a directory or a file.

package DAY_6;

import java.io.File;
public class Exercise5 {
       public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\\\Users\\\\Pruthvi Raj\\\\OneDrive\\\\Documents\\\\CC_prg1.pdf");
         if (my_file_dir.isDirectory()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
          }
         if (my_file_dir.isFile()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a file.\n");
          }  
      }
  }
