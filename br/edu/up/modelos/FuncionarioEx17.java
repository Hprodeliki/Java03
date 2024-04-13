
package br.edu.up.modelos;

public class FuncionarioEx17 {

    private String nome;
    private double salario;

    public FuncionarioEx17(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void reajustarSalario(double salarioMinimo) {
        double novoSalario = salario;
        if (salario < 3 * salarioMinimo) {
            novoSalario *= 1.5; 
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            novoSalario *= 1.2; 
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            novoSalario *= 1.15; 
        } else {
            novoSalario *= 1.1; 
        }
        
     
        salario = novoSalario;
    }
}
