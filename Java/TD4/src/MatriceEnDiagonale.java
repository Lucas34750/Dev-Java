public class MatriceEnDiagonale {
    public static void remplirCetteMatriceEnDiagonale(int[][] tab){
        int n=tab.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tab[i][j]=0;
            }
        }
        int x = 0;
        int y = 0;
        int z = 1;
        for (int i = 1; i <= n; i++) {
            x = 0;
            y = i - 1;
            for (int j = 1; j <= i; j++) {
                tab[y][x] = z;
                z++;
                x++;
                y--;
            }
        }
        int g=n+1;
        for(int i=1;i<n;i++){
            x=i;
            y=n-1;
            g--;
            for(int j=1;j<g;j++){
                tab[y][x] = z;
                z++;
                x++;
                y--;
            }
        }
    }
    /**
     * Donnée : 1 matrice cubique.
     * Résultat :renvoie rien mais transforme la matrice insérer en matrice
     *           étant constitué d'entiers de 1 a la taille de la matrice au carré
     *           disposer dans celle-ci en diagonales.
     */
    public static int[][] nouvelleMatriceEnDiagonale(int n) {
        int x = 0;
        int y = 0;
        int z = 1;
        int[][] tab = new int[n][n];
        for (int i = 1; i <= n; i++) {
            x = 0;
            y = i - 1;
            for (int j = 1; j <= i; j++) {
                tab[y][x] = z;
                z++;
                x++;
                y--;
            }
        }
        int g=n+1;
        for(int i=1;i<n;i++){
            x=i;
            y=n-1;
            g--;
            for(int j=1;j<g;j++){
                tab[y][x] = z;
                z++;
                x++;
                y--;
            }
        }
        return tab;
    }
    /**
     * Donnée : 1 entier naturel
     * Résultat :renvoie une matrice avec comme taille l'entier donné et étant constitué d'entiers de 1 a
     *           la taille de la matrice au carré disposer dans celle-ci en diagonale.
     */
}
