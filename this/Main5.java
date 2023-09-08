    class A{
	int b;
	A(int a){
		this();
		b=a;
	
	}
	A(){
	this.show();
	}
	void show(){
		System.out.println("The Value of b is " + b);
	}
}
public class Main5 {
	public static void main(String[] args) {
		A t=new A(10);
		t.show();
	}
}
