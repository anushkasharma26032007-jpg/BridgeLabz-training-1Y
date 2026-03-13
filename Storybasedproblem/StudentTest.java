package Storybasedproblem;
class Student{
int rollNo;
String name;
int marks;

Student(int roll,String name,int marks){
    rollNo=roll;
    this.name=name;
    this.marks=marks;
}

void calculateGrade(){
    if(marks>=80)
        System.out.println("Grade A");
    else if(marks>=60)
        System.out.println("Grade B");
    else
        System.out.println("Grade C");
}
}

class EngineeringStudent extends Student{

    String branch;

    EngineeringStudent(int roll,String name,int marks,String branch){
        super(roll,name,marks);
        this.branch=branch;
    }

    void display(){
        System.out.println("Name: "+name+" - "+branch);
        calculateGrade();
    }
}

public class StudentTest {

    public static void main(String[] args){

        EngineeringStudent s=
                new EngineeringStudent(1,"Aman",85,"CSE");

        s.display();
    }
}
