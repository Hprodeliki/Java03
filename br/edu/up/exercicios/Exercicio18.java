
package br.edu.up.exercicios;

import br.edu.up.modelos.FuncionarioEx18;

import java.util.Scanner;

public class Exercicio18 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Informe a idade do funcionário:");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.println("Informe o sexo do funcionário (M/F):");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine(); 
        
        System.out.println("Informe o salário fixo do funcionário:");
        double salarioFixo = scanner.nextDouble();

        
        FuncionarioEx18 funcionario = new FuncionarioEx18(nome, idade, sexo, salarioFixo);
        double salarioLiquido = funcionario.calcularSalarioLiquido();
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);

        scanner.close();
    }
}
