package br.edu.up.exercicios;

import br.edu.up.modelos.Funcionario;

public class Exercicio16 {

    public static void executar() {
        Funcionario[] funcionarios = new Funcionario[584];

        for (int i = 0; i < funcionarios.length; i++) {
            double salario = Math.random() * 30 * 1100 + 1;
            funcionarios[i] = new Funcionario(salario);
        }
        for (Funcionario funcionario : funcionarios) {
            funcionario.reajustarSalario();
        for (int i = 0; i < 10; i++) {
            System.out.println("Salário reajustado do funcionário " + (i + 1) + ": r$" + funcionarios[i].getSalario());
            
        }
    }
}
}