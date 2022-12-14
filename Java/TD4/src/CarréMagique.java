public class CarréMagique{
    /**
     * Donnée : un tableau d'entiers carré de n rangées et n colonnes
     * Résultat : affiche le tableau une rangée par ligne et en séparant les entiers sur chaque ligne par une tabulation
     */
    public static void afficherCarré(int[][] T) {
        int c = T[0].length;
        int l = T.length;
        for (int i = 0; i < c; i++) {
            if(i>0){
                System.out.println();
            }
            for (int j = 0; j < l; j++) {
                System.out.print(T[i][j]+"\t");
            }
        }
    }
    /**
     * Donnée : 1 Matrice
     * Résultat :renvoie rien mais affiche l'entierete de la matrice ligne par ligne colonne par colonne.
     */
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
    /**
     * Donnée : 1 Matrice avec comme contenue seulement des entiers.
     * Résultat :renvoie un entier qui correspondra a la somme des diagonales de la matrice.
     */
    public static void remplirEnCarréMagique(int[][]tab){
        for(int i=0;i<tab.length;i++) {
            for(int j=0;j<tab[0].length;j++){
                tab[i][j]=0;
            }
        }
        int lon= tab.length;
        int i=0;
        int j=lon/2;
        int a=1;
        int g;
        int f;
        while(a<=lon*lon){
            tab[i][j]=a++;
            g=i;
            f=j;
            i-=1;
            j+=1;
            if (i<0){
                i=lon-1;
            }
            if(j>=lon){
                j=0;
            }
            if(tab[i][j]!=0) {
                i=g+1;
                j=f;
            }
        }
    }
    /**
     * Donnée : 1 matrice carré et impaire quelconque
     * Résultat :renvoie rien mais transforme votre matrice en une
     *           matrice carré remplie d'entiers et qui forme un carré magique
     */
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
     * Donnée : une matrice qui est un carré magique
     * Résultat :renvoie un entier, la constante magique de ce carré.
     */
    public static int Sommedeslignes(int[][] tab,int l){
        int r=tab.length;
        int x=0;
        for(int i=0;i<r;i++){
            x=x+tab[l][i];
        }
        return x;
    }
    /**
     * Donnée : une matrice carré remplie d'entiers ainsi qu'un entiers entre 0 et
     *          (la taille de la matrice-1),(0 étant la premiere ligne).
     * Résultat :renvoie un entier, la somme de la ligne de la matrice demandé.
     */
    public static int Sommedescolonnes(int[][] tab,int c){
        int l=tab.length;
        int x=0;
        for(int i=0;i<l;i++){
            x=x+tab[i][c];
        }
        return x;
    }
    /**
     * Donnée : une matrice carré remplie d'entiers ainsi qu'un entiers entre 0 et
     *          (la taille de la matrice-1),(0 étant la premiere colonne).
     * Résultat :renvoie un entiers, la somme de la colonne de la matrice demandé.
     */

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
    /**
     * Donnée : Une matrice carré remplie d'entiers.
     * Résultat :renvoie un boolean qui sera soit vrai si la matrice carré donné est un carré magique
     *           et faux si jamais celle-ci n'en est pas un.
     */
}
