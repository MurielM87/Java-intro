package TP.TP_methodes.code_dominique;

public class Tirelire {
    private double montant;

    public double getMontant() {
        return this.montant;
    }

    public void afficher(){
        if (this.montant == 0) {
            System.out.println("Vous êtes sans le sou.");
        } else {
            System.out.println("Vous avez : " + this.montant + " euros dans votre tirelire.");
        }
    }

    public void secouer(){
        if (this.montant != 0) System.out.println("Bing bing");
    }

    public boolean remplir(double montant){
        if (montant > 0) {
            this.montant += montant;
            return true;
        }
        return false;
    }

    public void vider(){
        this.montant = 0;
    }

    public void puiser(double montant){
        if (this.montant > 0){
            if (montant >= this.montant) {
                this.vider();
            } else {
                this.montant -= montant;
            }
        }
    }

    public double calculerSolde(double budget){
        double delta = this.montant - budget;

        return (delta <= 0) ? this.montant : delta;
    }

    public Tirelire(double montant) {
        this.montant = montant;
    }

    public boolean quitter(boolean exit) {
        return true;
    }
}
