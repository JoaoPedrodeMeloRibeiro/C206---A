package org.prova3;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String curso;
    private float media;
    private int matricula;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Aluno o) {
        return Double.compare(this.media, o.media);
    }
}