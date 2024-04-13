package br.edu.up.modelos;

public class Funcionario {

    private double salario;
    private static final double salariomin = 1100;
    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void reajustarSalario() {
        if (salario < 3 * salariomin) {
            salario *= 1.5;
        } else if (salario >= 3 * salariomin && salario <= 10 * salariomin) {
            salario *= 1.2; 
        } else if (salario > 10 * salariomin && salario <= 20 * salariomin) {
            salario *= 1.15; 
        } else {
            salario *= 1.1;
        }
    }
}
