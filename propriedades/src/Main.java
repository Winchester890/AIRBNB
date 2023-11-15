import Processos.Avaliacao;
import Processos.Processo;
import Processos.Reserva;
import Propriedades.Apartamento;
import Propriedades.Casa;
import Propriedades.Propriedade;
import Propriedades.Resort;
import Usuario.Usuario;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Processo processo = new Processo();
    public static void main(String[] args) {
        Casa casa1 = new Casa("Mackenzie", "Casa bem grande", "Rua Mackenzie 905", 10, 222, "John", 0.3);
        Apartamento apartamento1 = new Apartamento("Condomínio P", "Aptos em frente ao parque", "Barueri", 25, 450, "Aurélio", 200);
        processo.addPropriedade(casa1);
        processo.addPropriedade(apartamento1);
        Usuario usuario1 = new Usuario("Donizette", "donizette@gmail.com", "1234");
        Usuario usuario2 = new Usuario("Luiz", "luiz@gmail.com", "4321");
        processo.addUsuario(usuario1);
        processo.addUsuario(usuario2);

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("------ Bem-vindo(a) ------");
            System.out.println(" ");
            System.out.println("------ Para Proprietários ------");
            System.out.println("1 - Cadastrar Propriedade");
            System.out.println("2 - Listar Propriedades Cadastradas");
            System.out.println("3 - Verificar Propriedades Reservadas");
            System.out.println("4 - Listar Avaliações");
            System.out.println(" ");
            System.out.println("------ Para Usuários ------");
            System.out.println("5 - Cadastrar-se");
            System.out.println("6 - Reservar Propriedade");
            System.out.println("7 - Avaliar Propriedade");
            System.out.println("0 - Sair");
            System.out.print("Qual operação você deseja realizar? ");
            opcao = Integer.parseInt(scanner.next());

            menu(opcao);
        } while(opcao != 0);
    }
    public static void menu(int opcao) {
        Scanner scanner = new Scanner(System.in);
        switch (opcao) {
            case 1:
                System.out.print("Você deseja cadastrar (1) casa, (2) apartamento ou (3) resort?");
                int resposta = Integer.parseInt(scanner.next());
                if (resposta == 1) {
                    System.out.print("Informe o título da Casa: ");
                    String titulo = scanner.next();
                    System.out.print("Informe a descrição: ");
                    String descricao = scanner.next();
                    System.out.print("Informe a localização: ");
                    String localizacao = scanner.next();
                    System.out.print("Informe a capacidade da Casa: ");
                    int capacidade = Integer.parseInt(scanner.next());
                    System.out.print("Informe o preço por noite: ");
                    double preco = Double.parseDouble(scanner.next());
                    System.out.print("Informe o nome do proprietário: ");
                    String proprietario = scanner.next();
                    System.out.print("Informe a taxa: ");
                    double taxa = Double.parseDouble(scanner.next());

                    Casa casa3 = new Casa(titulo, descricao, localizacao, capacidade, preco, proprietario, taxa);
                    processo.addPropriedade(casa3);

                    System.out.println(" ");
                    System.out.println("Casa cadastrada com sucesso.");
                } else if (resposta == 2) {
                    System.out.print("Informe o título do Apartamento: ");
                    String titulo = scanner.next();
                    System.out.print("Informe a descrição: ");
                    String descricao = scanner.next();
                    System.out.print("Informe a localização: ");
                    String localizacao = scanner.next();
                    System.out.print("Informe a capacidade do Apartamento: ");
                    int capacidade = Integer.parseInt(scanner.next());
                    System.out.print("Informe o preço por noite: ");
                    double preco = Double.parseDouble(scanner.next());
                    System.out.print("Informe o nome do proprietário: ");
                    String proprietario = scanner.next();
                    System.out.print("Informe o preço extra por reserva: ");
                    double apto = Double.parseDouble(scanner.next());

                    Apartamento apartamento3 = new Apartamento(titulo, descricao, localizacao, capacidade, preco, proprietario, apto);
                    processo.addPropriedade(apartamento3);

                    System.out.println(" ");
                    System.out.println("Apartamento cadastrado com sucesso.");
                } else if (resposta == 3) {
                    System.out.print("Informe o título do Resort: ");
                    String titulo = scanner.next();
                    System.out.print("Informe a descrição: ");
                    String descricao = scanner.next();
                    System.out.print("Informe a localização: ");
                    String localizacao = scanner.next();
                    System.out.print("Informe a capacidade do Resort: ");
                    int capacidade = Integer.parseInt(scanner.next());
                    System.out.print("Informe o preço por noite: ");
                    double preco = Double.parseDouble(scanner.next());
                    System.out.print("Informe o nome do proprietário: ");
                    String proprietario = scanner.next();
                    System.out.print("Informe as despesas totais por reserva: ");
                    double despesas = Double.parseDouble(scanner.next());

                    Resort resort1 = new Resort(titulo, descricao, localizacao, capacidade, preco, proprietario, despesas);
                    processo.addPropriedade(resort1);

                    System.out.println(" ");
                    System.out.println("Resort cadastrado com sucesso.");
                } else {
                    System.out.println("Opção inválida.");
                }
                break;
            case 2:
                List<Propriedade> propriedades = processo.getPropriedadeList();
                for (Propriedade propriedade : propriedades) {
                    System.out.println("Título: " + propriedade.getTitulo());
                    System.out.println("Descrição: " + propriedade.getDescricao());
                    System.out.println("Localização: " + propriedade.getLocalizacao());
                    System.out.println("Capacidade atual: " + propriedade.getCapacidade());
                    System.out.println("Preço por noite: " + propriedade.getPreco());
                    System.out.println("Proprietário: " + propriedade.getProprietario());
                    System.out.println("Número de avaliações recebidas: " + propriedade.getAvaliacoes());
                }
                break;
            case 3:
                List<Usuario> usuarios = processo.getUsuarioList();
                System.out.println("Propriedades reservadas: ");
                for (Usuario usuario : usuarios) {
                    System.out.println(usuario.getReservas());
                }
                break;
            case 4:
                System.out.print("Digite o titulo da propriedade a ser mostrada as avaliações: ");
                String ti = scanner.next();
                List<Avaliacao> avaliacaos = processo.getAvaliacaoList();
                avaliacaos = processo.findByTitulo(ti);
                System.out.println(avaliacaos);
                break;
            case 5:
                System.out.print("Informe o nome: ");
                String nome = scanner.next();
                System.out.print("Informe o e-mail: ");
                String email = scanner.next();
                System.out.print("Crie uma senha: ");
                String senha = scanner.next();

                Usuario usuario3 = new Usuario(nome, email, senha);
                processo.addUsuario(usuario3);

                System.out.println(" ");
                System.out.println("Usuário cadastrado com sucesso.");
                break;
            case 6:
                System.out.print("Informe o usuário que irá fazer a reserva pelo nome: ");
                String name = scanner.next();
                System.out.print("Informe o número de noites da estadia: ");
                int noites = Integer.parseInt(scanner.next());
                System.out.print("Informe a propriedade pelo título: ");
                String titulo = scanner.next();

                Propriedade pp = processo.getPropriedadeByTitulo(titulo);
                Usuario user = processo.getUsuarioByNome(name);
                Reserva reserva3 = new Reserva(noites, pp);
                processo.reservar(user, reserva3);
                break;
            case 7:
                System.out.print("Informe a propriedade a ser avaliada pelo título: ");
                String title = scanner.next();
                System.out.print("Informe o usuário que irá avaliar pelo nome: ");
                String nomi = scanner.next();
                System.out.print("Qual sua nota de avaliação? (1 - 5)");
                int nota = Integer.parseInt(scanner.next());
                System.out.print("Deixe um comentário: ");
                String comentario = scanner.next();

                Usuario usu = processo.getUsuarioByNome(nomi);
                Propriedade propri = processo.getPropriedadeByTitulo(title);

                Avaliacao avaliacao1 = new Avaliacao(propri, usu, nota, comentario);
                processo.avaliar(avaliacao1);
                break;
        }
    }
}
