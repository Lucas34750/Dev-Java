public class Main {
    public static void main(String[] args) {
        char[] tabCouleur={'R','B','J','V','O','N'};
        int[] cod={5,5,5,5};
        int[] cod2={1,2};
        System.out.println(MasterMindTest.passeCodeSuivantLexico(cod,6));
        afficherTableau.afficherTableau(cod);
    }
}