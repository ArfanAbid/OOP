//Write a program of class Employee having variable nam,id,salry also implement setter getter ,constructor ,3 object and compare highest salary


class Employee{
    private int id;
    private int salary;
    private String name;
    Employee(){
        name="Arfan";
        id=55;
        salary=2000;

    }
    public void setId(int i){
        id=i;
    }
    public void setSalary(int s){
        salary=s;
    }
    public void setName(String n ){
        name=n;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void compare(Employee o){
        if(this.salary>o.salary){
            System.out.println("Greater Salary is" + o.salary );
        }
        else
            System.out.println("Less Salary " +this.getSalary() );   //  OR  this .salary



    }

}

class Info{
    public static void main(String[] args){

        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.setId(55);
        e2.setId(10);
        e3.setId(33);

        e1.setName("arfan");
        e2.setName("Iffi");
        e3.setName("Veer");

        e1.setSalary(1000);
        e2.setSalary(2000);
        e3.setSalary(3000);

        e1.compare(e2);




    }
}


