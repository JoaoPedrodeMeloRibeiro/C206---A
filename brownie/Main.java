package org.brownie;

public class Main {
    public static void main(String[] args) {
        Brownie brownie = new Brownie("Cafe",23.4,"Cafe");
        BrownieCafe brownieCafe = new BrownieCafe("Cafe",23.4,"Cafe");
        BrownieNutella brownieNutella = new BrownieNutella("Cafe",23.4,"Cafe");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Cafe",23.4,"Cafe");
        brownie.addCarrinhoDeCompras();
        brownie.calcularValorTotalDaCompra();
        brownie.moostraInfo();
        brownieCafe.addCarrinhoDeCompras();
        brownieCafe.moostraInfo();
        brownieNutella.addCarrinhoDeCompras();
        brownieNutella.calcularValorTotalDaCompra();
        brownieNutella.moostraInfo();
        brownieDoceDeLeite.addCarrinhoDeCompras();
        brownieDoceDeLeite.calcularValorTotalDaCompra();
        brownieDoceDeLeite.moostraInfo();

    }
}