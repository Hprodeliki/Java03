package br.edu.up.exercicios;
import br.edu.up.modelos.Carro;


public class Exercicio02 {
  
  public static void executar() {

    System.out.println("Executando Exercicio001...");

    Carro golzinho = new Carro();

    golzinho.setCombustivel(6);
    golzinho.setDistancia(120);

    System.out.println("O carro percorreu " + golzinho.getDistancia() + " km com " + golzinho.getCombustivel() + "L de combustivel");
    System.out.println("Então o seu consumo é de " + golzinho.consumo() + "km por litro");


  }
}
