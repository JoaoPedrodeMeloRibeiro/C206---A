package org.example;

public class RedeSocial extends Usuario{

    protected String senha;
    protected int numAmigos;

    public RedeSocial(int numAmigos, String senha) {
        this.numAmigos = numAmigos;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }

    void postarFoto (){
        System.out.println("Postando foto");
    }

    void postarVideo(){
        System.out.println("Postando video");
    }

    void postarComentario(){
        System.out.println("Postando comentario");
    }

    void curtirPublicacao(){
        System.out.println("Curtir publicacao");
    }
}
