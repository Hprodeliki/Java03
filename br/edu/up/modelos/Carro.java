package br.edu.up.modelos;

public class Carro extends Veiculo {

    private String marca;
    private String modelo;
    private int velocidade = 0;
    private int velocidadeMaxima;

    // public Carro(int velocidadeMaxima) {
    // this.velocidadeMaxima = velocidadeMaxima;
    // }

    public Carro() {
    }

    public Carro(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(String marca, String modelo, int velocidade, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // public void setVelocidade(int velocidade) {
    // this.velocidade = velocidade;
    // }

    public boolean estaParado() {
        return velocidade == 0 ? true : false;
    }

    public void acelerar() {
        if (velocidade < velocidadeMaxima) {
            velocidade++;
        }
    }

    public void frear() {
        if (velocidade >= 0) {
            velocidade--;
        }
    }
}
