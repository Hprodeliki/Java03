package br.edu.up.modelos;

public class Mamao {

    private double valorCompra;

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularPrestacoes() {
        return valorCompra / 5;
    }
}

