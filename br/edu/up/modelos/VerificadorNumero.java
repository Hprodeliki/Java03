
package br.edu.up.modelos;

public class VerificadorNumero {

    public static int contarNumerosNoIntervalo(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 10 && numero <= 150) {
            contador++;
            }
        }
        return contador;
    }
}

