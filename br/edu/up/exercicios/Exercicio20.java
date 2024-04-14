package br.edu.up.exercicios;

import br.edu.up.modelos.Aprender;
import java.util.Scanner;

public class Exercicio20 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();
        System.out.println("Informe o número de horas/aula:");
        int horasAula = scanner.nextInt();
      
        Aprender professor = new Aprender(nivel, horasAula);

      
        double salario = professor.calcularSalario();
        System.out.println("Salário do professor: R$" + salario);

        
    }
}
