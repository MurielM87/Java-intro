package TP;

public class TP_FactorielCalculV1 {
    public static int factorielle(int n) {
        int factorielNombre = 1;
        for(int i = 1; i <= n; i++) {
            factorielNombre = factorielNombre * i; //factorielNombre *= i;
        }
        return factorielNombre;
    }

    public static void main(String[] args) {
        System.out.println(factorielle(5));
        System.out.println(factorielle(0));
    }
}
