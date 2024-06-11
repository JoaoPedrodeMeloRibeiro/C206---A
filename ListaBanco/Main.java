package ListaBanco;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Bonzinho");

        Cliente cliente1 = new Cliente("João","Joao@email.com",30);
        Cliente cliente2 = new Cliente("Maria","Maria@email.com",21);
        Cliente cliente3 = new Cliente("Tobias","Tobias@email.com",25);

        banco.addClientes(cliente1);
        banco.addClientes(cliente2);
        banco.addClientes(cliente3);

        banco.mostraInfo();


    }
}