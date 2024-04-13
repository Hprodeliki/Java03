package br.edu.up.exercicios;

import br.edu.up.modelos.Triangulo;
import java.util.Scanner;

public class Exercicio19 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro lado:");
        int lado1 = scanner.nextInt();

        System.out.println("Informe o valor do segundo lado:");
        int lado2 = scanner.nextInt();

        System.out.println("Informe o valor do terceiro lado:");
        int lado3 = scanner.nextInt();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        
        String tipoTriangulo = triangulo.verificarTipoTriangulo();
        System.out.println("Triangulo " + tipoTriangulo);

       
    }
}

