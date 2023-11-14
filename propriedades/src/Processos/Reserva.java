package Processos;

import Propriedades.Propriedade;
import Usuario.Usuario;

public class Reserva {
    private Processo processo;
    private int noites;
    private Propriedade propriedade;

    public int getNoites() {
        return noites;
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public Reserva(int noites, Propriedade propriedade) {
        this.noites = noites;
        this.propriedade = propriedade;
    }

}
