package TP.TP_batiment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Maison maison1 = new Maison("rue des Acacias", 5);
        Batiment maison2 = new Batiment("rue des Saules");
        Maison maison3 = new Maison("rue des fraises", 10);

        List<Batiment> batiments = new ArrayList<>();
        batiments.add(maison1);
        batiments.add(maison2);
        batiments.add(maison3);
        System.out.println(batiments);

        maison1.occuper(3);
        maison2.occuper(19);
        maison3.occuper(2);

    }
}
