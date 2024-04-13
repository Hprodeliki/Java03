package br.edu.up.exercicios;

import br.edu.up.modelos.ProdutoEx6;
import java.util.Scanner;

public class Exercicio06 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Informe o percentual de acréscimo (em %):");
        double percentualAcrescimo = scanner.nextDouble();

        ProdutoEx6 produto = new ProdutoEx6();
        produto.setPrecoCusto(precoCusto);
        produto.setPercentualAcrescimo(percentualAcrescimo);
        double precoVenda = produto.calcularPrecoVenda();
        System.out.println("Preço de venda do produto: R$" + precoVenda);

        
    }
}

