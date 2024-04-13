package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelos.Aluno;

public class Exercicio01 {
  public static void executar() {
    
    System.out.println("Executando Exercicio01...");

    Aluno henrique = new Aluno();

    henrique.setNome( "Henrique");
    henrique.setNota1(5);
    henrique.setNota2(8);
    henrique.setNota3(9);
    
    System.out.println("O aluno " + henrique.getNome() + " ficou com " + henrique.media() + " de média total");
        
  }  
}
 
