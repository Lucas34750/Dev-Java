public class MatriceEnDiagonale {
    public static int[][] nouvelleMatriceEnDiagonale(int n) {
        int x=0;
        int y=0;
        int[][] tab =new int[n][n];
        for(int i=1;i<=n;i++){
            x=0;
            y=i-1;
            for(int j=1;j<=i;j++){
                tab[x][y]=i;
                x++;
                y--;

            }
        }

        return tab;
    }
}
