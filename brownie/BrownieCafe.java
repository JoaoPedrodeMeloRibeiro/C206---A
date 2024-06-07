package org.brownie;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preço, String sabor) {
        super(nome, preço, sabor);
    }
    public void adicionaCafe(){
        System.out.println("Cafe foi adicionado ao Brownie de doce de leite");
    }
}
