package Propriedades;

public class Apartamento extends Propriedade {
    private double apto;
    public Apartamento(String titulo, String descricao, String localizacao, int capacidade, double preco, String proprietario, double apto) {
        super(titulo, descricao, localizacao, capacidade, preco, proprietario);
        this.apto = apto;
    }

    @Override
    public double getPreco() {
        return this.preco + this.apto;
    }
}
