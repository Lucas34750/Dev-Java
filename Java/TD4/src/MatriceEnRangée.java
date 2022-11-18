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
    /**
     * Donnée : 1 matrice cubique.
     * Résultat :renvoie rien mais transforme la matrice insérer en matrice
     *           étant constitué d'entiers de 1 a la taille de la matrice au carré
     *           disposer dans celle-ci de gauche a droite.
     */
    public static int[][] nouvelleMatriceEnRangée(int n){
        int x=1;
        int[][] tab =new int[n][n];
        remplirCetteMatriceEnRangée(tab);
        return tab;
    }
    /**
     * Donnée : 1 entier naturel
     * Résultat :renvoie une matrice avec comme taille l'entier donné et étant constitué d'entiers de 1 a
     *           la taille de la matrice au carré disposer dans celle-ci de gauche a droite.
     */
}
