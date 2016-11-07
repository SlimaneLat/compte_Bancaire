/**
 * Created by toshiba on 18/10/2016.
 */
public class Compte {
    private int NumeroC ;
    private double solde ;
    private double intr ;
       public Compte (int NumroC , double solde, double intr  ){
        this.NumeroC = NumeroC ;
        this.solde = solde ;
        intr = 0.05;// un exemple
        }
        public int getNumeroC(){
            return NumeroC;
        }
        public double getsolde(){
            return solde;
        }
        public double getIntr(){
            return intr;
        }
        public String toSting(){
            return "le numero de compte est:"+NumeroC+
                    "\n le solde est:"+solde+
                    "\n le taux d'interet est :"+intr;
        }
        public double calcintr(){
            return solde*0.05;
        }/*
        public double ajoutsolde (double Montant) {
            solde = solde + Montant ;
        }
        public double retrait (double MontantR){
            solde = solde - MontantR;
        }*/
        public double modif(double Montant,int n){
            if(n==2){
                solde = solde+Montant ;
            }
            else{
                solde = solde - Montant;
            }
        }



}
