//Write a Java program to get specific files with extensions from a specified folder.

package DAY_6;

import java.io.File;
import java.io.FilenameFilter;
public class Exercise2 {
     public static void main(String a[]){
      File file = new File("C:\\Users\\Pruthvi Raj\\OneDrive\\Documents\\Python Scripts");
         String[] list = file.list(new FilenameFilter() {
         @Override
          public boolean accept(File dir, String name) {
           if(name.toLowerCase().endsWith(".py")){
                  return true;
              } else {
                  return false;
              }
          }
      });
      for(String f:list){
          System.out.println(f);
      }
  }
}



