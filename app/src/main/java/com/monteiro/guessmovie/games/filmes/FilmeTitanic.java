package com.monteiro.guessmovie.games.filmes;

public class FilmeTitanic {

    int imagem;
    String[] resposta;
    String fase_atual;
    String fase_total;
    String tipo;

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String[] getResposta() {
        return resposta;
    }

    public void setResposta(String[] resposta) {
        this.resposta = resposta;
    }

    public String getFase_atual() {
        return fase_atual;
    }

    public void setFase_atual(String fase_atual) {
        this.fase_atual = fase_atual;
    }

    public String getFase_total() {
        return fase_total;
    }

    public void setFase_total(String fase_total) {
        this.fase_total = fase_total;
    }
}
