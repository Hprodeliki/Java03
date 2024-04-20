package br.edu.up.modelos;

public class Seguro {

    private String nome;
    private int idade;
    private int grupoRisco;

    public Seguro(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String determinarCategoria() {
        if (idade < 17 || idade > 70) {
            return "Não se enquadra em nenhuma categoria de seguro.";
        }

        int categoria = 0;

        if (idade >= 17 && idade <= 20) {
            categoria = grupoRisco;
        } else if (idade >= 21 && idade <= 24) {
            categoria = grupoRisco - 1;
        } else if (idade >= 25 && idade <= 34) {
            categoria = grupoRisco - 2;
        } else if (idade >= 35 && idade <= 64) {
            categoria = grupoRisco - 3;
        } else if (idade >= 65 && idade <= 70) {
            categoria = grupoRisco + 3;
        }

        return "Seguro: " + categoria;
    }
}
