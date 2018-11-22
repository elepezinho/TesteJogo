package com.monteiro.guessmovie.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DbCargaAnimes {

    public SQLiteDatabase db;

    public DbCargaAnimes(DbHelper dbHelper){
        this.db = dbHelper.getWritableDatabase();
    }

    public void inserirFases(){
        ContentValues values = new ContentValues();
        long newRowId;

        values.put(PostFase.PostEntry.COLUMN_TITULO, "lost");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "AITEAILCUBDOJPNMJSGE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "AEICUBDPNMGJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****LOST************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 1);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}
