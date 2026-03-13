package Storybasedproblem;
class Course{
    int courseId;
    String courseName;
    double price;
    static String platformName="LearnHub";

    Course(int id,String name,double price){
        courseId=id;
        courseName=name;
        this.price=price;
    }

    double getFinalPrice(){
        return price;
    }
}

class RecordedCourse extends Course{

    RecordedCourse(int id,String name,double price){
        super(id,name,price);
    }

    double getFinalPrice(){
        return price-(price*0.10);
    }
}

class LiveCourse extends Course{

    LiveCourse(int id,String name,double price){
        super(id,name,price);
    }

    double getFinalPrice(){
        return price-(price*0.05);
    }
}

public class CourseTest {
    public static void main(String[] args){

        Course c1=new RecordedCourse(1,"Java Programming",5000);
        Course c2=new LiveCourse(2,"Python Course",6000);

        System.out.println("Platform: "+Course.platformName);

        System.out.println("Recorded Course Price: "+c1.getFinalPrice());
        System.out.println("Live Course Price: "+c2.getFinalPrice());
    }
}
