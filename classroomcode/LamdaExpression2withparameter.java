package classroomcode;
interface Add{
    int sum(int a,int b);
}
public class LamdaExpression2withparameter {

    public static void main(String[] args) {
        Add obj = (a,b) ->a+b;
        System.out.println(obj.sum(3,5));
    }
}
