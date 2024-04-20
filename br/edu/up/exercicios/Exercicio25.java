package br.edu.up.exercicios;

import br.edu.up.modelos.EstudanteEx25;
import java.util.Scanner;

public class Exercicio25 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Informe o número de matrícula do estudante:");
        int numeroMatricula = scanner.nextInt();
        System.out.println("Informe a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Informe a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Informe a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        EstudanteEx25 estudante = new EstudanteEx25(nome, numeroMatricula, notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);

        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Número de matrícula: " + estudante.getNumeroMatricula());
        System.out.println("Nota final: " + estudante.getNotaFinal());
        System.out.println("Classificação: " + estudante.getClassificacao());

    }
}
