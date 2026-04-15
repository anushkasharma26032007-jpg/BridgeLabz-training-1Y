package classroomcode;
interface number{
    String num(int n);
}
public class LamdaExpressiontofindNOisnegativeorpositive {
    public static void main(String[] args) {
        number obj=(n)->{
            if(n>0)return "positive";
            else if(n<0)return "negative";
            else return "Zero";
        };
        System.out.println(obj.num(5));
        System.out.println(obj.num(-9));
        System.out.println(obj.num(0));
    }

}


