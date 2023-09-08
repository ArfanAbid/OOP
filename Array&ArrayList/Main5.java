public class Main5 {
    public static void main(String[] args){
        double[] myList = new double[10];   

        printArray(myList);
        
   }
    public static void printArray(double[]  array) {
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
    }
}

// Note:  When passing an array to a method, the reference of the array is passed to the method.
