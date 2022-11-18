public class IlExisteUneLigneAvecPlusieursZeros{
    public static boolean ilExisteUneLigneAvecPlusieursZeros(int[][] tab){
        int i = 0;
        int j = 0;
        int x = 0;
        boolean y=false;
        while(i<tab.length){
            if(tab[i][j]==0){
                x++;
                if(x>1){
                    y=true;
                    i=tab.length;
                }
            }
            if(j<tab[0].length-1){
                j++;
            }
            else{
                i=i+1;
                j=0;
                x=0;
            }
        }
        return y;
    }
    /**
     * Donnée : une matrice remplie d'entiers.
     * Résultat :renvoie un boolean qui sera soit vrai soit faux
     *           en fonction de si dans la matrice il existe une ligne avec plusieurs zeros.
     */
}