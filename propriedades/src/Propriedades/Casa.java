package Propriedades;

public class Casa extends Propriedade {

    private double taxa;
    public Casa(String titulo, String descricao, String localizacao, int capacidade, double preco, String proprietario, double taxa) {
        super(titulo, descricao, localizacao, capacidade, preco, proprietario);
        this.taxa = taxa;
    }

    @Override
    public double getPreco() {
        return this.preco + (this.preco * this.taxa);
    }
}
