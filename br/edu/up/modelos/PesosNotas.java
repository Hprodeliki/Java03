package br.edu.up.modelos;
public class PesosNotas {

    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;

    public PesosNotas(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }
    public double calcularNotaFinal() {
        double notaFinal = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }

}
