public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    double somaDasAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void ExibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

    }

    void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacao / totalDeAvaliacoes;
    }
}
