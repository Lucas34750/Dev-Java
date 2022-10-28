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
}
