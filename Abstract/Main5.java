// Abstract is declaring method in one class and implementing its concept in its sub class
// when declaring abstract method its class must also be abstract

abstract class  parent {
        abstract  void greeting();
        }

class Abstract  extends parent {
        void  greeting(){
            System.out.println("This is greeting method which is abstract ");

        }

}
 class Main5{
     public static void main(String[] args) {
   Abstract a=new Abstract();
   a.greeting();
     }
 }
