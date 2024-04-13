
package br.edu.up.exercicios;

import br.edu.up.modelos.Carango;
import java.util.Scanner;

public class Exercicio12 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            System.out.println("Informe o ano do veículo:");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o valor do veículo:");
            double valor = scanner.nextDouble();
            scanner.nextLine(); 

            
            Carango veiculo = new Carango();
            veiculo.setAno(ano);
            veiculo.setValor(valor);

       
            double desconto = veiculo.calcularDesconto();
            double valorComDesconto = veiculo.calcularValorComDesconto();

     
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorComDesconto);
            
            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral++;

      
            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = scanner.nextLine().charAt(0);
        }

        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral: " + totalGeral);

    }
}
