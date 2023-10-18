package petshop.amigao;

public class ConsultaVet extends Servico{
    public String nome() {
        return "Consulta Veterinaria: ";
    }
    @Override
    public String descricao() {
        return "Nossos veterinários realizam exames clínicos, diagnósticos, coletam materiais para exames laboratoriais e sugerem tratamentos, dietas e cuidados essenciais para a saúde e bem-estar dos seus pets. Traga o seu Amigo fiel, Agende já!🐾";
    }

    @Override
    public double preco() {
        return 180.00;
    }
}
