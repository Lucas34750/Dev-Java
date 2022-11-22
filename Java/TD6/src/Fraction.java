import java.util.Scanner;
import java.lang.*;

public class Fraction {
    private int numerateur;

    private int denominateur; // Invariant : different de 0

    public Fraction (int num, int denom) {
        /*  Action : constructeur a partir de deux entiers.
         *  Pre-requis : denom est different de 0 !
         */
        this.numerateur = num;
        this.denominateur = denom;
    }

    public Fraction (Fraction frac) { // constructeur par recopie frac --> this
        this.numerateur = frac.numerateur;
        this.denominateur = frac.denominateur;
        // Rmq : peut s'écrire en faisant appel au constructeur precedent : this(frac.numerateur, frac.denominateur);
    }

    public Fraction (String strFrac) {
	/* Action : constructeur a partir d'une chaine de caracteres.
	   Pre-requis : strFrac est une chaine de caracteres correspondant a une fraction, par exemple "13/26"

	   Remarque pedagogique : parseInt est une methode de classe (Integer) ;
	   split est une methode d'instance (strFrac)
	*/
        String str[];   // declaration d'un tableau de chaines de caracteres
        str = strFrac.split("/");  // Appel de la methode 'split' d'un objet de classe String : eclatement de strFrac en plusieurs sous-chaines separees par des '/' et rangees
        // dans str. Exemple : si strFrac=="13/26", alors str[0] vaut "13" et str[1] vaut "26".
        this.numerateur = Integer.parseInt(str[0]);    // La methode de la classe Integer permet de traduire la chaine en argument en Integer...
        // Java sait automatiquement transformer (on dit "caster" ou "faire un cast" - anglicisme) une valeur Integer vers int.
        this.denominateur = Integer.parseInt(str[1]);
    }


    // public void affiche() {
    // !! Mieux vaut utiliser toString() ci-apres !!
    //	System.out.println("Fraction = " + this.numerateur + " / " + this.denominateur);
    // }

    public String toString() {

        return this.numerateur + "/" + this.denominateur;
    }
    public void reduire(){
        int d=Ut.pgcd(this.numerateur,this.denominateur);
        this.numerateur/=d;
        this.denominateur/=d;
    }

    public Fraction fractionReduite (){
        Fraction frac=new Fraction(this);
        frac.reduire();
        return frac;
    }
    public Fraction fois(Fraction X){
        int num=this.numerateur*X.numerateur;
        int denom=this.denominateur*X.denominateur;
        Fraction f=new Fraction(num,denom);
        f.reduire();
        return f;
    }
    public Fraction plus(Fraction X){
        int num=this.numerateur*X.denominateur;
        int denom=this.denominateur*X.denominateur;
        int num1=this.denominateur*X.numerateur;
        int denom1=this.denominateur*X.denominateur;
        num+=num1;
        Fraction f=new Fraction(num,denom);
        f.reduire();
        return f;
    }
    public Fraction puissance(int n){
        Fraction p=new Fraction(this);
        Fraction p2=new Fraction(this);
        for(int i=0;i<=n;i++){
            if(i==0){
                p.denominateur=1;
                p.numerateur=1;
            }
            else if(i==1){
                p.numerateur=this.numerateur;
                p.denominateur=this.denominateur;
            }
            else{
                p= p.fois(p2);
            }
        }
        p.reduire();
        return p;
    }
    public boolean égale(Fraction X){
        Fraction f=this.fractionReduite();
        Fraction f2=X.fractionReduite();
        if(f.numerateur==f2.numerateur && f.denominateur==f2.denominateur){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean estIrréductible(Fraction X){
        Fraction f=this.fractionReduite();
        return f.égale(this);
    }
}