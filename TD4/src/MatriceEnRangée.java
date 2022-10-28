public class MatriceEnRangée {
    public static void remplirCetteMatriceEnRangée(int[][] tab){
        int taillemat=tab.length;
        for(int i=0;i<taillemat;i++){
            for(int j=0;j<taillemat;j++){
                tab[i][j]=0;
            }
        }
        int x=1;
        for(int i=0;i<taillemat;i++){
            for(int j=0;j<taillemat;j++){
                tab[i][j]=x;
                x=x+1;
            }
        }
    }
    public static int[][] nouvelleMatriceEnRangée(int n){
        int x=1;
        int[][] tab =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tab[i][j]=x;
                x=x+1;
            }
        }
        return tab;
    }
}
