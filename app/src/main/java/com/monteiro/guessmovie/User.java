package com.monteiro.guessmovie;

public class User {

    private int uLevelFilmes;
    private int uLevelSeries;
    private int uLevelAnimes;
    private int uLevelGames;
    private int coins;

    public User(int uLevelFilmes, int uLevelSeries, int uLevelAnimes, int uLevelGames, int coins) {
        this.uLevelFilmes = uLevelFilmes;
        this.uLevelSeries = uLevelSeries;
        this.uLevelAnimes = uLevelAnimes;
        this.uLevelGames = uLevelGames;
        this.coins = coins;
    }

    public int getuLevelFilmes() {
        return uLevelFilmes;
    }

    public void setuLevelFilmes(int uLevelFilmes) {
        this.uLevelFilmes = uLevelFilmes;
    }

    public int getuLevelSeries() {
        return uLevelSeries;
    }

    public void setuLevelSeries(int uLevelSeries) {
        this.uLevelSeries = uLevelSeries;
    }

    public int getuLevelAnimes() {
        return uLevelAnimes;
    }

    public void setuLevelAnimes(int uLevelAnimes) {
        this.uLevelAnimes = uLevelAnimes;
    }

    public int getuLevelGames() {
        return uLevelGames;
    }

    public void setuLevelGames(int uLevelGames) {
        this.uLevelGames = uLevelGames;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
