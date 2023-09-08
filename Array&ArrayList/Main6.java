
import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {

        ArrayList<String> Language = new ArrayList<>();
        Language.add("Java");
        Language.add(("C++"));
        Language.add("Python");
        System.out.println("ArrayList" + Language);

        String Str = Language.get(1);
        System.out.println("Channel of index 1 :" + Str);

        Language.set(2,"Dart");
        System.out.println("Modified ArrayList : " + Language);

        String Str1 = Language.remove(2);
        System.out.println("Update value :" + Str1);

        System.out.println("After removing : "+Language);
    }
}
