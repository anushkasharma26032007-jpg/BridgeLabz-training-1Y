package classroomcode;
interface StringLength{
    int length(String s);
}
public class LamdaExpressionforlength2 {
    static void main() {
        StringLength sl= (String a)->{return a.length();};
        System.out.println(sl.length("Anushka ji"));
    }

}
