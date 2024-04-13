
package br.edu.up.exercicios;

import br.edu.up.modelos.Mamao;
import java.util.Scanner;

public class Exercicio05 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra:");
        double valorCompra = scanner.nextDouble();

        Mamao compra = new Mamao();
        compra.setValorCompra(valorCompra);

        


        double valorPrestacao = compra.calcularPrestacoes();
        System.out.println("Valor de cada prestação: R$" + valorPrestacao);

        
    }
}
