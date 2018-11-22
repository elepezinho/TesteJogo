package com.monteiro.guessmovie.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DbCargaSeries {

    public SQLiteDatabase db;

    public DbCargaSeries(DbHelper dbHelper){
        this.db = dbHelper.getWritableDatabase();
    }

    public void inserirFases(){
        ContentValues values = new ContentValues();
        long newRowId;

        values.put(PostFase.PostEntry.COLUMN_TITULO, "lost");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "AITEAILCUBDOJPNMJSGE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "AEICUBDPNMGJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***LOST*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 1);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "game of thrones");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OEBEHISRTBFAOGNMIPUDUIDCBP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "UIDCBP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***GAME*OF******THRONES***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 2);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "flash");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OGHEFISCTBDELNPMCAUOPMCXUO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OGEICTBDENPMCUOPMCX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****FLASH*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 3);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "prison break");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QGHRFISDTBDERNPKCAUOJXVULV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QGHFDTDUXVULVCJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***PRISON*******BREAK****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 4);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the walking dead");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PQGXRIEAUBSOWJNATDZEKHLUDR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "PQXRUBSOJYZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*THE*WALKING*****DEAD****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 5);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "demolidor");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLTMUHSDXBHQEWHDQVIRFOJHPN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "TUHSXBQWVFJPN");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**DEMOLIDOR***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 6);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "13 reasons why");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QGPRW5SDT2DEHNO1CAU3YXVSLV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QGP5DT2DCUXVLV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*13*REASONS******WHY*****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 7);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "once upon a time");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCXPIETUBSOWJYNAFDMNKOLED");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQXBSWJYFDKLD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ONCE*UPON*****A*TIME***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 8);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "stranger things");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLIRSGSHFNTAEZVGWTRN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OLFZVW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*STRANGER***THINGS**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 9);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "lúcifer");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JYKIASZPWQRNXBTVOLCFEWHÚM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWASZXVBNMKJHOPYTW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***LÚCIFER****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 10);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}
