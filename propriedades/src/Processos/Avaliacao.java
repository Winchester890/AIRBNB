package Processos;

import Propriedades.Propriedade;
import Usuario.Usuario;

public class Avaliacao {
    private Propriedade propriedade;
    private Usuario usuario;
    private int nota;
    private String comentario;

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Avaliacao(Propriedade propriedade, Usuario usuario, int nota, String comentario) {
        this.propriedade = propriedade;
        this.usuario = usuario;
        this.nota = nota;
        this.comentario = comentario;
    }
}
