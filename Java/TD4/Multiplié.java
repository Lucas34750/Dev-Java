public class Multiplié{
    public static int[][] Multiplié(int[][] t1,int[][] t2){
        int c=t1[0].length;
        int l=t1.length;
        int[][] tad=new int[c][l];
        for(int i=0;i<c;i++){
            for(int j=0;j<l;j++){
                tad[i][j]=t1[i][j]*t2[i][j];
            }
        }
        return tad;
    }
    /**
     * Donnée : 2 matrices de meme taille constitué seulement de nombre entiers
     * Résultat :renvoie une matrice de meme taille que ceux insérer avec comme contenue la multiplication
     * des 2 matrices.
     */
}