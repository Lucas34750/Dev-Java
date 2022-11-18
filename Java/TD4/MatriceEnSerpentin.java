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
            }
            else {
                for (int j = taillemat-1; j >= 0; j--) {
                    tab[i][j] = x;
                    x = x + 1;
                }
            }
        }
    }
    /**
     * Donnée : 1 Matrice cubique
     * Résultat :renvoie rien mais transforme la matrice insérer en matrice
     *           étant constitué d'entiers de 1 a la taille de la matrice au carré
     *           disposer dans celle-ci en serpent en commencant de la gauche vers le droite
     *           puis de la droite vers la gauche a chaque fois que l'on change de ligne cela
     *           s'inverse
     */

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
                for (int j = n-1; j >= 0; j--) {
                    tab[i][j] = x;
                    x = x + 1;
                }
            }
        }
        return tab;
    }
    /**
     * Donnée : 1 entier naturel
     * Résultat :renvoie une matrice avec comme taille l'entier donné et étant constitué d'entiers de 1 a
     *           la taille de la matrice au carré disposer dans celle-ci en serpent en commencant de la gauche
     *           vers le droite puis de la droite vers la gauche a chaque fois que l'on change de ligne cela s'inverse
     */
}
