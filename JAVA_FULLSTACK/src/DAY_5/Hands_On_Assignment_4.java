/*Create a class called Author that includes the member variables: name (of type String),
 *  email (of type String), and gender (of type char).Provide a parameterized constructor to initialize
 * these variables.
 *  
 *   Next, create another class called Book, which should include the member variables: name (String), 
 *   author (which is an object of the Author class), price (double), and qtyInStock (int).It is 
 *   assumed that each book is written by exactly one author Provide a parameterized constructor to 
 *   initialize all the variables, along with appropriate  getter and setter methods for each member variable. 
 *    
 *    Finally, in the main method, create a Book object and print out all the details of the book, 
 *    including the details of the associated author.

*/

package DAY_5;

class Author {
 private String name;
 private String email;
 private char gender;

 public Author(String name, String email, char gender) {
     this.name = name;
     this.email = email;
     this.gender = gender;
 }

 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 public char getGender() {
     return gender;
 }

 public String toString() {
     return name + " (" + gender + ") at " + email;
 }
}

class Book {
 private String name;
 private Author author; 
 private double price;
 private int qtyInStock;

 public Book(String name, Author author, double price, int qtyInStock) {
     this.name = name;
     this.author = author;
     this.price = price;
     this.qtyInStock = qtyInStock;
 }

 public String getName() {
     return name;
 }

 public Author getAuthor() {
     return author;
 }

 public double getPrice() {
     return price;
 }

 public int getQtyInStock() {
     return qtyInStock;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public void setQtyInStock(int qtyInStock) {
     this.qtyInStock = qtyInStock;
 }

 public String toString() {
     return "Book: " + name +
            "\nAuthor: " + author +
            "\nPrice: ₹" + price +
            "\nStock: " + qtyInStock;
 }
}

public class  Hands_On_Assignment_4 {

 public static void main(String[] args) {
     Author author = new Author("R. K. Narayan", "rk@example.com", 'M');
     Book book = new Book("Malgudi Days", author, 350.00, 100);
     System.out.println("--- Book Details ---");
     System.out.println(book);
 }
}
