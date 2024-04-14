package br.edu.up.modelos;

public class Aprender {

    public static  double valornivel1 = 12.0;
    public static  double valornivel2 = 17.0;
    public static  double valornivel3 = 25.0;

    private int nivel;
    private int horasAula;

    public Aprender(int nivel, int horasAula) {
        this.nivel = nivel;
        this.horasAula = horasAula;
    }

    public double calcularSalario() {
        double valorHoraAula = 0;
        switch (nivel) {
            case 1:
                valorHoraAula = valornivel1;
                break;
            case 2:
                valorHoraAula = valornivel2;
                break;
            case 3:
                valorHoraAula = valornivel3;
                break;
            default:
                System.out.println("Nível de professor inválido.");
        }
        return valorHoraAula * horasAula;
    }
}
