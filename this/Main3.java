// 1. this kewword refers to current object inside a method or a constructor
// 2.whenever the name of instance and local variable both are same then our run time compiler JVM get confuse thatt which one is local or instance to avod this we use this
// 3. it is also uuse to call its own defaut constructor of its own class
// 4.it is also use or called peremeterized constructor od its own class

class test {
  int b;
  test(){
    System.out.println("This is default constructot");
  }
  test(int a){
    this();
      b=a;
    this.show();
     System.out.println("Hello g");

    
  }
  
  void show(){
   System.out.println("The value of a is:"+ b);
  }
  
}
class Main {
  public static void main(String[] args) {
    test t=new test(10);
     // t.show();
    
  }
}
// NOTE:The correct syntax to call a constructor from another constructor is this() and it can only be called from a constructor, not from a method.


//  One common use of the this keyword is to reference a hidden class member
