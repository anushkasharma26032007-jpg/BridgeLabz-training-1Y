package dailypractice;
class identity{
    private String name;
     int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
public class bachha {
    public static void main(String[] args) {
        identity s1 =new identity();
        s1.setName("anushka sharma ji");
        s1.rollno=999;
        System.out.println(s1.getName());
        System.out.println(s1.getRollno());
    }

}
