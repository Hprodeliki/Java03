package br.edu.up.exercicios;

import br.edu.up.modelos.Nadador;
import java.util.Scanner;

public class Exercicio21 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do nadador:");
        int idade = scanner.nextInt();
        Nadador nadador = new Nadador(idade);

        String categoria = nadador.classificarCategoria();
        System.out.println("Categoria do nadador: " + categoria);

    }
}

