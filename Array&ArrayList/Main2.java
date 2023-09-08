// Also concept of WrapperClass

import java.util.ArrayList;
class Main2 {
  public static void main(String[] args) {
    //------------------->>>1
    ArrayList<Integer> myName=new ArrayList<Integer>();
    myName.add(10);
    myName.add(20);
    myName.add(30);
    myName.add(40);
    myName.add(50);

    for(int i: myName){
      System.out.println(i);
    }
//--------------------->>>2

      Integer myInt=5;
      Double myDouble=2.5;
      Character myChar='A';
     System.out.println(myInt);
      System.out.println(myDouble);
     System.out.println(myChar);
// Converting to premitive data type
       System.out.println(myInt.intValue());
      System.out.println(myDouble.doubleValue());
     System.out.println(myChar.charValue());

//------------------------>>>3

   Integer obj1=Integer.valueOf(5);
    Double obj2=Double.valueOf(22);
    int a=obj1.intValue();
    double b=obj2.doubleValue();

     System.out.println("The Value of a is: "+a);
       System.out.println("The Value of b is: "+b);

    // Note:Java compiler can convert   Wrapping obj to premitive data type 
      
    //------------------------>>>4
    Integer x=200;
    String myString=x.toString();
    System.out.println("The length of the string :is "+myString.length());
    
  }
}
//Note:: It's important to note the difference in syntax between arrays and strings. Arrays use .length as a property (numbers.length), while strings use .length() as a method (message.length()).
