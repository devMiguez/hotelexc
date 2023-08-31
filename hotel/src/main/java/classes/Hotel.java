package classes;

import java.util.Scanner;

public class Hotel {
    private String nomeHotel;
    private Endereco endereco;
    private String cnpj;

    public Hotel(String nomeHotel, Endereco endereco) {
        this.nomeHotel = "Hotel JPR" + nomeHotel;
        this.endereco = endereco;
        perguntaCnpj();
    }

    public void perguntaCnpj() {
        String cnpjDigitado = "";

        while(!validaCnpj(cnpjDigitado)) {
            System.out.println("Digite o cnpj da empresa: ");
            Scanner leiaCnpj = new Scanner(System.in);
            cnpjDigitado = leiaCnpj.nextLine();
        }
        setCnpj(cnpjDigitado);
        System.out.println("");


    }

    public boolean validaCnpj(String cnpj) {
        if (cnpj.length() == 14) {
            return true;
        }else {
            return false;
        }
    }


    public String getNomeHotel() {
        return nomeHotel;
    }
    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}
