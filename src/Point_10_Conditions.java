import java.util.Scanner;

public class Point_10_Conditions {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Votre âge : ");
        int age = keyboard.nextInt();
        boolean estMajeur=age>=18; //boolean : on peut passer des expressions qui produisent true or false
//utiliser un nom de variable qui exprime l'intention (estMajeur)
        if (estMajeur){ //(age > 18 || age ==18) (age>=18)
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
    }
}
