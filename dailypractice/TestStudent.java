package dailypractice;

class Student{
    String name ;
    int rollno ;
    void display(){
        System.out.println("NAME -"+name);
        System.out.println("ROLL NO- "+rollno);
    }

}
public class TestStudent {
   public  static void main(String[] args) {
       Student sc =new Student();
       sc.name ="Anushka sharma ji";
       sc.rollno=45;
       sc.display();
    }


}
