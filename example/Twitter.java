package RedesSociais.example;

public class Twitter extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Twitter(int numAmigos, String senha) {
        super(numAmigos, senha);
    }

    @Override
    public void postarFoto() {
        System.out.println("Uma foto foi postada no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Uma video foi postado no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Uma comentario foi postado no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Uma publicação foi curtida no Twitter");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Twitter esta fazendo Streaming");
    }

    @Override
    public void compartilhar() {
        System.out.println("Uma postagem foi compartilhada no Twitter");
    }

    @Override
    public String toString() {
        return "Twitter{" +
                "senha='" + senha + '\'' +
                ", numAmigos=" + numAmigos +
                '}';
    }
}
