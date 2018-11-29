package com.monteiro.guessmovie.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DbCargaConfig {

    public SQLiteDatabase db;

    public DbCargaConfig(DbHelper dbHelper) {
        this.db = dbHelper.getWritableDatabase();
    }

    public void inserirConfig(){
        ContentValues values = new ContentValues();
        values.put(PostConfig.PostEntry.COLUMN_VERSAO_BANCO, 8);
        values.put(PostConfig.PostEntry.COLUMN_QT_MOEDAS, 100);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_FILME, 12);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_SERIE, 10);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_ANIME, 10);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_GAME, 10);
        long newRowId = db.insert(PostConfig.PostEntry.TABLE_NAME, null, values);
    }

}
