package petshop.amigao;

public class Agendamento {
    private Animal animal;
    private Servico servico;
    private String data;
    private String horario;

    //Método da classe

    //Construtores
    public Agendamento(Animal animal, Servico servico, String data, String horario) {
        this.animal = animal;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    //Método acessores e modificadores

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
