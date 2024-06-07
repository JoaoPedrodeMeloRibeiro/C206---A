package org.brownie;

public class BrownieNutella extends Brownie{
    public BrownieNutella(String nome, double preço, String sabor) {
        super(nome, preço, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando nutella");
    }
}
