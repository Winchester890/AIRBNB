package Propriedades;

public abstract class Propriedade {
    protected String titulo;
    protected String descricao;
    protected String localizacao;
    protected int capacidade;
    protected double preco;
    protected String proprietario;
    protected int avaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public abstract double getPreco();

    public String getProprietario() {
        return proprietario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setCapacidade() {
        this.capacidade -= 1;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes() {
        this.avaliacoes += 1;
    }

    public Propriedade(String titulo, String descricao, String localizacao, int capacidade, double preco, String proprietario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.preco = preco;
        this.proprietario = proprietario;
    }

}
