
package br.edu.up.modelos;

public class Idade {

    public static String verificarIdade(int idade) {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
