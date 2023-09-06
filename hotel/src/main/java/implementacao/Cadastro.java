package implementacao;
import java.util.Scanner;

import classes.Menu;
import enums.Cargo;

public class Cadastro extends Menu {

    @Override
    public void menuPrincipal() {
        int opcaoEscolhida;

        System.out.println("Digite (1) para cadastrar um funcionário.");
        System.out.println("Digite (2) para se cadastrar como cliente.");
        Scanner leiaOpcao = new Scanner(System.in);
        opcaoEscolhida = leiaOpcao.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                menuCadastroFuncionario();
                break;
            case 2:
                menuCadastroCliente();
                break;
            default:
                System.out.println("Digite um número válido!!");
                System.out.println(" ");
                menuPrincipal();
                break;
        }
    }

    @Override
    public void menuCadastroFuncionario() {
        String nomePessoa;
        String email;
        int cpf;
        int ctps;
        String uf;
        String cidade;
        String bairro;
        String rua;
        int numero;
        String complemento;
        Cargo cargo;

        Scanner leiaCadastroFuncionario = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("TELA DE CADASTRO DO CLIENTE");
        System.out.println(" ");
        System.out.println("Digite seu nome: ");
        nomePessoa = leiaCadastroFuncionario.nextLine();
        System.out.println("Digite seu email:");
        email = leiaCadastroFuncionario.nextLine();
        System.out.println("Digite seu cpf: ");
        cpf = leiaCadastroFuncionario.nextInt();


    }

    @Override
    public void menuCadastroCliente() {
        System.out.println("cliente");
    }

}
