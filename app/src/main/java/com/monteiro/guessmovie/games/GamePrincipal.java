package com.monteiro.guessmovie.games;

public class GamePrincipal{

    public int imagem;
    String[] resposta;
    String[] opcaoDeLetra;

    public GamePrincipal() {
    }

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

    public String[] getOpcaoDeLetra() {
        return opcaoDeLetra;
    }

    public void setOpcaoDeLetra(String[] opcaoDeLetra) {
        this.opcaoDeLetra = opcaoDeLetra;
    }
}
