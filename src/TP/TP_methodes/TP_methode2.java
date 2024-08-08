package TP.TP_methodes;
/*
**TP3**
Le but de cet exercice est de simuler une tirelire dans laquelle on stocke et
* retire de l’argent et que l’on souhaite utiliser pour payer un certain budget (de vacances,par exemple).
Voici les détails de l’exercice : https://docs.google.com/document/d/1TZd2FwvYT04SAhHZhwzBeF26VNv_5DK13d_UjU9v6zI/edit?usp=sharing
 */
public class TP_methode2 {
    public static void main(String[] args) {
        Tirelire vacances = new Tirelire(200);

        vacances.afficher();
        vacances.secouer();
        vacances.remplir(1);
        vacances.puiser(1);
        vacances.calculerSolde(1,1);
        vacances.vider();

    }


}
