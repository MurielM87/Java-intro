package TP.CorrectionsChristian;

public class TP3_3_Factorielle {
    public static long factorielle(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorielle(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorielle de 5 = " + factorielle(5));
        System.out.println("Factorielle de 0 = " + factorielle(0));
    }
}
