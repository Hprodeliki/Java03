package br.edu.up;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Pessoa;

public class Programa {

    public static void main(String[] args) {

        Pessoa lucas = new Pessoa();
        // lucas.nome = "Lucas";
        lucas.definirNome("Lucas");
        lucas.definirIdade(30);
        lucas.definirAltura(190);

        Pessoa eudes = new Pessoa();
        // eudes.nome = "Eudes";
        eudes.definirNome("Eudes");

        Pessoa jean = new Pessoa();
        // jean.nome = "Jean";
        jean.definirNome("Jean");

        Carro uno = new Carro(150);
        // uno.velocidade = -230;
        // uno.setVelocidade(500);
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();

        uno.frear();

        System.out.println("Velocidade UNO:" + uno.getVelocidade());

        Carro bmw = new Carro(240);
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();

        System.out.println("Velocidade BMW:" + bmw.getVelocidade());

    }

}
