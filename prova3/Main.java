package org.prova3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando funcionarios
        Aluno aluno = new Aluno();
        //variavel para entrada de dados
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;
        //contadores de curso
        int contComp = 0;
        int contSoftware = 0;
        int contTelecom = 0;



        while(flag){

            System.out.println("Para Cadastrar Alunos insira [ 1 ]");
            System.out.println("Para Listar medias em ordem decrescente digite [ 2 ]");
            System.out.println("Para Mostrar a quantidade de alunos de cada curso digite [ 3 ]");
            System.out.println("Para sair digite [ 4 ] ");
            System.out.print("Digite: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.print("Nome do aluno: ");
                    aluno.setNome(sc.nextLine());
                    System.out.print("Media do aluno: ");
                    aluno.setMedia(sc.nextFloat());
                    sc.nextLine();
                    System.out.print("Curso do aluno: ");
                    aluno.setCurso(sc.nextLine());
                    System.out.print("Matricula do aluno: ");
                    aluno.setMatricula(sc.nextInt());

                    arq.escrever(aluno);

                    break;

                case 2:
                    //armazena o retorno do medoto de leitura
                    ArrayList <Aluno> prods = arq.ler();
                    Collections.sort(prods);
                    Collections.reverse(prods);

                    for (int i = 0; i < prods.size(); i++) {
                        System.out.println(" - ");
                        System.out.println("Dados dos Alunos");
                        System.out.println(prods.get(i).getNome());
                        System.out.println(prods.get(i).getMedia());
                        System.out.println(prods.get(i).getCurso());
                        System.out.println(prods.get(i).getMatricula());
                        System.out.println(" - ");
                        if(prods.get(i).getCurso().equals("Computação")){
                            contComp++;
                        }
                        else if(prods.get(i).getCurso().equals("Software")){
                            contSoftware++;
                        }
                        else if(prods.get(i).getCurso().equals("Telecomunicações")){
                            contTelecom++;
                        }
                    }
                    break;

                case 3:

                    System.out.println("-----------------------------------------------------");
                    System.out.println("Quantidade de aluno do curso de Computação: " + contComp);
                    System.out.println("Quantidade de alunos do curso de Software: " + contSoftware);
                    System.out.println("Quantidade de alunos do curso de Telecomunicações : " + contTelecom);
                    System.out.println("-----------------------------------------------------");

                    break;

                case 4:
                    flag = false;
                    break;

            }

        }
    }
}