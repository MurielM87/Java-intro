package TP.CorrectionsChristian;

public class TP3_5_Parite {
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("4 est pair : " + estPair(4));
        System.out.println("7 est pair : " + estPair(7));
    }
}
