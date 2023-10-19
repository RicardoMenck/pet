package petshop.amigao;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEstoque;

    // Método da classe

    public void vender(int quantidade) {
        if(quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Executado a venda do produto " + this.nome + ", " +  quantidade + " unidades vendias.");
        } else System.out.println("Estoque insuficiente.");
    }

    public void reporEstoque(int quantidade){
        quantidadeEstoque += quantidade;
    }

    //Construtor

    public Produto(String nome, String categoria, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    //Métodos acessores e modificadores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
