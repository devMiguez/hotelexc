package subclasses;

import classes.Endereco;
import classes.Pessoa;

public class Funcionario extends Pessoa {
    private int ctps;
    private Endereco endereco;

    public Funcionario(String nomePessoa, String email, int cpf) {
        super(nomePessoa, email, cpf);
        this.ctps = ctps;
        this.endereco = endereco;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
