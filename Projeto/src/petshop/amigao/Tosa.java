package petshop.amigao;

public class Tosa extends Servico {

    public String Nome() {
        return "Tosa: ";
    }
    @Override
    public String descricao() {
        return "Mantenha seu pet limpo e livre de fungos e bactérias com nossa tosa profissional para seu amigo fiel, garantindo o bem-estar e a saúde dos seus pets. Traga o seu amigo fiel para receber esse serviço fantastico de profissionais especializados e produtos de qualidade para garantir a satisfação dos clientes e seus bichinhos. Agende já!🐾";
    }

    @Override
    public double preco() {
        return 50.00;
    }
}
