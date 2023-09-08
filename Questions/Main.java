class Car{
  String color;
  int model;
  int price;
  // constructor example:
   Car(){
  System.out.println("This is Constructor ");

  }
  
  
   // Overloading exampless:
  
  Car(String color,int model){
  System.out.println("Overloading example :");

  System.out.println("Colour is :" +color);
  System.out.println("Model is :" +model);    
  System.out.println("Call for price");    

  }
  Car(String color,int model,int  price){
  System.out.println("Overloading example :");
    
  System.out.println("Colour is :" +color);
  System.out.println("Model is :" +model);    
  System.out.println("Price is :" +price);    

  }

 
}


class Main {
  public static void main(String[] args) {
    Car c1=new Car();
    Car c2=new Car("Silver",16,240000);
    Car c3=new Car("Silver",16);
   


    
    
    
  }
}
