public class Point_5_affichage {
    public static void main(String[] args) {
        int longueur=500;
        int largeur=250;
        int perimetre=2*(longueur+largeur);
        int aire=longueur*largeur;

        System.out.println(perimetre+" m");
        //perimetre = 2*(longueur+largeur) = 1500 - valeurs lues à partir des variables
        System.out.println("perimètre = 2*("+longueur+"+"+largeur+") = "+perimetre);
        System.out.println(aire+" m²");
        //aire = longueur*largeur
        System.out.println("aire = "+longueur+"*"+largeur+" = "+aire);

        //interprétation de string
        //%d : pour un entier
        //souf : retour à la ligne pas automatique - utiliser \n
        System.out.printf("perimetre = 2*(%d + %d) = %d\n", longueur, largeur, perimetre);
        System.out.printf("aire = %d*%d=%d\n", longueur, largeur, aire);
    }
}
