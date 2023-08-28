package subclasses;

import classes.Endereco;
import classes.Pessoa;

public class Cliente extends Pessoa {
    private Endereco endereco;

    public Cliente (String nomePessoa, String email, int cpf) {
        super(nomePessoa, email, cpf);
        this.endereco = endereco;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
