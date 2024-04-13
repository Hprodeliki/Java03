
package br.edu.up.exercicios;

import br.edu.up.modelos.Vendedor;
import java.util.Scanner;

public class Exercicio03 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Informe o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Informe o total de vendas efetuadas pelo vendedor:");
        double totalVendas = scanner.nextDouble();

      
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nomeVendedor);
        vendedor.setSalarioFixo(salarioFixo);
        vendedor.setTotalVendas(totalVendas);
        double salarioFinal = vendedor.calcularSalarioFinal();
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo: R$" + vendedor.getSalarioFixo());
        System.out.println("Salário final no final do mês: R$" + salarioFinal);

       
    }
}
