package br.edu.up.exercicios;
import br.edu.up.modelos.Peso;
import java.util.Scanner;

public class Exercicio23 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("informe o sexo da pessoa (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Informe a altura da pessoa (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Informe a idade da pessoa:");
        int idade = scanner.nextInt();

        Peso pessoa = new Peso(nome, sexo, altura, idade);

        double pesoIdeal = pessoa.calcularPesoIdeal();
        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Peso ideal: " + pesoIdeal + " kg");

    }
}
