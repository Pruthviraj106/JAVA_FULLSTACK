/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box. 
The dimensions of the Box are width, height, depth. The class should have a method that can 
return the volume of the box.Create an object of the Box class and test the functionalities.
*/
package DAY_4;
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }
}

public class Hands_On_Assignment_1 {
	 public static void main(String[] args) {
	        Box myBox = new Box(5.0, 3.0, 2.0);

	        double volume = myBox.getVolume();
	        System.out.println("Volume of the box: " + volume);
	    }

}
