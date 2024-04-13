
package br.edu.up.modelos;

public class Triangulo {

    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String verificarTipoTriangulo() {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return "Os lados tem que ser maiores q zero";
        }

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            return "Os valores não conseguem formar um trianfulo";
        }

        if (lado1 == lado2 && lado2 == lado3) {
            return "Triangulo equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Triangulo isósceles";
        } else {
            return "Triangulo escaleno";
        }
    }
}
