public class IlExisteUneLigneAvecPlusieursZeros{
    public static boolean IlExisteUneLigneAvecPlusieursZeros(int[][] t1){
        int c=t1[0].length;
        int l=t1.length;
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
                z=i;
            }
            x=0;
        }
        if(y>1) {
            return true;
        }
        else{
            return false;
        }
    }
}
