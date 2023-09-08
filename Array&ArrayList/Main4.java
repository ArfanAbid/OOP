import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
// Declaring Array
        ArrayList<String> Language = new ArrayList<>();
//Adding 

        Language.add("Java");
        Language.add(("C++"));
        Language.add("Python");
        System.out.println("ArrayList" + Language;
 //Accessing

        String Str = Language.get(1);
        System.out.println("Channel of index 1 :" + Str);
// Setting/change
        Language.set(2,"Dart");
        System.out.println("Modified ArrayList : " + Language);
//Removing 
        String Str1 = Language.remove(2);
        System.out.println("Update value :" + Str1);

        System.out.println("After removing : "+Language);
// Clear
      Language.clear();
      System.out.println(Language);
      
    }
}

// ArrayList is Dynamic type list implementstion in java.ArrayList size automstically increases or decreased thats why it is called dynamic implementation.

// In java Array is fixed size so we cannot change its size so ArrayList is implemented which is free size. 
