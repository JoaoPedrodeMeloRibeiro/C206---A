package ListaBanco;

public class Banco {
    public String nome;
    Cliente[] clientes = new Cliente[10];

    public Banco(String nome) {
        this.nome = nome;
    }

    void addClientes(Cliente novoCliente){
        for(int i = 0; i < clientes.length; i++){//Varrendo o array de clientes
            if(clientes[i] == null){//Verifica se não existe cliente
                clientes[i] = novoCliente;
                break; //Adiciona e sai do metodo
            }
        }
    }

    void mostraInfo(){
        System.out.println("O banco: " + this.nome + " possui os seguintes clientes:");
        for (Cliente cliente : clientes) {
            if(cliente != null)//Verifica se existe cliente antes de imprimir
            {
                System.out.println(cliente.nome);
                System.out.println(cliente.email);
                System.out.println(cliente.idade);
            }
        }
    }


}
