package org.example;

public class Instagram extends RedeSocial implements Compartilhamento, VideoConferencia{
    public Instagram(int numAmigos, String senha) {
        super(numAmigos, senha);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhamento");

    }

    @Override
    public void fazStreaming() {
        System.out.println("Streaming");
    }
}
