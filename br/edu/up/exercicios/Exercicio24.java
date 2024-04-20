package br.edu.up.exercicios;

import br.edu.up.modelos.PesosNotas;
import java.util.Scanner;

public class Exercicio24 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Informe a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Informe a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        PesosNotas estudante = new PesosNotas(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        double notaFinal = estudante.calcularNotaFinal();
        System.out.println("A nota final do estudante é: " + notaFinal);

    }
}
