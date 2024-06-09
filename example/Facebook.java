package RedesSociais.example;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    public Facebook(int numAmigos, String senha) {
        super(numAmigos, senha);
    }


    @Override
    public void postarFoto(){
        System.out.println("Uma foto foi postada no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Um video foi postado no Facebook");
    }

    @Override
    public void postarComentario(){
        System.out.println("Um comentario foi postado no Facebook");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Uma publicação foi curtida no facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Facebook esta fazendo Streaming");
    }

    @Override
    public void compartilhar() {
        System.out.println("Uma postagem foi compartilhada no Facebook");
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "numAmigos=" + numAmigos +
                ", senha='" + senha + '\'' +
                '}';
    }


}
