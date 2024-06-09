package RedesSociais.example;

public class Usuario {
    private String nome;
    private String email;

    Facebook facebook = new Facebook(1300,"Aninha");
    Instagram instagram = new Instagram(420,"StarWars1234");
    GooglePlus googlePlus = new GooglePlus(2,"MegaUltraBlasterHyper");
    Twitter twitter = new Twitter(5340,"tretageneralizada");

    public Usuario(String email, String nome) {
        this.email = email;
        this.nome = nome;;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
