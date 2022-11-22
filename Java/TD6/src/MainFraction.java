
import java.util.Scanner;
import java.lang.*;

class MainFraction { // Classe de test de Fraction et contenant la fonction principale

    public static void main(String args[]){

        Fraction f1, f2, f3, f4; // declaration de 4 variables/instances de type/classe Fraction
        Date d, d2;
        f1 = new Fraction(1,2); // fabrication d'une instance de la classe Fraction à l'aide du constructeur a deux arguments entiers

        f2 = new Fraction(1,2); // fabrication d'une instance de la classe Fraction à l'aide du constructeur a deux arguments entiers

        f3 = new Fraction("24/36"); // fabrication d'une instance de la classe Fraction à partir d'une chaîne de caractères

        f4 = new Fraction(f2); // fabrication d'une instance de la classe Fraction par recopie de l'instance f2
        d= new Date(1,1,2001);
        d2= new Date(28,2,2001);
        /* A COMPLETER A PARTIR D'ICI !! */
            System.out.println(d.jusquà(d2));
    }
}
