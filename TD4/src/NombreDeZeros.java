public class NombreDeZeros{
    public static int nombreDeZeros(int[][] t1){
        int c=t1[0].length;
        int l=t1.length;
        int x=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                if(t1[i][j]==0){
                    x++;
                }
            }
        }
        return x;
    }
    /**
     * Donnée : une matrice remplie d'entiers.
     * Résultat :renvoie un entier qui représentera le nombre de zeros qu'il y a dans la matrice donné.
     */
}
