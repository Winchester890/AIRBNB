package Propriedades;

public class Resort extends Propriedade {
    private double despesas;
    public Resort(String titulo, String descricao, String localizacao, int capacidade, double preco, String proprietario, double despesas) {
        super(titulo, descricao, localizacao, capacidade, preco, proprietario);
        this.despesas = despesas;
    }

    @Override
    public double getPreco() {
        return this.preco + this.despesas;
    }
}
