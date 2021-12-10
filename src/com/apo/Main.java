package com.apo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // on crée une liste de légumes
        List<Vegetables> legumes = new ArrayList<>(); /*on crée la variable pour stocker temporairement la liste des legumes*/
        legumes.add(new Vegetables("poivrons rouges", 70, "été", 2));
        legumes.add(new Vegetables("courgettes", 20, "été", 5));
        legumes.add(new Vegetables("tomates", 50, "été", 0));
        legumes.add(new Vegetables("poireaux", 150, "automne/hiver", 6));
        legumes.add(new Vegetables("oignons", 30, "toute l'année", 0));
        legumes.add(new Vegetables("poivrons verts", 70, "été", 0));
        legumes.add(new Vegetables("poivrons jaunes", 70, "été", 0));
        legumes.add(new Vegetables("pak choï", 100, "printemps", 0));
        legumes.add(new Vegetables("pommes de terre", 20, "automne/hiver", 0));
        legumes.add(new Vegetables("carottes", 30, "automne", 0));

        // ------ afficher la liste
        /* System.out.println(legumes);*/

        // ------récupérer les éléments 1 par 1 en créant une nouvelle variable qui identifie chaque item de la liste comme legume
            /* for(String legume : legumes){
                System.out.println(legume);
                }*/

            /*autre méthode
             legumes.stream().foreach(legume -> {
             System.out.println(legume);
             }); */

        //---- trier les legumes par ordre alphabetique
        /*Collections.sort(legumes);*/ /*le composant collections.sort ne fonctionne que sur les chaînes de caractères*/
        /*    System.out.println("-------Tri par ordre alphabétique--------");*/

        //afficher à nouveau la liste
        /*
        legumes*//*.stream()*//*.forEach(legume -> {
            System.out.println("Legume: " + legume.getName() + "(" + legume.getPrice() + " cts)" + "saison : " + legume.getDesc() + "=> promotion : " + legume.getPromo() + "%");
        });
        */

        //Tri des objets
        Collections.sort(legumes, new PriceComparator());

        //Affiche de nouveau la liste
        for (Vegetables legume : legumes) {
            System.out.println("Legume: " + legume.getName() + " (" + legume.getPrice() + "cts)" + ", saison : " + legume.getDesc() + " => promotion : " + legume.getPromo() + "% de reduction");
        }
    }
}