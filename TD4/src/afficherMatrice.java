public class afficherMatrice {
    public static void afficherMatrice(int[][] T) {
        int c = T[0].length;
        int l = T.length;
        for (int i = 0; i < c; i++) {
            if(i>0){
                System.out.println();
            }
            for (int j = 0; j < l; j++) {
                System.out.print(T[i][j]+" ");
            }
        }
    }
}