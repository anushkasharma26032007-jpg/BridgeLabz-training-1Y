package Arrays;

import java.util.StringTokenizer;

public class stringtoken {
    static void main(String[] args) {
        String str ="java is easy";
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }


    }
}
