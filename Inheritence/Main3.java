class Parents {
     Parents(){
        System.out.println("This is parent constructor ");
    }
}
class Child1 extends Parents{
    Child1(){
        System.out.println("This is child 1 Constructor");
    }

}

public class  Main3 extends Child1 {
    Main3(){
        System.out.println("This is inheritence contructor");
    }
    public static void main(String[] args) {
    Main3 I=new Main3 ();

    }
}

// Note : When a constructor is called in main which extends child and
// that child extends parent the firstly it call a constructor of parent then child and then main constructor


// In other words it first see that the constructor in  inheritence/main is called it extends child1 then (it is going to make objec of chile but)
// it notice it is also extend by parens then it make object of parent first.  Below is explain scenerio
// 1. parent 
//2. Child 
//3. called constructor 

//Every class in Java is descended from the java.lang.Object class
//If no inheritance is specified when a class is defined, the superclass of the class is Object
