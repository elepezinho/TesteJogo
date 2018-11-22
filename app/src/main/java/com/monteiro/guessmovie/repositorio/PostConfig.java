package com.monteiro.guessmovie.repositorio;

import android.provider.BaseColumns;

public final class PostConfig {
    private PostConfig() {}
    public static class PostEntry implements BaseColumns {
        public static final String TABLE_NAME = "configuracao";
        public static final String COLUMN_VERSAO_BANCO = "versao_banco";
        public static final String COLUMN_QT_MOEDAS = "qt_moedas_inicial";
        public static final String COLUMN_TOTAL_FILME = "total_fase_filme";
        public static final String COLUMN_TOTAL_SERIE = "total_fase_serie";
        public static final String COLUMN_TOTAL_ANIME = "total_fase_anime";
        public static final String COLUMN_TOTAL_GAME = "total_fase_game";
    }
}