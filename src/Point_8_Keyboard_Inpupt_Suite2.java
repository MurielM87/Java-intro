
import java.util.Scanner;

public class Point_8_Keyboard_Inpupt_Suite2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Votre nom : ");
        String nom=keyboard.nextLine(); //pour lire toute la ligne (malgré les espaces)

        System.out.printf("Votre nom est %s", nom);
    }
}
