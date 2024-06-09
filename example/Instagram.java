package RedesSociais.example;

public class Instagram extends RedeSocial {

    public Instagram(int numAmigos, String senha) {
        super(numAmigos, senha);
    }

    @Override
    public void postarFoto() {
         System.out.println("Uma foto foi postado no Instagram");        
    }

    @Override
    public void postarVideo() {
         System.out.println("Uma video foi postado no Instagram");
    }

    @Override
    public void postarComentario() {
         System.out.println("Um comentario foi postado no Instagram");
    }

    @Override
    public void curtirPublicacao() {
         System.out.println("Uma publicação foi curtida no Instagram");
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "senha='" + senha + '\'' +
                ", numAmigos=" + numAmigos +
                '}';
    }
}
