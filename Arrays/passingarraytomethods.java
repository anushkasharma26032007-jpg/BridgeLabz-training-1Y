package Arrays;

public class passingarraytomethods {
    public static void change(int []arr){
       arr[1] = 54;
    }
    public static void main() {
        int []arr={12,23,34,45};
        System.out.println(arr[1]);
       change(arr);
        System.out.println(arr[1]);
    }
}
