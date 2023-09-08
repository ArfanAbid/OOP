// Wrapper class Example

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer > myNumber = new ArrayList<Integer>();
        myNumber.add(20);
        myNumber.add(10);
        myNumber.add(40);
        for (int i : myNumber){
            System.out.println(i);
        }
//##########################
        Integer myInt = 5;
        Double myDouble = 5.9;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
//#############################

        // Integer aObj = Integer.valueOf(23);
        // Double bObj = Double.valueOf(2.2);
      Integer aObj = 23;
        Double bObj =2.2;
        int a = aObj.intValue();
        double b = bObj.doubleValue();
        System.out.println("The value of a " + a);
        System.out.println("The value of b " + b);

        /* here we use int value function and double to convert int and double object int corresponding premitive type.
        Java compiler automatically converts object into corresponding data type and for example
        Wrapping object automatically converted to premitive type while permitive data type converted to wrapping data type
        We can store null value in wrap object
         */

        Integer a1Obj = Integer.valueOf(23);
        int a1 = aObj;
        Double b1Obj = Double.valueOf(2.2);
        double b1 = bObj;
       System.out.println("The value of a1obj " + a1);

        Integer myInt1 = 100;
        String myString = myInt1.toString();
        System.out.println(myString.length());

//        int a1 = null;  Throughs an error
        //Integer a2 = null;


           }
}

