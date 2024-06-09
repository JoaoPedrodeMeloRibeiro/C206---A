package RedesSociais.example;
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("usuarioderedessociais@somandameme.com","Usuario1234");

        System.out.println(" ");
        usuario.facebook.postarComentario();
        usuario.facebook.postarFoto();
        usuario.facebook.compartilhar();
        System.out.println(" ");
        usuario.twitter.curtirPublicacao();
        usuario.twitter.fazStreaming();
        usuario.twitter.postarVideo();
        System.out.println(" ");
        System.out.println(usuario.facebook.toString());
        System.out.println(usuario.twitter.toString());
        System.out.println(usuario.instagram.toString());
        System.out.println(usuario.googlePlus.toString());

    }

}