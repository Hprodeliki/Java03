
package br.edu.up.modelos;

public class PessoaEx13 {

    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSaude() {
        return saude;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    public boolean estaAptaServicoMilitar() {
        if (idade >= 18 && saude) {
            return true;
        } else {
            return false;
        }
    }
}

