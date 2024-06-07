package org.brownie;

public class Brownie {
    protected String nome;
    protected double preço;
    protected String sabor;

    public Brownie(String nome, double preço, String sabor) {
        this.nome = nome;
        this.preço = preço;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println( nome + "foi adicionado ao carrinho de compras");
    }

    public void calcularValorTotalDaCompra(){
        System.out.println("o valor total é"+preço);

    }

    public void moostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço:"+ preço);
        System.out.println("Sabor: " + sabor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
