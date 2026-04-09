package dailypractice;

class emplayee{
    private int salary;

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}
public class TestEnployee {
    public static void main(String[] args) {
      emplayee s1=new emplayee();
      s1.setSalary(80000);
        System.out.println(s1.getSalary());
    }
}
