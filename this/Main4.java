class Test {
  int a;
  Test() {
    System.out.println("This is the default constructor");
  }
  Test(int a) {
    this();
    System.out.println("The value of a is:"+ a);
  }
  
 
}
  class Main4{
  public static void main(String[] args) {
    Test t = new Test(10);
   
  }
}


// class Test {
//   Test() {
//     System.out.println("This is the default constructor");
//   }
  
//   Test(int a) {
//     this();
//     System.out.println("The value of a is: " + a);
//   }
// }
  
// class Main {
//   public static void main(String[] args) {
//     Test t = new Test(10);
//   }
// }

