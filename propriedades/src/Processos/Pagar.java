package Processos;
import Usuario.Usuario;

import java.util.Scanner;
public class Pagar {
    private Processo processo;

    Scanner scanner = new Scanner(System.in);
    public void pagar(Usuario usuario) {
        System.out.print("Pagamento da reserva: R$");
        double dinheiro = scanner.nextDouble();
        if (dinheiro < processo.getCusto()) {
            System.out.println("Dinheiro insuficiente!");
        } else {
            System.out.println("Agradecemos pela preferência, Sr(a) " + usuario.getNome() + "!");
        }
    }
}
