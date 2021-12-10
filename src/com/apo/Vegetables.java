package com.apo;

public class Vegetables implements Comparable<Vegetables> {
    // caractéristique de la class
    private String name; /*nom du legume*/
    private int price; /*prix du legume*/
    private String description; /*description du legume*/
    private int promo; /*promo du legume*/

    // on va créer le constructeur
    public Vegetables(String name, int price, String description, int promo) {
    this.name = name; /*on crée une relation (on l'assigne) avec l'attribut de la class que l'on vient récupérer*/
        this.price = price;
        this.description = description;
        this.promo = promo;
    }

    //une fois qu'on a les attribus et le constructeur, on va créer les méthodes (une fonction qui est dans une class) (pour récupérer les informations afin de pouvoir les afficher)

    public String getName() { return name; }

    public int getPrice() { return price; }

    public String getDesc() { return description; }

    public int getPromo() { return promo; }

    @Override
    public int compareTo(Vegetables legume2) {
        return this.getName().compareTo(legume2.getName());
    }
}
