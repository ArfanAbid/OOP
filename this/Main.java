public class Main {

    void show(){
        System.out.println("hello");
    }
  
    Main(){
    System.out.println("Learning code");
    }
    Main(int a){ 
    this();                // Refer to Main() method
    System.out.println(a);    // print value of a that is: 100
            }
    
    public static void main(String args[]) {
        Main r=new Main();
        Main r1=new Main(100);
        r.show();
    }
   }
