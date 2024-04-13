package br.edu.up.modelos;

public class CarroEx7 {

    private double custoFabrica;
    private double percentualDistribuidor;
    private double percentualImpostos;

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double impostos = custoFabrica * (percentualImpostos / 100);
        double custoComImpostos = custoFabrica + impostos;
        double custoComDistribuidor = custoComImpostos * (1 + (percentualDistribuidor / 100));
        return custoComDistribuidor;
    }

    public void setPercentualDistribuidor(double percentualDistribuidor) {
        this.percentualDistribuidor = percentualDistribuidor;
    }

    public void setPercentualImpostos(double percentualImpostos) {
        this.percentualImpostos = percentualImpostos;
    }
}
