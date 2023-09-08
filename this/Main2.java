// Only one variable in class test then we use this  

class test{
  int a;
  void setValue(int i){
    this.a=i;
  }
  void show(){
    System.out.println("The value of i is:" + a);
  }
}
class  Main{
  public static void main(String[] args){
    test t=new test();
    t.setValue(10);
    t.show();
  }
}

// 1. this kewword refers to current object inside a method or a constructor
// 2.whenever the name of instance and local variable both are same then our run time compiler JVM get confuse thatt which one is local or instance to avod this we use this
// 3. it is also uuse to call its own defaut constructor of its own class
// 4.it is also use or called peremeterized constructor od its own class
