package com.monteiro.guessmovie.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DbCargaGames {

    public SQLiteDatabase db;

    public DbCargaGames(DbHelper dbHelper){
        this.db = dbHelper.getWritableDatabase();
    }

    public void inserirFases(){
        ContentValues values = new ContentValues();
        long newRowId;

        values.put(PostFase.PostEntry.COLUMN_TITULO, "super mario");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BNSDUTPCEBRTMXNAVHRYIQHWOB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "BNDTCXNVHYQW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****SUPER********MARIO****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 1);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "pubg");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLIRSGSPFNTUEZVBWCRN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OLIRSFNTEZVWC");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***PUBG*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 2);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "gta");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCXVIITUZSOWJYWAPJGBKONIQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQCXVIUZSOJYPBKONI");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*****GTA******************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 3);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "zelda");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCXVIILUZSDWJYWEPAGBKONIQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQCXVIUSJYPGBKONI");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****ZELDA*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 4);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "god of war");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLIRWGSPFNAUEZVBDCON");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "LISPNUEZVBCN");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "GOD*OF*WAR**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 5);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "need for speed");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QDPRWESJTEDEHNOXCAUXFXVELV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWJTHCAUXVL");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**NEED*FOR******SPEED****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 6);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "donk kong");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLIRKGSOFNAUEKVBDCXN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "LIRSFAUEVBCX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DONK******KONG***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 7);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "the last of us");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QDTRWQSJTGDKVNOEHAUXFBSZLV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QDRWJGKVNXBZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**THE*LAST******OF*US****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 8);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "the witcher");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCXVTILUZRDQTYHEPAGBEOHMQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QXVLUZDQYPAGBOM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*THE*WITCHER**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 9);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
        
        values.put(PostFase.PostEntry.COLUMN_TITULO, "resident evil");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ELIRKTSOVNAUEKKIDEXF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "KOAUXF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*RESIDENT****EVIL***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 10);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}
