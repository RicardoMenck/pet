package petshop.amigao;

public class Banho extends Servico{

    public String nome() {
        return "Banho do Amigo Fiel: ";
    }
    @Override
    public String descricao() {
        return "O serviço de banho é essencial para manter os pets limpos, com pelos brilhosos e cheirosos. No banho, o animal é higienizado com shampoo e condicionador adequados. Traga o seu amigo fiel para receber esse serviço fantastico de profissionais especializados e produtos de qualidade para garantir a satisfação dos clientes e seus bichinhos!Agende já!🐾";
    }

    @Override
    public double preco() {
        return 60.00;
    }
}
