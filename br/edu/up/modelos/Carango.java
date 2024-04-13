
package br.edu.up.modelos;

public class Carango {

    private int ano;
    private double valor;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return valor * 0.12;
        } else {
            return valor * 0.07;
        }
    }

    public double calcularValorComDesconto() {
        return valor - calcularDesconto();
    }
}
