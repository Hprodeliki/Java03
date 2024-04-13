// Exercicio11.java
package br.edu.up.exercicios;

import br.edu.up.modelos.Sexo;
import java.util.Scanner;

public class Exercicio11 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Informe o sexo da pessoa " + i + " (M/F):");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();

         
            Sexo pessoa = new Sexo();
            pessoa.setNome(nome);
            pessoa.setSexo(sexo);

    
            System.out.println("Nome: " + pessoa.getNome() + ", Gênero: " + pessoa.obterGenero());

          
            if (sexo == 'M') {
                totalHomens++;
            } else if (sexo == 'F') {
                totalMulheres++;
            }
        }
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

    }
}
