// # EXAMPLE OF ABSTRACT 

abstract class Animal{
public abstract void  eat();
  int legs=4; 
}
class Cat extends Animal{
  void Sound(){
    System.out.println("meeaww");}

   public  void eat(){
      System.out.println("i love to eat meat");
    }
  }
  

class Dog extends Animal{
  
   void sound(){
    System.out.println("baw baw");
  }
  public void eat(){
    System.out.println("i love to eat cats hahahahah");
  }
  
}
class Main {
  public static void main(String[] args) {
    Cat c = new Cat();
   System.out.println(c.legs);
    c.Sound();
    Dog d=new Dog();
    System.out.println(d.legs);
    d.eat();
   d.sound();
  }
}
