 abstract class Animal {
String color;
String breed;
Animal(String color,String breed)
{
	this.color = color;
	this.breed = breed;
	System.out.println(color +" "+ breed);
}
abstract void speak();
abstract void  eat();
}
class Cat extends Animal {
	Cat()
	{
		super("White","Persian");	
	
	}
	@Override
	void speak() {
		System.out.println("Cat meows");
	}

	@Override
	void eat() {
		System.out.println("Cat eats fish");
		
	}
	public String toString()
	{
		return(color + "\n" + breed);
}
	

}
 class Dog extends Animal{
	Dog()
	{
		super("Black","German Shepherd");
	}

	@Override
	void speak() {
		System.out.println("Dog barks");
		
	}

	@Override
	void eat() {
		System.out.println("Dog eats meat");
		
	}
}


class Main2 {
  public static void main(String[] args) {
		Cat mano = new Cat();
		System.out.println(mano.toString());
        mano.eat();
  }
}
