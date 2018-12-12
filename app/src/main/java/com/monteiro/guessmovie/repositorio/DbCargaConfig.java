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
        values.put(PostConfig.PostEntry.COLUMN_VERSAO_BANCO, 92);
        values.put(PostConfig.PostEntry.COLUMN_QT_MOEDAS, 100);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_FILME, 50);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_SERIE, 50);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_ANIME, 50);
        values.put(PostConfig.PostEntry.COLUMN_TOTAL_GAME, 50);
        long newRowId = db.insert(PostConfig.PostEntry.TABLE_NAME, null, values);
    }

}
