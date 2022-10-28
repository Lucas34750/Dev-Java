public class Additionner{
    public static int[][] additioner(int[][] P,int[][] Q){
        int c=P[0].length;
        int l=P.length;
        int[][] tad=new int[c][l];
        for(int i=0;i<c;i++){
            for(int j=0;j<l;j++){
                tad[i][j]=P[i][j]+Q[i][j];
            }
        }
        return tad;
    }
}