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

        values.put(PostFase.PostEntry.COLUMN_TITULO, "dragon ball");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "AELEHDSRLBFMOGNPSHAE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "EHSFMPT");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**DRAGON*****BALL***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 1);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "naruto");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OASEUIRCIBDFLNPMSHTE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "EHSFBPLCGDIM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**NARUTO************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 2);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "one piece");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ADLEIOSPLBFACGNESHTEDSHTWH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ADLSBFGHTW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*****ONE*********PIECE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 3);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "death note");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCXPIETUBSYWJNATDMWKOHEQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQCXPIUBSYJMK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****DEATH********NOTE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 4);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "bleach");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLIRSGSHFNTAEZVBWCRN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OIRSGSFNTZVW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**BLEACH************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 5);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "nanatsu no taizai");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCAAIETUZSQWJYNATAMNKONIQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQCEJYMK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***NANATSU*****NO*TAIZAI**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 6);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "boku no hero");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCXOIWTUBSOWTYNPTDMXKOHER");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQCXITSYPDM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***BOKU*NO*******HERO****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 7);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "pokémon");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCAAIÉTUZSOWJYWAPAMBKONIQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQCAITUZSJYB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***POKÉMON****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 8);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "super campeões");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCSÕPWEUBSFRTEMPTDGXAGHEQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQBFTDGXH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****SUPER******CAMPEÕES**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 9);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "fairy tail");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQASOPYELBSFRTEMPIDMXAGHIQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQSOPEBSMDXGH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****FAIRY********TAIL****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 10);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}