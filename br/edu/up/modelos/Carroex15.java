package br.edu.up.modelos;

public class Carroex15 {

    private double valor;
    private String combustivel;

    public Carroex15(double valor, String combustivel) {
        this.valor = valor;
        this.combustivel = combustivel;
    }

    public double getValor() {
        return valor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double calcularDesconto() {
        switch (combustivel.toLowerCase()) {
            case "álcool":
                return valor * 0.25;
            case"gasolina":
                return valor * 0.21;
            case "diesel":
                return valor * 0.14;
            default:
                return 0;
        }
    }

    public double calcularValorComDesconto() {
        return valor - calcularDesconto();
    }
}

