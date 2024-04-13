
package br.edu.up.exercicios;

import br.edu.up.modelos.Moeda;
import java.util.Scanner;

public class Exercicio04 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Informe a quantidade de dólares disponíveis:");
        double quantidadeDolar = scanner.nextDouble();

        
        Moeda conversor = new Moeda();
        conversor.setCotacaoDolar(cotacaoDolar);

        
        double valorReal = conversor.converterDolarParaReal(quantidadeDolar);
        System.out.println("Valor em real (R$): R$" + valorReal);

        
    }
}

