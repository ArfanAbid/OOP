class A{
  A(){
    System.out.println("hello i am replit");
  }
  
}
class B extends A{
  B(String p,String j,String c){
      super ();
    String python=p;
    String java=j;
    String canva=c;
   
  }
  
  void Show(){
    System.out.println("i can perform task in diff language");
  }

}
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    B obj=new B("Smith","john","Wick");
    obj.Show();
  }
}
