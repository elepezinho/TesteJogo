package com.monteiro.guessmovie.repositorio;

import android.provider.BaseColumns;

public final class PostFase {
    private PostFase() {}
    public static class PostEntry implements BaseColumns {
        public static final String TABLE_NAME = "fases";
        public static final String COLUMN_TITULO = "titulo";
        public static final String COLUMN_CATEGORIA = "categoria";
        public static final String COLUMN_LETRAS_EMBARALHADAS = "letras_embaralhadas";
        public static final String COLUMN_LETRAS_ERRADAS = "letras_erradas";
        public static final String COLUMN_RESPOSTA = "resposta";
        public static final String COLUMN_NIVEL = "nivel";
    }
}