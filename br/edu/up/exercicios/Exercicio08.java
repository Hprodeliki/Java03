// Exercicio08.java
package br.edu.up.exercicios;

import br.edu.up.modelos.AlunoEx8;
import java.util.Scanner;

public class Exercicio08 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Informe as três notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        AlunoEx8 aluno = new AlunoEx8();
        aluno.setNome(nomeAluno);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        aluno.setNota3(nota3);

        double media = aluno.calcularMedia();
        String mencao = aluno.obterMencao();

   
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);

       
    }
}
