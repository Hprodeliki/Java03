
package br.edu.up.modelos;

public class Moeda {

    private double cotacaoDolar;

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterDolarParaReal(double quantidadeDolar) {
        return quantidadeDolar * cotacaoDolar;
    }
}

