package classroomcode;

import java.util.Locale;

interface Length{
    int getLength(String s);
}
public class LamadaExpressiontoFindLength {
    static void main() {
        Length obj = (s)->s.length();
        System.out.println(obj.getLength("Anushka Sharma #(ji)"));
    }

}
