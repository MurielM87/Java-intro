package TP.TP_methodes;
import java.util.Scanner;
/*
**TP3**
Le but de cet exercice est de simuler une tirelire dans laquelle on stocke et
* retire de l’argent et que l’on souhaite utiliser pour payer un certain budget (de vacances,par exemple).
Voici les détails de l’exercice : https://docs.google.com/document/d/1TZd2FwvYT04SAhHZhwzBeF26VNv_5DK13d_UjU9v6zI/edit?usp=sharing
 */
public class Tirelire {
    Scanner keyboard = new Scanner(System.in);
    double montant;

    public Tirelire(double montant) {
        this.montant = montant;
    }

    //methode getMontant : retourne le montant de la tirelire
    public double getMontant() {
        return montant;
    }
    //methode afficher : pour les donnees de la tirelire
    //avec message "Vous êtes sans le sou" si pas d'argent
    //vous avec : <montant> € dans votre tirelire
    public void afficher() {
        if(montant == 0) {
            System.out.println("Vous êtes sans le sou");
        } else {
            System.out.printf("Vous avec %.2f € dans votre tirelire\n", montant);
        }
    }

    //methode secouer : afficher sur terminal le message Bing bing, suivi d'un saut de lire si argent
    //sinon rien
    public void secouer() {
        if(montant > 0) {
            System.out.println("***Bing bing***\n");
        }
    }

    //methode remplir : mettre un montant en parametre (double) - seuls montants positifs acceptes
    public void remplir(double ajout) {
        System.out.println("Combien ajoutez-vous à votre tirelire ?");
        ajout = keyboard.nextDouble();

        if(ajout > 0) {
            montant += ajout;
            System.out.println("Le nouveau montant de votre tirelire est de " + montant + "€");
        }
    }

    //methode vider : reinitialiser le montant à 0
    public void vider() {
        if(montant > 0) {
            montant -= montant;
            System.out.println("la tirelire est vide : " + montant + "€");
        }
    }

    //puiser : dans la tirelire montant donne en parametre
    //si négatif, il sera ignoré
    //si montant plus grand, alors tirelire videe
    public void puiser(double sommeRetiree) {
        System.out.println("Combien souhaitez-vous retirer de votre tirelire ? ");
        sommeRetiree = keyboard.nextDouble();
        if(sommeRetiree > 0) {
            if(sommeRetiree > getMontant()) {
                montant -= sommeRetiree;
            }
            System.out.printf("La tirelire est à %.2f€ après avoir retiré %.2f€ \n", montant, sommeRetiree);
        }
    }

    //methode calculerSolde : calculer difference entre montant tirelire et budget que l'on souhaite dépenser
    //si budget négatif ou nul, la methode doit retourner le montant de la tirelire
    public void calculerSolde(double tirelire, double budget) {
        System.out.println("Quel est votre budget de vacances ? ");
        budget = keyboard.nextDouble();

        if (montant < budget) {
            montant -= budget;
            System.out.printf("Il vous manque %.1f euros pour partir en vacances ! \n", montant);
        } else if (montant > budget) {
            montant -= budget;
            System.out.printf("Vous êtes assez riche pour partir en vacances ! Il vous restera %.1f euros à la rentrée. \n", montant);
        }
    }


}
