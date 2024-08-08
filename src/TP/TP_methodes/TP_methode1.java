package TP.TP_methodes;

/*
**TP2**
Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,
* et de calculer leur « Indice de Masse Corporelle» (IMC).
crée un patient,
affiche les données du patient ainsi que son IMC.
Avoir la possibilité de connaître la taille du patient, son poids
Pour calculer l’IMC veuillez lire ceci : https://www.santemagazine.fr/minceur/imc-indice-de-masse-corporelle-267579
 */
public class TP_methode1 {
    public static void main(String[] args) {
        Patient monPatient = new Patient(0, 0);
        monPatient.calculerImc(0, 0);
    }
}
