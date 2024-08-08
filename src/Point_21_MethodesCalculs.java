public class Point_21_MethodesCalculs {
    //creer une fonction - a la sortie produit un entier (sinon double, float, String, boolean)

    public static int calculPerimetre(int longueur,int largeur){
//        int resultat=2*(longueur+largeur);
//        return resultat;
        return 2*(longueur+largeur);
    }

    public static double calculSurface(double longueur,double largeur){
        return (longueur*largeur);
    }
    public static void main(String[] args) {
        System.out.println(calculPerimetre(500,250));

        int longueur=35;
        int largeur=19;
        int perimetre=calculPerimetre(longueur,largeur);
        System.out.println("perimetre : " +perimetre);
        double surface=calculSurface(longueur, largeur);
        System.out.println("surface : " + surface);
    }

}
