//ArrayList is a dynamic array implementation in Java that provides resizable arrays. It is part of the Java Collections Framework and is present in the java.util package. ArrayList allows you to store and manipulate elements of any type, including objects.



import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements using index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modifying an element
        fruits.set(1, "Mango");
        System.out.println("Modified fruits: " + fruits);

        // Removing an element
        fruits.remove(2);
        System.out.println("After removing element: " + fruits);

        // Checking if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Iterating over the ArrayList using a for-each loop
        System.out.println("Elements in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("After clearing the ArrayList: " + fruits);

// ##############################################
        
          ArrayList<String> fruits1 = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        boolean containsApple = fruits1.contains("Apple");
        System.out.println("Contains Apple? " + containsApple); // Output: true
        
        boolean containsGrapes = fruits1.contains("Grapes");
        System.out.println("Contains Grapes? " + containsGrapes); // Output: false
        
              //###############################################
              ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Orange");
        
        int index = fruits2.indexOf("Banana");
        System.out.println("Index of Banana: " + index); // Output: 1
        
        int nonExistentIndex = fruits2.indexOf("Grapes");
        System.out.println("Index of Grapes: " + nonExistentIndex); // Output: -1
         //#####################################
        
              ArrayList<String> fruits3 = new ArrayList<>();
        fruits3.add("Apple");
        fruits3.add("Banana");
        
        ArrayList<String> additionalFruits = new ArrayList<>();
        additionalFruits.add("Orange");
        additionalFruits.add("Mango");
        
        fruits3.addAll(additionalFruits);
        System.out.println("Fruits after adding additional fruits: " + fruits3);
        // Output: [Apple, Banana, Orange, Mango]
        
        //---->> Also see subList
              
    }
}
