
package br.edu.up.modelos;

public class Sexo {

    private String nome;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String obterGenero() {
        if (sexo == 'M') {
            return "Homem";
        } else {
            return "Mulher";
        }
    }
}

