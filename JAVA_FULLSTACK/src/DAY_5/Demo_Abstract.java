package DAY_5;
abstract class Vehicle {
    abstract void makeSound();

    void fuelType() {
        System.out.println("Most vehicles run on petrol or diesel.");
    }
}

class Car extends Vehicle {
    void makeSound() {
        System.out.println("Car goes vroom!");
    }
}

class Bike extends Vehicle {
    void makeSound() {
        System.out.println("Bike goes brmmm!");
    }
}

public class Demo_Abstract {
	public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.makeSound();
        v1.fuelType();

        Vehicle v2 = new Bike();
        v2.makeSound();
        v2.fuelType();
    }

	

}
