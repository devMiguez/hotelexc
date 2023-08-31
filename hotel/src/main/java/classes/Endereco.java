package classes;

import enums.UnidadeFederativa;

public class Endereco {
    private UnidadeFederativa uf;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    public Endereco(UnidadeFederativa uf, String cidade, String bairro, String rua, int numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro= bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public UnidadeFederativa getEstado() {
        return uf;
    }
    public void setEstado(UnidadeFederativa uf) {
        this.uf = uf;
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
