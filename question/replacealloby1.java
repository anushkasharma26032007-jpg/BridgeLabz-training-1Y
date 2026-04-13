package classroomcode.question;
public class replacealloby1 {
   public  static void main(String[] args) {
        String s = "10010";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                result += '1';
            } else {
                result += s.charAt(i);
            }
        }

        System.out.println(result);
    }
}