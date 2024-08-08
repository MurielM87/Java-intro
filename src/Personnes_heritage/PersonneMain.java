package Personnes_heritage;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonneMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Saisissez le nombre des personnes à insérer : ");
        int nombrePersonnes=scanner.nextInt();

        ArrayList<Personne> personnes=new ArrayList<>();

        scanner.nextLine();

        for(int i=1;i<=nombrePersonnes;i++){
            System.out.print("Nom : ");
            String nom=scanner.nextLine();

            System.out.print("Prenom : ");
            String prenom=scanner.nextLine();

            System.out.print("Age : ");
            int age=scanner.nextInt();

            Personne p=new Personne(/*nom,prenom,age*/);
            personnes.add(p);

            scanner.nextLine();
        }

//        for(Personne p:personnes){
//            System.out.printf("Je m'appelle %s\n",p.getPrenom());
//        }


//        Personne chris=new Personne("Lis","Chris",32);
//        Personne yannis=new Personne("H","Yannis",28);
//        Personne dominique=new Personne("P","Dominique",26);


//        ArrayList<Personne> personnes=new ArrayList<>();
//        personnes.add(chris);
//        personnes.add(yannis);
//        personnes.add(dominique);
//
//        Personne[] personnes1=new Personne[3];
//        personnes1[0]=chris;
//        personnes1[1]=yannis;
//        personnes1[2]=dominique;


//        int sommeAges=0;
//        for(Personne p:personnes){
//            sommeAges+=p.getAge();
//        }

//        System.out.println("Somme ages :"+sommeAges);
    }
}
