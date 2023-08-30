package classes;

public class Pessoa {
    private String nomePessoa;
    private String email;
    private int cpf;

    public Pessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
        this.email = email;
        this.cpf = cpf;
    }

    public Pessoa(String nomePessoa2, String email2, int cpf2) {
    }

    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
