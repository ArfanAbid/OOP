class Car{
  String name;
  int model;
  static int wheels=4;
  static int seats=5;

  public static void display(Car car){
    System.out.println("name of car is "+car.name);
    System.out.println("model of car is "+car.model);
    System.out.println("wheels of car is "+wheels);
    System.out.println("seats  of car is "+seats);
  }
}

class Main6 {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.name = "Cultus";
    c1.model = 567;
    Car.display(c1);
  }
}
