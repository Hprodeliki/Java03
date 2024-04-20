package br.edu.up.modelos;

public class ContaDeLuz {

    public static double ValorCasa = 0.60;
    public static double ValorComercio = 0.48;
    public static double ValorIndustria = 1.29;
    private int tipoCliente;
    private double consumoKwh;

    public ContaDeLuz(int tipoCliente, double consumoKwh) {
        this.tipoCliente = tipoCliente;
        this.consumoKwh = consumoKwh;
    }

    public double calcularValorConta() {
        double valorKwh = 0;
        switch (tipoCliente) {
            case 1:
                valorKwh = ValorCasa;
                break;
            case 2:
                valorKwh = ValorComercio;
                break;
            case 3:
                valorKwh = ValorIndustria;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
        }
        return consumoKwh * valorKwh;
    }
}
