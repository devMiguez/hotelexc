package classes;

import java.util.Scanner;

public class Hotel {
    private String nomeHotel;
    private String endereco;
    private String cnpj;

    public Hotel() {
        this.nomeHotel = "Hotel JPR" + nomeHotel;
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
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}
