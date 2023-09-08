class Vehicle {
    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private int numDoors;

    Car(String brand, int numDoors) {
        super(brand); // Call the constructor of the superclass (Vehicle)
        this.numDoors = numDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call the displayInfo() method of the superclass (Vehicle)
        System.out.println("Number of doors: " + numDoors);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.displayInfo();
    }
}

// Note:

// 1. Invoking the superclass constructor using super must be the first statement in the subclass’s constructor

// 2. imp--->> If the keyword super is not explicitly used, the superclass's no-arg constructor is automatically invoked (as the first statement in the constructor) (Involving concept of inheritence)



