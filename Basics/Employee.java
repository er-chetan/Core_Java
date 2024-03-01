public class Employee {
    int EmpNO;
    String EmpName,Department,Designation ;
    float Salary;

    public Employee(int Enum,String Ename,String d,String dep,float s){
            this.EmpNO=Enum;
            this.EmpName=Ename;
            this.Designation=d;
            this.Department=dep;
            this.Salary=s;
    }
    public void display(){
        System.out.println("Emp.No   Emp Name   Department    Designation    Salary");
        System.out.println(this.EmpNO+"   "+this.EmpName+"   "+this.Department+"   "+this.Designation+"   "+this.Salary);
    }
    public static void main(String[] args) {
        

//        Employee e1=new Employee();
//        Employee

    }
}
