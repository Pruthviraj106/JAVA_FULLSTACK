package DAY_5;
import java.util.Scanner;

class Student {
 private String name;
 private int age;

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Invalid age. Must be positive.");
     }
 }
}

public class Demo_Encpsulation {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Student student = new Student();

     System.out.print("Enter student name: ");
     String nameInput = scanner.nextLine();
     student.setName(nameInput);  // use setter

     System.out.print("Enter student age: ");
     int ageInput = scanner.nextInt();
     student.setAge(ageInput);   // use setter with validation

     System.out.println("\nStudent Details:");
     System.out.println("Name: " + student.getName());
     System.out.println("Age: " + student.getAge());


 }
}
