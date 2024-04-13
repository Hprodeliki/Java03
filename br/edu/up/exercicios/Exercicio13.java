
package br.edu.up.exercicios;

import br.edu.up.modelos.PessoaEx13;
import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int totalAptos = 0;
        int totalInaptos = 0;

        System.out.println("Quantas pessoas deseja verificar?");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Informe o sexo da pessoa " + i + " (M/F:");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o estado de saúde da pessoa " + i + " (true/false):");
            boolean saude = scanner.nextBoolean();


            scanner.nextLine();
            
            PessoaEx13 pessoa = new PessoaEx13();
            pessoa.setNome(nome);
            pessoa.setSexo(sexo);
            pessoa.setIdade(idade);
            pessoa.setSaude(saude);

            if (pessoa.estaAptaServicoMilitar()) {
                System.out.println("A pessoa " + pessoa.getNome() + " está apta para o serviço militar.");
                totalAptos++;
            } else {
                System.out.println("A pessoa " + pessoa.getNome() + " não está apta para o serviço militar ");
                totalInaptos++;
            }
        }
        System.out.println("Total de aptos: " + totalAptos);
        System.out.println("Total de inaptos: " + totalInaptos);

    }
}
