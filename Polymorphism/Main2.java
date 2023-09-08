
// first type is :Compiletime  /static Polymorphism
// it is achieved by method overloading/ operator over loading

class Parent{
        Parent(){
        System.out.println("This is simple constructor");
        }
        Parent(int a){
        System.out.println("This is a constructor with value of a is: "+a);
        }
        Parent(int a,double b){
        System.out.println("This is constructor with value of a is "+a +"and b is:"+b );
        }
        }
        public class Main2 extends Parent{
          public static void main( String[] args){
        Parent p1=new Parent();// calling siimple constructor
        Parent p2=new Parent(6);// calling  constructor with a
        Parent p3=new Parent(7,9.8);// calling  constructor with a and b

        }
        }
//Note: It must inplement the concept of inheritence inorder to achieve polymorphism
