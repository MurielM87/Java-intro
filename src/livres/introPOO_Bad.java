package livres;
public class introPOO_Bad {
    //creer une methode pour emprunter
    public static void emprunterLivre(String titre, String auteur, int nombrePages, boolean emprunte) {
        //ce qui permet de décrire un livre est une classe
        //methode pour nous informer si livre emprunte
        if(!emprunte) {
            emprunte = true; //action d'emprunter le livre
            System.out.printf("le livre %s a été emprunté. ", titre);
        } else {
            System.out.printf("le livre %s est déjà emprunté. ", titre);
        }
    }

    public static void main(String[] args) {
        String titre1 = "Le petit Prince";
        String auteur1 = "Antoine de Saint-Exupéry";
        int nombrePages1 = 96;
        boolean emprunte1 = false;

        String titre2 = "Clean Code";
        String auteur2 = "Uncle Bob";
        int nombrePages2 = 500;
        boolean emprunte2 = true;

        String titre3 = "Art of thinking clearly";
        String auteur3 = "Roff Dobelli";
        int nombrePages3 = 300;
        boolean emprunte3 = false;
    }
}
