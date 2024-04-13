
package br.edu.up.exercicios;

import br.edu.up.modelos.Idade;
import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja verificar?");
        int quantidadePessoas = scanner.nextInt();

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            String mensagem = Idade.verificarIdade(idade);
            System.out.println("Pessoa " + i + ": " + mensagem);
        }

    }
}
