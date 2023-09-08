// Like an abstract class, you cannot create an instance from an interface using the new operator
//


interface engine{
    public void accelerate(); // Abstract method
    public void start();  //Abstract Method
    public void stop(); //Abstract Method

     public static void horn(){              // Static method should be implemented in interface as a default because it does not require object
         System.out.println("Horn.....");
     }
//Note: we can also create default maetod like:
     public default void Mediaplayer(){
         System.out.println("Playing Media player...");
     }
}

class Cars implements engine {



    @Override
    public void accelerate() {
        System.out.println("Speeding the car");
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void stop() {
        System.out.println("Stoping the Car");
    }
}
 class Bike implements engine {

     @Override
     public void accelerate() {
         System.out.println("Speeding the Bike");
     }

     @Override
     public void start() {
         System.out.println("Starting the Bike...");
     }

     @Override
     public void stop() {
         System.out.println("Stoping the Bike");
     }
 }

class Main2{
    public static void main(String[] args) {
        Cars c=new Cars();
        c.start();
        c.accelerate();
        c.stop();
     // For Bike:
        Bike b=new Bike();
        b.start();
        b.accelerate();
        b.stop();

        engine.horn();  // static method with interface name

    c.Mediaplayer(); // Default method in interface
    }

}
