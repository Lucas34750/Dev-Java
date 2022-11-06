public class SontÉgales{
    public static boolean sontÉgales(int[][] t1,int[][] t2){
        int c1=t1.length;
        int l1=t1[0].length;
        int c2=t2.length;
        int l2=t2[0].length;
        boolean tad=true;
        if((c1==c2) && (l1==l2)){
            for(int i=0;i<c1;i++){
                for(int j=0;j<l1;j++){
                    if(t1[i][j]!=t2[i][j]) {
                        tad = false;
                    }
                }
            }
        }
        else{
            tad=false;
        }


        return tad;
    }
    /**
     * Donnée : 2 matrices
     * Résultat :renvoie un boolean s'il est vrai c'est que les matrices sont les meme sinon elles ne le sont pas.
     */
}
