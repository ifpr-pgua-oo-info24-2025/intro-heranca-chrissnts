package com.santos.christian.Models;

public class Moto extends Veiculo {
    private String tipoDeGuidao;

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public String exibirDetalhes() {
        return "\nDetalhes do Veículo"
                + "\n"
                + "\nMarca : " + this.getMarca()
                + "\nModelo: " + this.getModelo()
                + "\nAno   : " + this.getAno()
                + "\nTipo de Guidao: " + this.getTipoDeGuidao()
                + "\n";
    }
}
