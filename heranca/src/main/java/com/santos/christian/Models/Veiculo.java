package com.santos.christian.Models;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDetalhes() {
        return "\nDetalhes do Veículo"
                + "\n"
                + "\nMarca : " + this.getMarca()
                + "\nModelo: " + this.getModelo()
                + "\nAno   : " + this.getAno()
                + "\n";
    }
}
