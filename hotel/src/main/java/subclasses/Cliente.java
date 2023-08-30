package subclasses;

import classes.Endereco;
import classes.Pessoa;

public class Cliente extends Pessoa {
    private Endereco endereco;

    public Cliente (String nomePessoa, String email, int cpf) {
        super(nomePessoa, email, cpf);
        this.endereco = endereco;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " +   this.getNomePessoa());
        System.out.println("CPF: " + this.getCpf());
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
