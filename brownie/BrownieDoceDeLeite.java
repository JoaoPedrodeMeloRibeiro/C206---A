package org.brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, Double preço, String sabor) {
        super(nome,preço,sabor);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println( "Um brownie de doce de leite foi adicionado ao carrinho");
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Doce de Leite foi adicionado ao Brownie de doce de leite");
    }
}
