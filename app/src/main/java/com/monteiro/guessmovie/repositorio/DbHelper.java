package com.monteiro.guessmovie.repositorio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private static final String TEXT_TYPE = " TEXT NOT NULL";
    private static final String INT_TYPE = " INTEGER NOT NULL";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_FASES =
            "CREATE TABLE " + PostFase.PostEntry.TABLE_NAME + " (" +
                    PostFase.PostEntry._ID + " INTEGER PRIMARY KEY," +
                    PostFase.PostEntry.COLUMN_TITULO + TEXT_TYPE + COMMA_SEP +
                    PostFase.PostEntry.COLUMN_CATEGORIA + TEXT_TYPE + COMMA_SEP +
                    PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS + TEXT_TYPE + COMMA_SEP +
                    PostFase.PostEntry.COLUMN_LETRAS_ERRADAS + TEXT_TYPE + COMMA_SEP +
                    PostFase.PostEntry.COLUMN_RESPOSTA + TEXT_TYPE + COMMA_SEP +
                    PostFase.PostEntry.COLUMN_NIVEL + INT_TYPE + " )";

    private static final String SQL_CREATE_CONFIG =
            "CREATE TABLE " + PostConfig.PostEntry.TABLE_NAME + " (" +
                    PostConfig.PostEntry._ID + " INTEGER PRIMARY KEY," +
                    PostConfig.PostEntry.COLUMN_VERSAO_BANCO + INT_TYPE + COMMA_SEP +
                    PostConfig.PostEntry.COLUMN_QT_MOEDAS + INT_TYPE + COMMA_SEP +
                    PostConfig.PostEntry.COLUMN_TOTAL_FILME + INT_TYPE + COMMA_SEP +
                    PostConfig.PostEntry.COLUMN_TOTAL_SERIE + INT_TYPE + COMMA_SEP +
                    PostConfig.PostEntry.COLUMN_TOTAL_ANIME + INT_TYPE + COMMA_SEP +
                    PostConfig.PostEntry.COLUMN_TOTAL_GAME + INT_TYPE + " )";

    private static final String SQL_DELETE_FASES =
            "DROP TABLE IF EXISTS " + PostFase.PostEntry.TABLE_NAME;

    private static final String SQL_DELETE_CONFIG =
            "DROP TABLE IF EXISTS " + PostConfig.PostEntry.TABLE_NAME;

    // S E M P R E que atualizar o banco, alterar a versão
    public static final int DATABASE_VERSION = 5;
    public static final String DATABASE_NAME = "FrasesEmoji.db";

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_DELETE_FASES);
        db.execSQL(SQL_DELETE_CONFIG);
        db.execSQL(SQL_CREATE_FASES);
        db.execSQL(SQL_CREATE_CONFIG);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_FASES);
        db.execSQL(SQL_DELETE_CONFIG);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}