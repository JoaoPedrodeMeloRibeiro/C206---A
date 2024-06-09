package RedesSociais.example;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento {

    public GooglePlus(int numAmigos, String senha) {
        super(numAmigos, senha);
    }

    @Override
    public void postarFoto() {
        System.out.println("Uma foto foi postada no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Uma video foi postada no GooglePlus");
    }

    @Override
    public void postarComentario() {
            System.out.println("Uma comentario foi postado no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
            System.out.println("Uma publicacao foi curtida no GooglePlus");
    }

    @Override
    public void fazStreaming() {
            System.out.println("GooglePlus esta fazendo streaming");
    }

    @Override
    public void compartilhar(){
        System.out.println("Uma postage foi compartilhada no GooglePlus");
    }

    @Override
    public String toString() {
        return "GooglePlus{" +
                "numAmigos=" + numAmigos +
                ", senha='" + senha + '\'' +
                '}';
    }

}
