package Processos;

import Propriedades.Propriedade;
import Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Processo {
    private List<Propriedade> propriedadeList = new ArrayList<>();
    private List<Usuario> usuarioList = new ArrayList<>();
    private double custo;
    private Pagar pagar;
    private List<Avaliacao> avaliacaoList = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public List<Avaliacao> getAvaliacaoList() {
        return avaliacaoList;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }

    public double getCusto() {
        return custo;
    }

    public List<Propriedade> getPropriedadeList() {
        return propriedadeList;
    }
    public void addPropriedade(Propriedade propriedade) {
        propriedadeList.add(propriedade);
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }
    public void addUsuario(Usuario usuario) {
        usuarioList.add(usuario);
    }

    public Propriedade getPropriedadeByTitulo (String titulo) {
        for (Propriedade propriedade : propriedadeList) {
            if (propriedade.getTitulo().equals(titulo)) {
                return propriedade;
            }
        }
        System.out.println("Propriedade com o título " + titulo + " não encontrada!");
        return null;
    }

    public Usuario getUsuarioByNome(String nome) {
        for (Usuario user : usuarioList) {
            if (user.getNome().equals(nome)) {
                return user;
            }
        }
        System.out.println("Usuário com o nome " + nome + " não encontrado!");
        return null;
    }
    public void addAvaliacao(Avaliacao avaliacao) {
        avaliacaoList.add(avaliacao);
    }
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }
    public void avaliar(Avaliacao avaliacao) {
        if (avaliacao.getNota() <= 5 && avaliacao.getNota() >= 1) {
            System.out.println("Agradecemos pela sua avaliação para a propriedade " + avaliacao.getPropriedade().getTitulo() + ", Sr(a) " + avaliacao.getUsuario().getNome() + "!");
            addAvaliacao(avaliacao);
            avaliacao.getPropriedade().setAvaliacoes();
        } else {
            System.out.println("Só são permitidas notas entre 1 e 5!");
        }
    }
    public void reservar(Usuario usuario, Reserva reserva) {
        custo = reserva.getPropriedade().getPreco() * reserva.getNoites();
        addReserva(reserva);
        reserva.getPropriedade().setCapacidade();
        System.out.println("Reserva realizada, Sr(a) " + usuario.getNome() + "!");
        System.out.println("Custo total: R$" + custo);
        pagar.pagar(usuario);
    }

    public List<Avaliacao> findByTitulo(String titulo) {
        if (avaliacaoList != null) {
            return avaliacaoList.stream()
                    .filter(avaliacao -> avaliacao.getPropriedade().getTitulo().contains(titulo))
                    .collect(Collectors.toList());
        }
        return avaliacaoList;
    }

}
