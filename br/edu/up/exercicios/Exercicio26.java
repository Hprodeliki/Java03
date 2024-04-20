package br.edu.up.exercicios;
import br.edu.up.modelos.Seguro;
import java.util.Scanner;
public class Exercicio26 {


    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do pretendente:");
        int idade = scanner.nextInt();
        System.out.println("Informe o grupo de risco do pretendente (1 - Baixo, 2 - Médio, 3 - Alto):");
        int grupoRisco = scanner.nextInt();

        Seguro seguro = new Seguro(nome, idade, grupoRisco);

        String categoria = seguro.determinarCategoria();
        System.out.println("Dados do pretendente: Nome - " + nome + ", Idade - " + idade + ", Grupo de risco - " + grupoRisco);
        System.out.println(categoria);

    }
}


