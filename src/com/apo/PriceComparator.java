package com.apo;

import java.util.Comparator;

public class PriceComparator implements Comparator<Vegetables> {
    //le comparator permet de comparer plusieurs légumes entre eux, ici on veut les afficher du moins cher au plus cher

    @Override
    public int compare(Vegetables legume1, Vegetables legume2) {
        // si on souhaite que 2 items qui ont le meme prix soient triés en fonction de l'order alphabétique
        if (legume1.getPrice() == (legume2.getPrice())) {
            return legume1.compareTo(legume2);
        }
        //solution 1
        /* if(legume1.getPrice() > legume2.getPrice()){ */
            /*    return 1;
                } else {
                return 0;
                } */
        //solution 2
        return legume1.getPrice() - legume2.getPrice();
    }
}