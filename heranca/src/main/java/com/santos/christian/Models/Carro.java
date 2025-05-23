package com.santos.christian.Models;

public class Carro extends Veiculo {

    private int numPortas;

    public int getNumPortas() {
        return numPortas;
    }


    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String exibirDetalhes() {
        return "\nDetalhes do Veículo"
                + "\n"
                + "\nMarca : " + this.getMarca()
                + "\nModelo: " + this.getModelo()
                + "\nAno   : " + this.getAno()
                + "\nNumero de Portas   : " + this.getNumPortas()
                + "\n";
    }
}
