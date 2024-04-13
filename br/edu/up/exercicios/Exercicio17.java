
package br.edu.up.exercicios;

import br.edu.up.modelos.FuncionarioEx17;
import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.nextLine();

   
        System.out.println("Informe o salário do funcionário:");
        double salario = scanner.nextDouble();

      
        System.out.println("Informe o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

       
        FuncionarioEx17 funcionario = new FuncionarioEx17(nome, salario);

    
        funcionario.reajustarSalario(salarioMinimo);
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Reajuste: " + (funcionario.getSalario() - salario));
        System.out.println("Novo salário: " + funcionario.getSalario());

        double aumentoFolha = funcionario.getSalario() - salario;
        System.out.println("Aumento da folha de pagamento: " + aumentoFolha);

       
    }
}
