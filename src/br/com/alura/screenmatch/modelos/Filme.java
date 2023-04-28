package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void ExibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

    }

    public void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacao / totalDeAvaliacoes;
    }
}
