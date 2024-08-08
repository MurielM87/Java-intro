package livres;
public class LivreMain {
    //Recupère les informations des autres Class au sein d'un meme package (=dossier)

    public static void main(String[] args) {
        //attention, la première lettre du nom des class est en majuscule !!!! Livre pP = null signifie qu'il n'y a aucune reference
        Livre petitPrince = new Livre("Le petit Princesse","Antoine de Saint-Exupéry" ,96); //Livre petitPrince; petitPrince = new Livre()
        petitPrince.emprunter(); //appel de la methode
        //modifier la valeur -> il y accéder dans la class pour les protéger et ne pas avoir d'objets invalides
        System.out.println("Titre avant setters : " + petitPrince.getTitre());
        System.out.println("Auteur avant setters : " + petitPrince.getAuteur());
        System.out.println("nombre pages avant setters : " + petitPrince.getNombrePages());
        petitPrince.setTitre("le Petit Prince");
        petitPrince.setNombrePages(-45);
        System.out.println("Titre apres setters : " + petitPrince.getTitre());
        System.out.println("nombre pages après setters : " + petitPrince.getNombrePages());

        Livre cleanCode = new Livre("Clean Code","Uncle Bob" , 500);
        cleanCode.emprunter();

        Livre artOfThinkingClearly = new Livre("Art of thinking clearly","Roff Dobelli", 300);
        artOfThinkingClearly.emprunter();

        System.out.println(petitPrince);
        System.out.println(cleanCode);
        System.out.println(artOfThinkingClearly);

    }
}
