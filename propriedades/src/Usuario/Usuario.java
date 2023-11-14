package Usuario;

import Processos.Reserva;
import Processos.Avaliacao;
import Propriedades.Propriedade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
    private List<Reserva> reservas = new ArrayList<>();
    private String nome;
    private String email;
    private String senha;
    private List<Avaliacao> avaliacaoList = new ArrayList<>();

    public List<Reserva> getReservas() {
        return reservas;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Avaliacao> getAvaliacaoList() {
        return avaliacaoList;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void addAvaliacao(Avaliacao avaliacao) {
        avaliacaoList.add(avaliacao);
    }
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

}
