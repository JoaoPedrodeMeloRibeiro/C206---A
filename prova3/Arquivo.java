package org.prova3;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Aluno func) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("Alunos.txt", true); // Nome do arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Informações do aluno
            bw.write("++ Alunos ++\n");
            bw.write(func.getNome() + "\n");
            bw.write(func.getCurso() + "\n");
            bw.write(func.getMedia() + "\n");
            bw.write(func.getMatricula() + "\n");


        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    // 2. Método ler


    public ArrayList<Aluno> ler() {

        // ArrayList auxiliar para salvar alunos encontrados no arquivo
        ArrayList<Aluno> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("Alunos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Alunos ++")) {
                    // Variável auxiliar de alunos
                    Aluno aluno = new Aluno();
                    aluno.setNome(br.readLine());
                    aluno.setCurso(br.readLine());
                    aluno.setMedia(Float.parseFloat(br.readLine()));
                    aluno.setMatricula(Integer.parseInt(br.readLine()));

                    // Adicionando o aluno no array
                    encontreiNoArquivo.add(aluno);
                }
                linhaLer = br.readLine();
            }


        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }

        return encontreiNoArquivo;

    }
}
