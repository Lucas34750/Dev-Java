public class LigneAvecUnMaxDeZeros{
    public static int ligneAvecUnMaxDeZeros(int[][] t1){
        int c=t1.length;
        int l=t1[0].length;
        int [][] tab=new int[c][l];
        int x=0;
        int y=0;
        int z=1;
        for(int i=0;i<c;i++){
            for(int j=0;j<l;j++){
                if(t1[i][j]==0) {
                    tab[i][j]=1;
                }
                else{
                    tab[i][j]=0;
                }
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<l;j++){
                if(tab[i][j]==1){
                    x++;
                }
            }
            if(x>=y){
                y=x;
                x=0;
                z=i;
            }
            x=0;
        }
        return z+1;
    }
    /**
     * Donnée : une matrice remplie d'entiers.
     * Résultat :renvoie un entier qui sera le numéro de la ligne (1 étant la premiere ligne)
     *           dans laquelle il y a le maximum de zeros.
     *           (Attention s'il y a plusieurs lignes avec le meme nombre de zéros et qu'aucune autre ligne
     *           n'a plus de zeros qu'eux alors seulement le numéro de la ligne plus grand que les autres sera affiché)
     */
}
