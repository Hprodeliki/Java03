
package br.edu.up.exercicios;

import br.edu.up.modelos.VerificadorNumero;
import java.util.Scanner;

public class Exercicio09 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[80];
        for (int i = 0; i < 80; i++) {
            System.out.println("Informe o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

   
        int numerosNoIntervalo = VerificadorNumero.contarNumerosNoIntervalo(numeros);

        
        System.out.println("Números no intervalo entre 10 e 150 : " + numerosNoIntervalo);
    }
}
