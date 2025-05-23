package com.santos.christian;

import com.santos.christian.Models.Carro;
import com.santos.christian.Models.Moto;

public class App {

    public static void main(String[] args) {
        Carro car = new Carro();
        Moto moto = new Moto();

        car.setMarca("BYD");
        car.setModelo("Seal");
        car.setAno(2024);
        car.setNumPortas(4);

        moto.setMarca("Yamaha");
        moto.setModelo("XJ6");
        moto.setAno(2019);
        moto.setTipoDeGuidao("Guidão original Yamaha XJ6");

        System.out.println(car.exibirDetalhes());
        System.out.println(moto.exibirDetalhes());

    }
}
