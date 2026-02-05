import java.util.Scanner;
class inputtwodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][3]; // 2 rows, 3 columns
        // Taking input
        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++) {          // rows
            for (int j = 0; j < a[i].length; j++) {   // columns
                a[i][j] = sc.nextInt();
            }
        }
        // Printing output
        System.out.println("2D Array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//armstrong number (cube of each digit equal to its given number);