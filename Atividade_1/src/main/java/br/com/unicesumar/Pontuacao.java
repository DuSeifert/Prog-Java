package br.com.unicesumar;

public class Pontuacao {

    int pontuacao;

    public Pontuacao() {
        this.pontuacao = 0;
    }

    public void adicionarPontos(int p) {
        pontuacao += p;
    }

    public void removerPontos(int p) {
        if (pontuacao >= p) {
            pontuacao -= p;
        }
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
