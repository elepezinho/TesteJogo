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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JYKIASZPWQRNXBTVOLCFEWHÚMT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWASZXVBNMKJHOPYTW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***LÚCIFER****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 10);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the hundread");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WHYFLDQSHZUROKJDAEXETKGNPF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYPOLKKJGFSAZX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THE**HUNDREAD*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 11);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "greys anatomy");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OKDGWTFLNSYMZJRTJHQAPOYEAO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTOPLKJJHFDZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "GREYS*ANATOMY*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 12);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "doctor who");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CHYIUOTOWPJLTVFQGODR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QTYUIPLJGFV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "DOCTOR*WHO**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 13);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "justiceiro");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OHRTITIPUGWKCESUQLYJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYUPLKHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "JUSTICEIRO**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 14);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "dark");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PRJQHEGKYOIFPDUALDQT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQETYUIOPPLJHGFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DARK*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 15);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "supernatural");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KVUSTQYTIZKAARHRNLUFEWPXJH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYIKKJHFZXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "SUPERNATURAL*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 16);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "gotham");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SRIGVAYQUOMEHPUKSIRT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "SRIVYQUEHUKIR");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GOTHAM************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 17);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the big bang theory");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PEYOQUENGBTBAKUIJRJTPHLHGJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QRTUPLKJJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***THE*BIG****BANG*THEORY*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 18);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "brooklyn 99");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "7KWKV8BG9HJO3RZLGOQ59DNYX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "5789GQWZXVKJHGD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*BROOKLYN*99**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 19);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "narcos");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ASJPHIRNCOYQUKTLPGWY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYYUIPPLKJHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**NARCOS************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 20);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "arquivo x");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XQTKWVPJIZORYURVUDKGBHFLAZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WRTYUPLKKJHGFDZVB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ARQUIVO*X***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 21);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the crown");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RGFAWKSXYPNUJHCETAWVODFHQV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUPKJHGFFDSAAXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**THE*CROWN***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 22);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "eu a patroa e as crianças");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "REAÇXNQAWYACPESRATZIAOASUY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWZXY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*EU*A*PATROA*E*AS*CRIANÇAS");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 23);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "bates motel");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XDQSZVBJHFGWLETAZKOTYPMEGP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYPKJHGFGDZXVZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*BATES*MOTEL**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 24);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "smallville");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OQPVLRPLIUEWKLLYTMAS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRTYUOPPK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "SMALLVILLE**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 25);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "marlon");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KOJTGMNYKLHRQQPLAYUO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQTYYPOLUKKJHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**MARLON************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 26);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "todo mundo odeia o chris");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NEWCZTIQYOODOOSUDDHARXOIMX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYZX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*TODO*MUNDO*ODEIA*O*CHRIS");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 27);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "american gods");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HYJAWTZRXLESNQDKMDPGIOFACT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYPLKJHFDZX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "AMERICAN*GODS*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 28);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "black mirror");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QUAQRWYTRUHBOPCKPILRUTJHWM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYUPJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "BLACK*MIRROR*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 29);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "simpsons");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PWZQTMIJGSKFLHUDOSNS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTULKJHGFDZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*SIMPSONS***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 30);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "friends");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "VEFKYWTZIHCNWSRDJXAKOQPLGT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYOPLKKJHGAZXCV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***FRIENDS****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 31);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "dr house");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JIUDEWYPHHQKLRTSWJGO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYIPLKJJHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*DR*HOUSE***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 32);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "24 horas");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "23PKROL47Q58HUEKAJWS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWE7853UPLKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*24*HORAS***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 33);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "arrow");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GTQAKXYSQBWRHZVPODUOFRLKJT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QTYUOPLKKJHGFDSZXVBQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****ARROW*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 34);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "anne with na e");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FANMHTDNQXUIENWAEKPZLRJSOR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QRUOPLKJFDSZXM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ANNE*WITH******NA*E****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 35);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "vikings");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LUYSHFQYZIKGDOVWTJGFIXVNPO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYYUOPLJHGFFDZXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***VIKINGS****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 36);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "csi");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SXIZYWDPOGVBTANFRQUJLCHKER");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRETYUOPLKJHGFDAZXVBN");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*****CSI******************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 37);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "jessica jones");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HAJITSWQYLSKJEGORPSKNCETXK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "HTWQYLKGRPKTX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "JESSICA*JONES*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 38);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the last kingdom");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DTJEHQPINZUKATHTMOGYRSWLFJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRTYUPJHFZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**THE*LAST*****KINGDOM***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 39);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "breaking bad");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BAVNCEGRGISAXDJQZMBSJKLHFC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCVMLJJHGFSSQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "BREAKING*BAD*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 40);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "atypical");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JICYKFQGTUPUOWLSRAKA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRUUOKKJGFS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*ATYPICAL***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 41);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "rick and morty");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CATQMRRTDUPGWJFIZKHYONLKDU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTUPLKJHGFDZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**RICK*AND******MORTY****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 42);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "agents of shield");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GEQJUNOWSSTJDYKPIZAELEDAHF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUOPKJJZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**AGENTS*OF*****SHIELD***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 43);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "la casa de papel");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KPREDESYKPQHLLAWTJGAACPAOR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRTYOPKJKHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***LA*CASA*****DE*PAPEL**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 44);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "sherlock");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JQIWKCTIYUHOWJLERHPS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYUIIPJJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*SHERLOCK***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 45);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the blacklist");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WOQJHLGESPITTHFRBKJZLDCAYR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRYOPJJHGFDZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THE*BLACKLIST*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 46);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "revenge");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RNEQWFTYUGUIEOPLKKJHVFDSTE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYUUIOPLKKJHFDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***REVENGE****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 47);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "westworld");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WTWQYIPPKJHORGESGFDAZXVLDP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QYIPPKJHGGFDAZXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**WESTWORLD***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 48);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "marte");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QZDKRAOYHIJPSTXFWKGZLIUMEU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUIIOPLKKJHGFDSZZX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****MARTE*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 49);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "american horror");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WUYQRRCRONROAMAHYEIT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYYU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*AMERICAN***HORROR**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 50);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}