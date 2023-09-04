package subclasses;

import classes.Endereco;
import classes.Pessoa;
import enums.Cargo;

public class Funcionario extends Pessoa {
    private int ctps;
    private Cargo cargo;
    private Endereco endereco;

    public Funcionario(String nomePessoa, String email, int cpf) {
        super(nomePessoa, email, cpf);
        this.ctps = ctps;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public Cargo getFuncao() {
        return cargo;
    }

    public void setFuncao(Cargo cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
