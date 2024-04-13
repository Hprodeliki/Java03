
package br.edu.up.exercicios;

import br.edu.up.modelos.Carroex15;
import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Informe o valor do veículo (0 para encerrar):");
            double valor = scanner.nextDouble();

            if (valor == 0) {
                break;
            }

            scanner.nextLine();

            System.out.println("Informe o tipo de combustível do veículo (álcool, gasolina ou diesel):");
            String combustivel = scanner.nextLine();

            Carroex15 veiculo = new Carroex15(valor, combustivel);

            double desconto = veiculo.calcularDesconto();
            double valorComDesconto = veiculo.calcularValorComDesconto();
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorComDesconto);




            totalDesconto += desconto;
            totalPago += valorComDesconto;
        }

        System.out.println("Total de desconto: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);


    }
}
