import java.util.Scanner;

public class Point_12_SwitchCase {
    public static void main(String[] args) {
            Scanner keyboard=new Scanner(System.in);
            System.out.print("Votre langue : ");
            String langue=keyboard.nextLine();
            langue=langue.toLowerCase(); //methode plus simple pour supprimer les majuscules

            switch (langue) {
                case "english" -> System.out.println("Hello"); //plus besoin de break dans cette version ('->') - appelé implicitement
                case "french" -> System.out.println("salut");
                case "spanish" -> System.out.println("Hola!!");
                case "german" -> System.out.println("Guten Tag");
                case "chinese" -> System.out.println("Ni hao");
                default -> System.out.println("langue non supportée");
            }
        }
    }


