public class Main {
    public static void main(String[] args) {
        char[] tabCouleur={'R','B','J','V','O','N'};
        int lgCode=4;
        int[][] Cod={{5,4,4,1},{1,2,3,4},{0,1,2,0}};
        int[][] rep={{1,1},{1,1},{0,0}};
        int nbCoups=3;
        int nbCouleurs=6;
        int[] cod1={4,4,3,4};
        int[] cod2={0,1,0,0};
        System.out.println(MasterMindBase.estCompat(cod1,Cod,rep,nbCoups,nbCouleurs));
    }
}