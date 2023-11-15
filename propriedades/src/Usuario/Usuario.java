package Usuario;

import Processos.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Reserva> reservas = new ArrayList<>();
    private String nome;
    private String email;
    private String senha;

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


    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }


}
