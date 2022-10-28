public class CarréMagique{
    public static void afficherCarré(int[][] T) {
        int c = T[0].length;
        int l = T.length;
        for (int i = 0; i < c; i++) {
            if(i>0){
                System.out.println();
            }
            for (int j = 0; j < l; j++) {
                System.out.print(T[i][j]+" ");
            }
        }
    }
    public static int sommeDesDiagonales(int[][] M){
        int l=M.length;
        int x=0;
        int j=l-1;
        for(int i=0;i<l;i++){
            x+=M[i][i];
        }
        for(int i=0;i<l;i++){
            x+=M[j][i];
            j--;
        }
        return x;
    }
    public static void remplirEnCarréMagique(int[][]tab){
        int l=0;
        int c=0;
        int taillemat=tab.length;
        int taillematv=taillemat*taillemat;
        l=(taillemat-1)/2;
        for(int i=0;i<taillemat;i++){
            for(int j=0;j<taillemat;j++){
                tab[i][j]=0;
            }
        }
        for(int i=0;i<taillematv;i++){
            if(tab[c][l]==0){
                tab[c][l] = i + 1;
            }
            else{
                if(c-1<0){
                    c=taillemat-1;

                }
                else{
                    c=c-1;
                }

                if(l-1<0){
                    l=taillemat-1;
                }
                else{
                    l = l - 1;
                }
                tab[c][l] = i + 1;
            }

            if(l+1>=taillemat){
                l=0;
            }
            else{
                l=l+1;
            }

            if(c-1<0){
                c=taillemat-1;

            }
            else{
                c=c-1;
            }
        }

    }

    public static int constanteMagiqueDe(int[][] tab) {
        int taillemat=tab.length;
        int x=0;
        int y=0;
        for(int i=0;i<taillemat;i++){
            y=tab[0][i];
            x=x+y;
        }
        return x;
    }
    /**
     * Donnée : un tabeau d' entiers 2D
     * Résultat :renvoie la somme de la premiere ligne de la matrice.
     */
    public static int Sommedeslignes(int[][] tab,int l){
        int r=tab.length;
        int x=0;
        for(int i=0;i<r;i++){
            x=x+tab[l][i];
        }

        return x;
    }
    public static int Sommedescolonnes(int[][] tab,int c){
        int l=tab.length;
        int x=0;
        for(int i=0;i<l;i++){
            x=x+tab[i][c];
        }
        return x;
    }
    public static boolean cEstUnCarréMagique(int[][] tab){
        boolean x=true;
        int y=0;
        int r=0;
        int l=tab.length;
        y=constanteMagiqueDe(tab);
        if ((sommeDesDiagonales(tab)/2)!=y){
            x=false;
        }
        for(int i=0;i<l;i++){
            r=Sommedescolonnes(tab,i);
            if (r!=y){
                x=false;
            }
        }
        for(int i=0;i<l;i++){
            r=Sommedeslignes(tab,i);
            if (r!=y){
                x=false;
            }
        }

        return x;

    }
}
