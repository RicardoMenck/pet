package petshop.amigao;

public class Main {
    public static void main(String[] args) {
        Produto racao =  new Produto("Ração","Alimento", 50.0,100);
        racao.vender(10);

        Animal a1 = new Animal("rex","Cachorro", "auau","15/01/2024","Ricardo");
        Banho b1 = new Banho();
        Agendamento c1 = new Agendamento(a1,b1,"16/10/2023","10:00");
        Agenda agenda = new Agenda();
        agenda.agendamento(c1);
    }
}