package br.edu.up.exercicios;

import br.edu.up.modelos.ContaDeLuz;
import java.util.Scanner;

public class Exercicio22 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria):");
        int tipoCliente = scanner.nextInt();

        System.out.println("Informe o consumo em KW/h:");
        double consumoKwh = scanner.nextDouble();
        ContaDeLuz contaDeLuz = new ContaDeLuz(tipoCliente, consumoKwh);
        double valorConta = contaDeLuz.calcularValorConta();
        System.out.println("Valor da conta de luz: R$" + valorConta);
    }
}

