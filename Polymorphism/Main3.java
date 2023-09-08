// second type is Runtime /Dynamic polymorphism
// it is achieve by Overriding concept 

class parent {
  public void raise(){
    System.out.println("Hello this is parent class");
  }
}
class child1 extends parent {
  public void raise(){
    System.out.println("Hello this is child1 class");
  }
}
class child2 extends parent {
  public void raise(){
    System.out.println("Hello this is child2 class");
  }
}

class Main3 {
  public static void main(String[] args) {
  parent p=new child1();  // here parent is refer class object and child1 is main accessing class 
    p.raise();// it check wether in parent class there is raise method if it is there then at runtime it decides that child1 method to call
    parent p1=new child2();
    p1.raise();
    
  }
}
// Note: there should be inheritence implemented in order to access polymorphism
