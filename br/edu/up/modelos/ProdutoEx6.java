
package br.edu.up.modelos;

public class ProdutoEx6 {

    private double precoCusto;
    private double percentualAcrescimo;

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPercentualAcrescimo() {
        return percentualAcrescimo;
    }

    public void setPercentualAcrescimo(double percentualAcrescimo) {
        this.percentualAcrescimo = percentualAcrescimo;
    }

    public double calcularPrecoVenda() {
        double acrescimo = precoCusto * (percentualAcrescimo / 100);
        return precoCusto + acrescimo;
    }
}
