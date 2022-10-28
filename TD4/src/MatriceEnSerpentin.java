public class MatriceEnSerpentin {

    public static void remplirCetteMatriceEnSerpentin(int [][] tab){
        int taillemat=tab.length;
        for(int i=0;i<taillemat;i++){
            for(int j=0;j<taillemat;j++){
                tab[i][j]=0;
            }
        }
        int x = 1;
        for (int i = 0; i < taillemat; i++) {
            if (i == 0 || i == 2) {
                for (int j = 0; j < taillemat; j++) {
                    tab[i][j] = x;
                    x = x + 1;
                }
            } else {
                for (int j = 3; j >= 0; j--) {
                    tab[i][j] = x;
                    x = x + 1;
                }
            }
        }

    }

    public static int[][] nouvelleMatriceEnSerpentin(int n) {
        int x = 1;
        int y = 0;
        int[][] tab = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 2) {
                for (int j = 0; j < n; j++) {
                    tab[i][j] = x;
                    x = x + 1;
                }
            } else {
                for (int j = 3; j >= 0; j--) {
                    tab[i][j] = x;
                    x = x + 1;
                }
            }
        }
        return tab;
    }
}
