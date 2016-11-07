import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by toshiba on 18/10/2016.
 */
public class Main {
    public static void main (args[]){
    Compte c = new compt(000);
    int op;
    double mtn;
    System.out.println("choisissez une oppiration svp" +
            "\n1:Afficher les Informations du compte" +
            "\n2:Ajouter un Montant " +
            "\n3:faire retrait un Montant" +
            "\n4:calculer le taux d'iteret" +
            "\n5:Quitter");
    do {
    Input.StreamReader lecteur = new InputStreamReader(System.in);
    BufferedReader entree = new BufferedReader(lecteur);
    op = Integer.parseInt(entree.readLine());
    switch(op){
        case 1 : c.toSting();break;
        case 2 :
        case 3 :
            Input.StreamReader lecteur = new InputStreamReader(System.in);
            BufferedReader entree = new BufferedReader(lecteur);
            mtn = Double.parseDouble(entree.readLine());
            c.modif(mtn,op);break;
        case 4 : c.calcintr();break;
        case 5 : break;


    }while (n!=5 || n>5)}}}

