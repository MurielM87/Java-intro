import java.util.Scanner;
import java.lang.Object;
import java.util.*;

public class Point_11_Alternatives_Multiples {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue=keyboard.nextLine();
      //  String langue_converted = langue.toLowerCase(); - mieux utiliser equalsIgnoreCase
      //OU  langue=langue.toLowerCase();

        if(langue.equalsIgnoreCase("english") /*|| langue_converted.equals("english")*/) { //IgnoreCase = pour ignorer les majuscules
            System.out.println("Hello");
        } else if (langue.equalsIgnoreCase("french")/* || langue_converted.equals("french")*/) {
            System.out.println("salut");
        } else if (langue.equalsIgnoreCase("spanish")/* || langue_converted.equals("spanish")*/) {
            System.out.println("Hola!!");
        } else if (langue.equalsIgnoreCase("german")/* || langue_converted.equals("german")*/) {
            System.out.println("Guten Tag");
        } else if (langue.equalsIgnoreCase("mandarin") /*|| langue_converted.equals("mandarin")*/) {
            System.out.println("Ni hao");
        } else {
            System.out.println("langue non supportée");
        }
    }
}
