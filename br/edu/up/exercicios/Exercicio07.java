package br.edu.up.exercicios;

import br.edu.up.modelos.CarroEx7;

import java.util.Scanner;

public class Exercicio07 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        CarroEx7 carro = new CarroEx7();
        carro.setCustoFabrica(custoFabrica);
        carro.setPercentualDistribuidor(28); 
        carro.setPercentualImpostos(45);

        double custoConsumidor = carro.calcularCustoConsumidor();
        System.out.println("Custo ao consumidor do carro: R$" + custoConsumidor);

        // Indrustria Automotiva sofre com os impostos, mt absurdos
    }
}
