package org.example;

public class Promocao1{

    String marca = "Positivo";
    float preco = 3300.00f;
    String processador = "Pentium Core i3 (2200 Mhz)";
    int memoriaram = 8;
    int memoriahd = 500;
    String sistema = "Sistema Operacional Linux Ubuntu (32 bits)";
    String acompanha = "Acompanha Pen-drive de 16Gb";

    void mostrainfo(){
        System.out.println(marca);
        System.out.println(preco);
        System.out.println(processador);
        System.out.println(memoriaram);
        System.out.println(memoriahd);
        System.out.println(sistema);
        System.out.println(acompanha);
    }

}
public class Promocao2{

    String marca = "Acer";
    float preco = 8800.00f;
    String processador = "Pentium Core i5 (3370 Mhz)";
    int memoriaram = 16;
    int memoriahd = 1024;
    String sistema = "Sistema Operacional Windows 8 (64 bits)";
    String acompanha = "Acompanha Pen-drive de 32Gb";

    void mostrainfo(){
        System.out.println(marca);
        System.out.println(preco);
        System.out.println(processador);
        System.out.println(memoriaram);
        System.out.println(memoriahd);
        System.out.println(sistema);
        System.out.println(acompanha);
    }


}
public class Promocao3{

    String marca = "Vaio";
    float preco = 4800f;
    String processador = "Pentium Core i7 (4500 Mhz)";
    int memoriaram = 32;
    int memoriahd = 2048;
    String sistema = "Sistema Operacional Windows 10 (64 bits)";
    String acompanha = "Acompanha HD Externo 1Tb";

    void mostrainfo(){
        System.out.println(marca);
        System.out.println(preco);
        System.out.println(processador);
        System.out.println(memoriaram);
        System.out.println(memoriahd);
        System.out.println(sistema);
        System.out.println(acompanha);
    }

}
public class Main{
    public static void main(String args[]){

        String nome;
        float total;
        long cpf;
        int entrada;
        int promocao;

        System.out.print("Digite seu nome");
        nome = entrada.nextInt();
        System.out.print("Digite seu cpf");
        cpf = entrada.nextInt();

        Promocao1 promocao1 = new Promocao1();
        Promocao2 promocao2 = new Promocao2();
        Promocao3 promocao3 = new Promocao3();

        do{

            System.out.print("Digite a promoção desejada");
            promocao = entrada.nextInt();
            if (promocao == 1){
                promocao1.mostrainfo();

            }
            if (promocao == 2){

                promocao2.mostrainfo();

            }
            if (promocao == 3){
                promocao3.mostrainfo();

            }


        } while (promocao!=0);

    }
}