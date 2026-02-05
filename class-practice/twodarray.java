class twodarray{
    public static void main(String[] args) {
        int[][] a = {
            {80 , 90},
            {70 , 85}
        };

        for(int i = 0; i < a.length; i++) {          // rows
            for(int j = 0; j < a[i].length; j++) {   // columns
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
