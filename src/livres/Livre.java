package livres;

//rajout 'public' car utilisation dans d'autres class dans d'autres packages
public class Livre {
    //ces variables sont liees et associees au concept de Livre - appellees "attribut" //le lien existe explicitement
    private String titre; //PRIVATE pour ne pas y accéder en dehors de la class
    private String auteur;
    private int nombrePages;
    private boolean emprunte;

    //le constructeur a le même nom que la classe
    //rajout 'public' car utilisation dans d'autres class dans d'autres packages
    public Livre(String titre, String auteur, int nombrePages) {
        //attributs ou variables membres //rajouter this pour différencier attribut et parametre
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.emprunte = false; //valeur decidee par default //this meme si pas de problème de masquage
    }

    //getters et setters s'appellent des accesseurs
    //getter = accesseur en lecture
    //setter = accesseur en écriture ou mutateur

    //Getter : méhode pour lire les attributs //clic droit generate + getter
    //methodes ou fonctions membres
    String getTitre() {
        return titre;
    }
    String getAuteur() {
        return auteur;
    }
    int getNombrePages() {
        return nombrePages;
    }

    //Setter pour modifier et vérifier - toujours des void car la methode de modification: setTitre
    void setTitre(String titre) {
        if(!titre.isEmpty()) { //methode isEmpty retourne un boolean
            this.titre = titre;
        } else {
            System.out.println("Le titre ne doit pas être vide");
        }
    }
    void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    void setNombrePages(int nombrePages) {
        if(nombrePages > 0) {
            this.nombrePages = nombrePages;
        } else {
            System.out.println("Le nombre de page ne peut pas être négatif.");
        }
    }


    //methodes ou fonctions membres
    void emprunter() {  //emprunterLivre(sans livre) car concerne la classe livre - les attributs déclarérs dans la class Livre
        if(!emprunte) {
            emprunte = true; //le livre vient d'etre emprunte
            System.out.printf("le livre %s de %s a été emprunté. \n", titre, auteur);
        } else {
            System.out.printf("le livre %s de %s est déjà emprunté. \n", titre, auteur);
        }
    }

}
