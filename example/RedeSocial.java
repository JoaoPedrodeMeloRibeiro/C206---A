package RedesSociais.example;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(int numAmigos, String senha) {
        this.numAmigos = numAmigos;
        this.senha = senha;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public abstract void curtirPublicacao();

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
