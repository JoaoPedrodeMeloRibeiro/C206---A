package RedesSociais.example;

public class Instagram extends RedeSocial {

    public Instagram(int numAmigos, String senha) {
        super(numAmigos, senha);
    }

    @Override
    public void postarFoto() {

    }

    @Override
    public void postarVideo() {

    }

    @Override
    public void postarComentario() {

    }

    @Override
    public void curtirPublicacao() {

    }

    @Override
    public String toString() {
        return "Instagram{" +
                "senha='" + senha + '\'' +
                ", numAmigos=" + numAmigos +
                '}';
    }
}
