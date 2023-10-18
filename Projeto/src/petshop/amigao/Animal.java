package petshop.amigao;

public class Animal {
     private String nome;
     private String espécie;
     private String raca;
     private String dataNascimento;
     private String proprietario;

     //Construtor

    public Animal(String nome, String espécie, String raca, String dataNascimento, String proprietario) {
        this.nome = nome;
        this.espécie = espécie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = proprietario;
    }


    //Métodos acessore e modificadores


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspécie() {
        return espécie;
    }

    public void setEspécie(String espécie) {
        this.espécie = espécie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
