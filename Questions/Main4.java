class Vehical{
    String make;
    int model;
    public Vehical(String m,int M){
        make=m;
        model=M;

        System.out.println("brand of car is"+make+"model of  is"+model);
    }

    public void Start(){
        System.out.println("engine is started");
    }
    public void Stop(){
        System.out.println("engine is stop");
    }
}
class Car extends Vehical{
    String color;
    public Car(String m,int M,String c){
        super("suzuki",2020);
        // String color=c;.


    }
    //  @Override
    public void Start(){
        System.out.println("your car is started");
    }
    public void Stop(){
        System.out.println("your car is stoped");
    }

}
public  class Main4 {
    public static void main(String[] args) {
        Vehical v = new Vehical("Nissan", 2019);
        v.Start();
        Car c = new Car("ghh", 2000, "silver");
        c.Start();

    }
}

