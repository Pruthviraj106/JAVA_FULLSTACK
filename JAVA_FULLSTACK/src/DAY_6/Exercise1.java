//Write a Java program to get a list of all file/directory names in the given directory.


package DAY_6;
import java.io. File; 
import java.util.Date;

public class Exercise1 { public static void main(String a[])

{

File file = new File("C:\\Users\\Pruthvi Raj\\Downloads");

String[] fileList = file.list();

for(String name: fileList){

System.out.println(name);

}

}

}