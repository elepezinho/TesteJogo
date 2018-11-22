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
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****LOST************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 1);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "batman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OATEUISCRBDALNPMSHUE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "EHSFRPLCDGIOU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**BATMAN************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 2);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "o rei leão");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CELSHDSRIOFMOGNPSHÃE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "NHSFMPTCDG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "O*REI*LEÃO**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 3);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "homem aranha");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OIAGUISCTBDALANMRYSEMSHWXH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "IUSCTBDLYWXG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****HOMEM*******ARANHA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 4);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "branca de neve");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HIBERIEAQWSZNXCPAGDJESNSVW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "HIQWSZXPGJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**BRANCA*DE******NEVE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 5);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "thor");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OITEUISCXBDALBNMSHGR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "IEUSCXBDALNMG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***THOR*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 6);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "harry potter");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HIBLRIVAKBWORQYNBTRGEPNSTB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "IBLVKWQNGS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****HARRY*******POTTER***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 7);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "pantera negra");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OOWNUPSCWBRAEARMMHQGCTNHAE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OWUSCBMHQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***PANTERA*******NEGRA****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 8);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "valente");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLTMUHSCXBHQEWRMMVARREMHPN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OMUHSCXBQWRRP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***VALENTE****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 9);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "guerra infinita");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLIRUHSCFNTAEARGIIXN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OLHSCX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GUERRA***INFINITA*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 10);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}
