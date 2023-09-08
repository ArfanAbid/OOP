class Car{
  static String name="swift";
  static String color="red";
  int model=456;

  
public static class Car1{
  public static void show(){
     System.out.println(name);
  }

}
  class Car3{
    void Display(){
    System.out.println("name of car is"+name+"color is "+color+"model is"+model);
  }
  }

  
}
class Main8 {
  public static void main(String[] args) {
  Car.Car1.show();
     Car.Car3 obj=new Car().new Car3();
    obj.Display();
  }
}
