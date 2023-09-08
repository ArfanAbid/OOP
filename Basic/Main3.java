class Car{
String color;
int modelnumber;

void display(){
System.out.println("modelnumber is "+modelnumber);
  System.out.println("color is "+color);

}
public void  assign(int m,String c){
this.color=c;
 this.modelnumber=m;
}

}
class Main3{
public static void main(String[] args){


Car c1=new Car();
c1.assign( 466,"blue");
c1.display();
  
Car c2=new Car();
  c1.assign(7947,"Silver");
c1.display();



}
}
