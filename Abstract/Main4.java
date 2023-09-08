abstract class Shape {
    int sides;

    Shape(int sides) {
        this.sides = sides;
    }

    // Abstract method to calculate the area
    abstract double calculateArea();

    // Concrete method
    void displaySides() {
        System.out.println("Number of sides: " + sides);
    }
}

class Square extends Shape {
    int sideLength;

    Square(int sideLength) {
        super(4);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Cannot create an instance of an abstract class
        // Shape shape = new Shape(); // This will result in an error

        // Create an instance of a concrete subclass
        Square square = new Square(5);
        square.displaySides();
        System.out.println("Area of the square: " + square.calculateArea());
    }
}
// An object cannot be created from an abstract class
// Superclass of abstract class may be concrete
// Remember, an abstract class cannot be instantiated using the new operator
