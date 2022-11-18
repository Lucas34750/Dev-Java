public class Additionner{
    public static int[][] additioner(int[][] P,int[][] Q){
        int c=P.length;
        int l=P[0].length;
        int[][] tad=new int[c][l];
        for(int i=0;i<c;i++){
            for(int j=0;j<l;j++){
                tad[i][j]=P[i][j]+Q[i][j];
            }
        }
        return tad;
    }
    /**
     * Donnée : 2 matrices de meme taille constitué seulement de nombre entiers
     * Résultat :renvoie une matrice de meme taille que ceux insérer avec comme contenue l'addition des 2 matrices.
     */
}