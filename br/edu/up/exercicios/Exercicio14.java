// Exercicio14.java
package br.edu.up.exercicios;

import br.edu.up.modelos.ProdutoEx14;
import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.println("Informe o preço de custo do produto " + i + ":");
            double precoCusto = scanner.nextDouble();

            System.out.println("Informe o preço de venda do produto " + i + ":");
            double precoVenda = scanner.nextDouble();

            ProdutoEx14 produto = new ProdutoEx14();
            produto.setPrecoCusto(precoCusto);
            produto.setPrecoVenda(precoVenda);
            String resultado = produto.verificarLucroOuPrejuizo();

        
            System.out.println("Produto " + i + ": " + resultado);

      
            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
        }

       
        double mediaPrecoCusto = somaPrecoCusto / 40;
        double mediaPrecoVenda = somaPrecoVenda / 40;
        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

    }
}
