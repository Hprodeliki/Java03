package br.edu.up.modelos;

public class Pessoa extends Humano {

    private String nome;
    private int idade;
    private double altura;

    public void definirNome(String nome) {
        if (nome.length() > 0 && nome.length() < 100) {
            this.nome = nome;
        }
    }

    public void definirIdade(int idade) {
        if (idade > 0 && idade < 150) {
            this.idade = idade;
        }
    }

    public void definirAltura(double altura) {
        if (altura > 30 && altura < 300) {
            this.altura = altura;
        }
    }

}
