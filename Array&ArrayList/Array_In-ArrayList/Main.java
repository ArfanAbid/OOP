import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        // Create an ArrayList that will hold arrays of integers
        ArrayList<int[]> arrayList = new ArrayList<>();

        // Create an array of integers
        int[] array1 = {1, 2, 3};

        // Add the array to the ArrayList
        arrayList.add(array1);

        // Create another array of integers
        int[] array2 = {4, 5, 6};

        // Add the second array to the ArrayList
        arrayList.add(array2);

        // Accessing elements in the ArrayList
        int[] retrievedArray = arrayList.get(0);  //index of ArrayList
        System.out.println("Elements in the first array:");
        for (int element : retrievedArray) {
            System.out.println(element);
        }

        // Accessing elements in the second array
        retrievedArray = arrayList.get(1);//index of ArrayList
        System.out.println("Elements in the second array:");
        for (int element : retrievedArray) {
            System.out.println(element);
        }
    }
}
