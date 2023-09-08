//  Exceptions are runtime errors caused by your program and external circumstances

// Types of Exception :
// 1.Checked : compile Time example opening file
// 2. Unchecked: Run Time example integer divides by zero

public class Main12{
  public static void main(String[] args){
    

  int a=2;
  int b=0;

  try{
    double Divide=a/b;
  
  }
catch(Exception e){
  System.out.println(e.getMessage());
}
}
    }
