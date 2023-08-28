package classes;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    public Endereco(String estado, String cidade, String bairro, String rua, int numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro= bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
