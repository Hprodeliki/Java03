
package br.edu.up.modelos;

public class FuncionarioEx18 {

    private String nome;
    private int idade;
    private char sexo; 
    private double salarioFixo;

    public FuncionarioEx18(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularAbono() {
        double abono = 0;
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 50;
            } else {
                abono = 100;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                abono = 80;
            } else {
                abono = 200;
            }
        }
        
        return abono;
    }
    public double calcularSalarioLiquido() {
        return salarioFixo + calcularAbono();
    }
}
