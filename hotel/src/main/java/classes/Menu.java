package classes;

import java.util.Scanner;

import enums.UnidadeFederativa;

public interface Menu {
    public static void menuPrincipal(){
        char opcaoDigitada;

        System.out.println("MENU DE CADASTRO:");
        System.out.println("");
        System.out.println("Digite (1) para cadastrar um novo funcionário.");
        System.out.println("Digite (2) para se cadastrar como cliente.");
        Scanner leiaCadastro = new Scanner(System.in);
        opcaoDigitada  = leiaCadastro.next().charAt(0);

        switch (opcaoDigitada) {
            case 1:
                menuCadastroCliente();
                break;
            case 2:

                break;
            default:
                System.out.println("Digite um número válido.");
                menuPrincipal();
                break;
        }
        
    }

    public static void menuCadastroCliente() {
        String nome;
        String email;
        int cpf;
        UnidadeFederativa uf;
        String cidade;
        
    }


}
