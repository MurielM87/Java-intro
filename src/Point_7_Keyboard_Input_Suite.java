import java.util.Scanner;

public class Point_7_Keyboard_Input_Suite {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        //conversion text en nombre
    //    int nombre=Integer.parseInt("45");
    //    System.out.println(nombre);

        System.out.println("Entrez vos données personnelles.");
        String nom=keyboard.next();
        int age=keyboard.nextInt(); //comme pour nextDouble() - nombre considéré comme une chaine de caracteres, puis converti en un entier

        System.out.printf("Nom: %s\nÂge : %d", nom, age);
    }
}
