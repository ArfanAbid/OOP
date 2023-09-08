// The toString() method returns a string representation of the object
// • The default implementation returns a string consisting of a class name of which the object is an instance, the at sign (@), and a number representing this object
// • For example
// Loan loan = new Loan();
// System.out.println(loan.toString());
// – The code displays something like Loan@15037e5
// – This message is not very helpful or informative
// – Usually, you should override the toString method so that it returns a digestible string representation of the object


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

public class Main11 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println(person); // Output: Person[name=John Doe, age=30]
    }
}
