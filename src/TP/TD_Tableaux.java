package TP;

import java.util.Scanner;

public class TD_Tableaux {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

    /*    //tableau dynamique
        double nombreNotes = 0;
        do {fd
            //demander à l'utilisateur combien de notes ils souhaites saisir (pas de valeur négatives ou nulles)
            System.out.print("Combien de valeurs souhaitez-vous saisir ? ");
            nombreNotes = keyboard.nextDouble();
        } while(nombreNotes <= 0);

        ArrayList<Double> tableauNote = new ArrayList();
        System.out.println("taille : " + tableauNote.size());


        //entrer les valeurs à partir du clavier ([0, 20])
        for (int i = 0; i < tableauNote.size(); i++) {
            System.out.println("Entrez les valeurs : ");
            double notes = keyboard.nextDouble();
            if(notes < 0 && notes > 20) {
                System.out.println("valeurs incorrectes");
            }
        }


        /*     else {
                double somme = 0;
                for (int i = 0; i < nombreNotes.size(); i++) {
                    System.out.printf("notesPhysique[%d] : %.1f\n", i, nombreNotes.get(i));
                    somme += nombreNotes.get(i);
                }
            }

        }*/

/*
        ArrayList<Double> notesPhysique=new ArrayList();


        for(int i = 0; i < notesPhysique.size(); i++) { //i ou index //ArrayIndexOfBound //taille : 6 mais index : 5 donc strictement inférieur sinon i<=notesPhysique.length-1
            //System.out.println(notesPhysique[i]);
            System.out.printf("notesPhysique[%d] : %.1f\n", i, notesPhysique.get(i)); //on remplace [i] par .get(i)
            somme += notesPhysique.get(i);  //OU somme = somme + notesPhysique[i];

        }


        double moyenne = somme /notesPhysique.size();

        System.out.println("somme : " + somme);
        System.out.println("moyenne : " + moyenne);
*/

        //tableau statique
        int nombresNotes = 0;
        do {
            System.out.print("Combien de notes souhaitez-vous saisir ? ");
            nombresNotes = keyboard.nextInt();
        } while(nombresNotes <= 0);

        double[] tableau = new double[nombresNotes];
        for(int i = 0; i < tableau.length; i++) {
            double note = 0;
                    //verifier si note est positive
                    while(note <= 0) {
                        System.out.println("Entrez la note " + (i+1) + " : ");
                        note = keyboard.nextDouble();
                    }
            tableau[i] = note;
        }

        System.out.println("les notes saisies sont : ");

        for(int j = 0; j < tableau.length; j++) {
            System.out.println(tableau[j]);

        }
        keyboard.close();


    }


/*

        for(
    int i = 0;
    i<notesPhysique.length;i++)

    { //i ou index //ArrayIndexOfBound //taille : 6 mais index : 5 donc strictement inférieur sinon i<=notesPhysique.length-1
        //System.out.println(notesPhysique[i]);
        System.out.printf("notesPhysique[%d] : %.1f\n", i, notesPhysique[i]);
        somme += notesPhysique[i];  //OU somme = somme + notesPhysique[i];

    }

    notesPhysique[0]=15; //car tableau statique
    notesPhysique[4]=16; //la taille du tableau ne peux pas évoler et est déjà connue
    double moyenne = somme / notesPhysique.length;

        System.out.println("somme : "+somme);
        System.out.println("moyenne : "+moyenne);
*/
    }


