package Storybasedproblem;
class Employee{
    int empId;
    String name;

    Employee(int id,String name){
        empId=id;
        this.name=name;
    }

    String generateEmail(){
        return name.toLowerCase()+"@company.com";
    }
}

class Manager extends Employee{

    String department;

    Manager(int id,String name,String dept){
        super(id,name);
        department=dept;
    }

    String generateEmail(){
        return name.toLowerCase()+"."+department.toLowerCase()+"@company.com";
    }
}

public class EmployeeTest {

    public static void main(String[] args){

        Employee e1=new Employee(1,"Rahul");
        Employee e2=new Manager(2,"Aman","HR");

        System.out.println(e1.generateEmail());
        System.out.println(e2.generateEmail());
    }
}
