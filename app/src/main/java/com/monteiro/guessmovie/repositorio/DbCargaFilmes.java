package com.monteiro.guessmovie.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DbCargaFilmes {

    public SQLiteDatabase db;

    public DbCargaFilmes(DbHelper dbHelper){
        this.db = dbHelper.getWritableDatabase();
    }

    public void inserirFases(){
        ContentValues values = new ContentValues();
        long newRowId;

        values.put(PostFase.PostEntry.COLUMN_TITULO, "titanic");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OITEUISCTBDALPNMSHDEMSHSOB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "OHSFMPELUDB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***TITANIC***************");
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

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Perdido em Marte");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TQDMIVOZRJXLRPKWMBEDAYEEUY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQZXYJKLBVYU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*PERDIDO*EM*****MARTE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 11);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tropa de Elite");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WKJPLDQRKEITHQZEATQEYWOUSX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "YKJWQZKUQSHXW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**TROPA*DE******ELITE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 12);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "maze runner");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KRDJFWXLZEPNQGXEHURMFPANSD");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWPSXXDFGHJKLPF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****MAZE********RUNNER***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 13);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "alice");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BGVXTZIOWDQAHWSCDMKQLPNEGF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXDFGHOPMNBVTQWKSD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****ALICE*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 14);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "homem de ferro");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ERMJOPBWIHLUVEEGDQKOXZRFUM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "GQWZXVBJKLPIU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**HOMEM*DE******FERRO****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 15);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "cidade de deus");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DEXNAUECBEISJMGLVDWDQZDHNK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXVBNMLKJHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**CIDADE*DE******DEUS****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 16);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "carros");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CXHORWLFBGKMZSVRNAQJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXVBNMLKJHGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**CARROS************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 17);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "cinquenta tons de cinza");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PQAWSIETADXONTUNNCLIEPNCZX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WXLP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**CINQUENTA**TONS*DE*CINZA");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 18);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "crepúsculo");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SRXMJONCQVZKPÚEWUBCL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXVBNMKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "CREPÚSCULO**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 19);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "homem de aço");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ALWZÇUSKFMYIHGEQDOMXLPOKES");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXSFGUKLYIPLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**HOMEM*DE*******AÇO*****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 20);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "a bela e a fera");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "EMAAFQEAXYLEPTRBQZAW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQZXWPTYM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**A*BELA***E*A*FERA*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 21);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "durkirk");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZJQHJIKNXDKOYMLCHWRVRJPBUL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXCVBMNJHPOLJYHJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DURKIRK****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 22);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "star trek");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ABTTESCYRWLVMKXNRZPU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "YUPLMNBVCXZW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***STAR******TREK***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 23);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "jogos mortais");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QOTAGZHIMPWQOPDFJRXSYODWS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWPDFPYQWDXZH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "JOGOS*MORTAIS*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 24);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "sr e sra smith");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FPXMRARQXUYYFTSPDSEWISZJH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "FPUYXPWQZXDFYJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****SR*E******SRA*SMITH**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 25);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "corpo fechado");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CAEONZFDIKLPXCHKOVQWGMBROL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXVBNMLKIKG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "CORPO*FECHADO*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 26);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "warcraft");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GOSLFTXYQZRMHWNKCRAA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QOZXLMNHGKYS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*WARCRAFT***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 27);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "deadpool");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BCWZEKXGQOIHDALVOPDJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXVCBIKHJG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*DEADPOOL***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 28);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "jumanji");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GIZTOPCRXJMANSJQYBWVULFDHT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXCVBLHGFDSPOYTR");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***JUMANJI****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 29);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "gravidade");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HEXQPAKOIZUCLVDRAWDYPFJSGU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUOPKJHFSPLZXC");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GRAVIDADE***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 30);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "o extraordinario");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XAFONQIHOUÁDERRYTJGOPIKRWJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUPKJHGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***O*EXTRA*****ORDINÁRIO**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 31);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "john wick");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SKLRJLQTOPLUICGNDWYH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QLRTYUPLLGDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***JOHN******WICK***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 32);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "jogador numero um");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PJTRWGÚQEOOYDMRHMOPKIULANI");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYIPLKHP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***JOGADOR*****NÚMERO*UM**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 33);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "interestelar");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QWYUPORSTTKLAUEPQEIWNYERPJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUPOKJP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "INTERESTELAR*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 34);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "a origem");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "APDRKOQIJUVSWLTMZFGE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTUPLKJFDSZV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*A*ORIGEM***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 35);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "piratas do caribe");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IQIBGRXSATPAOCWARDEH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWXHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "PIRATAS*DO**CARIBE**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 36);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "poderoso chefão");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OSHVEOOÃNEKFXZCORMPD");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXVMNK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*PODEROSO***CHEFÃO**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 37);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "frozen");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HFNLQPKEYWJYRMHKPOLZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWLYPPLKHMKHJY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**FROZEN************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 38);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "jogos vorazes");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CDVJOPKSPZXWRASPOFOUQLHEGU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWUPKLHFDPXPC");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "JOGOS*VORAZES*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 39);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "capitão américa");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BCÉXQIKAVÃYATMWOUZAWRWPCIQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUQWZXVBK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***CAPITÃO******AMÉRICA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 40);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "percy jackson");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XCOHKPDFWUZGYCUNQLLVESJRAL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWULLHGFDZXVU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****PERCY*******JACKSON***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 41);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "o rei do show");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WLTOZRLODGYFEVMQICPSKXHOPM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QYTPLKPGFLZXCVM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "O*REI*DO*SHOW*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 42);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "star wars");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MYAFZAPTVBLSWGZRQRSM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QYPVBMZGFLZM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***STAR******WARS***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 43);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "kingsman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NUPRGPLMNWAIUQKHDSFY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRYUPLPHFDU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*KINGSMAN***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 44);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "círculo de fogo");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GRKDOPCÍFOUQPHCLSTOE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QTPKHPS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "CÍRCULO*DE***FOGO***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 45);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "o passageiro");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "YAUJGBVZOBSAEROQWYPJBISVZX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUJBVZX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "******O*******PASSAGEIRO*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 46);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "logan");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZTLWDYWGJRANHXQVFOQTVYZPKM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRTYPKJHFDZXZVMWQTY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****LOGAN*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 47);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "divertidamente");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QDYMTLQWUEPLTNIDRAEIEWVUYP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWUYPL");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**DIVERTIDA******MENTE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 48);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "eu robô");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PAUKWYKISOBQYGHJZDLRHETÔFT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYIPLKJHHGFDSAZY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***EU*ROBÔ****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 49);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "nárnia");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FAURNWYKISOBQNGHJZDÁ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTUOPLKJHGFSZYBD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**NÁRNIA************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 50);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "O Regresso");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WERRTEKGOSKWJPOSYYLQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYYPLKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*O*REGRESSO***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 51);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Guardiões da Galáxia.");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DTQÕAYQSKKGIEIGAUHLDÁAXARG");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQYTGHK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "GUARDIÕES*DA***GALÁXIA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 52);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Hellboy");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MSGKBLNEZHFOLMDZXKXAAVFCYJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVNMMKKJGFFDSA");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***HELLBOY****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 53);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Vidro");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WKHYPUJQYOKLVRPFSSEGQUITDT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWETTYUUYPPLKKJHGFS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****VIDRO****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 54);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "A Pequena Sereia");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LPEXAIMZACKNVVZERAEQBUESLK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXCVVBMLLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***A*PEQUENA******SEREIA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 55);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tróia");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IWÓHQKFHFQLYSTRSYUGAWEDJPL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWEYYUPLLKJHHGFFDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****TRÓIA****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 56);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "As Aventuras de Pi");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ABUMEVBVATXELCNAZNLZSIPDRS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXCVBBNML");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "AS*AVENTURAS****DE*PI****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 57);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "A Espada Era a Lei");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQEEPSUQRPJAAAADPLOIAEYTYJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWTYYUOPP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**A*ESPADA****ERA*A*LEI**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 58);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Velozes e Furiosos");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SSOBULEZEXXOMIVNCLSROKBEKF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "SXXCBBNMLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***VELOZES*E*****FURIOSOS**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 59);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "A Lista de Schindler");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LWTNADLHESAVGRQKCIPDSIQKEV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWGVVPK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***A*LISTA***DE*SCHINDLER");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 60);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Como treinar seu Dragão");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "AMOZDZXVORERATÃSIRXUOVGCNE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*COMO*TREINAR***SEU*DRAGÃO**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 61);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Os Oito Odiados");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KYYIOOHJQHDOPOETRAWIQKDSSO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWERYYPKKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***OS*OITO******ODIADOS***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 62);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Detona Ralph");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KAXTNCPVLMLBHVEKMXRAZZJODJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBMMLKJJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DETONA*** ****RALPH****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 63);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Clube da Luta");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QALWEROYRULQBIUADCTP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWRRYIOP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*CLUBE*DA****LUTA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 64);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Aquaman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "APPUYMOIAZTZEQNWJAORKUKRLY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZWERRTYYUIOOPLKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***AQUAMAN***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 65);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Mulan");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZGKXJFCKUAVOGZMPXSNOBHLBDS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVBBKKJHGGFDSSPO");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****MULAN****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 66);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Cavaleiro das Trevas");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SXISKCXALAODKLRZBZTVEAVERA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXBLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**CAVALEIRO***DAS*TREVAS*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 67);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Toy Story");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ULSFFKIQTUPHQJGHOYOEPRYIWT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWEUUIIPPLKJHHGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**TOY*STORY**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 68);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Homem Formiga");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MVXDIDRFKHGMOBMXVCZJOLKAZE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBLKKJD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****HOMEM*******FORMIGA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 69);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Gente Grande");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "filme");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NRAQJEWONTGOELYJGQUYPKIDUE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWYYUUIOOPLKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****GENTE*******GRANDE***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 70);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}