class Vehical{
  int no_tyres;
  void move(){
    System.out.println("vehical is moving");
  }
}
class Car extends Vehical{
  void move(){
    System.out.println("car is moving");}
  Car(){                  // car constructor
    super.move();
  }

}
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Vehical v=new Car();// here car constructor is called
    v.move();
    
  }
}
