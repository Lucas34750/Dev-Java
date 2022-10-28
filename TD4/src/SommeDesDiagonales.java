public class SommeDesDiagonales{
    public static int sommeDesDiagonales(int[][] t1){
        int l=t1.length;
        int x=0;
        int j=l-1;
        for(int i=0;i<l;i++){
            x+=t1[i][i];
        }
        for(int i=0;i<l;i++){
            x+=t1[j][i];
            j--;
        }
        if(l%2==1){
            x-=t1[l/2][l/2];
        }
        return x;
    }
    /**
     * Donnée : une matrice carré remplie d'entiers.
     * Résultat :renvoie un entier qui représentera la somme des 2 diagonales de la matrice.
     */
}
