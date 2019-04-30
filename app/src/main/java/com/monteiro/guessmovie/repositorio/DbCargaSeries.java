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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FCKBGMZJRAUNXXDKVLHDEBHTSE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVBBMLKKJGFS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THE**HUNDREAD*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 11);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "greys anatomy");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KXNTFDWMRSAJXUGKYQOZWPYEFA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWUPKKJFFDZXX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "GREYS*ANATOMY*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 12);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "doctor who");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CHYIUOPOWPJLTVFQGODR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QPYUIPLJGFV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "DOCTOR*WHO**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 13);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "justiceiro");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OHRKITIPPGWKCESUQLYJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWKYPPLKHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "JUSTICEIRO**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 14);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "dark");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PRJQHEGKYOIFPDUALPQT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQETYUIOPPLJHGFP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DARK*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 15);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "supernatural");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KVUSTQYYIZKAARHRNLUFEWPXJH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYYIKKJHFZXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "SUPERNATURAL*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 16);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "gotham");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SRIGVAYQUOMEHPUKSIRT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "SRIVYQUEUKIRP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GOTHAM************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 17);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the big bang theory");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PEYOQUENGBXBAKUIJRJTPHLHGT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QXUPLKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***THE*BIG****BANG*THEORY*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 18);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "brooklyn 99");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "7KWJV8BG9HJO3RZLGOQ59DNYX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "5783GQWZXVJJHGD");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LQTKWPPJIZORYUXVPDKGBHFLAZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WLTYPPLKKJHGFDZPB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ARQUIVO*X***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 21);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the crown");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RGFAXKSXYPNUJPCETAWVODFHQV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QUYUPKJPGFXFDSAAXV");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KPJTGMNYKLHRQQPKAYUO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQTYYPPUKKJHGK");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HYJAWTZRXLESNQXKMDPGIOFACT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYPLKJHFXZX");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JIUDEWYPKHQKLRTSWJGO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYIPLKJJKG");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GTQAKXYSQBWRHZVPCDUOFRLKJT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QTYUCPLKKJHGFDSZXVBQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****ARROW*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 34);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "anne with an e");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FANMHTDNQXUIENWAEKPZLRJSOR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QRUOPLKJFDSZXM");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ANNE*WITH******AN*E****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 35);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "vikings");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LUYSHFQYZIKPDOXWTJGFIXVNPO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYYUOPLJHPFFDZXX");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DCJEPQPINZUKATHTMOGYRSWLFJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRCYUPJPFZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**THE*LAST*****KINGDOM***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 39);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "breaking bad");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BAVNCELRGISAXDJQZMBSJKLHFC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCVMLJJHLFSSQ");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CAHQMRRTDUPGWJFIZLHYONLKBU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWHUPLLJHGFBZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**RICK*AND******MORTY****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 42);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "agents of shield");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GEQJUNOWSSTJPYKPIZKKLEDAHF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYUPKJJZPMK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**AGENTS*OF*****SHIELD***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 43);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "la casa de papel");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KKREDESYKPQHLLAWTJGAACPAOR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRTYOKKJKHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***LA*CASA*****DE*PAPEL**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 44);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "sherlock");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JOIWKCTIYUQYWJLERHPS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WWTYUIIPJJYQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*SHERLOCK***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 45);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "the blacklist");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WOQJPLGESPITTHFRBKJZLDCAYR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRYOPJJPGFDZ");
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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WTWQYIPPKJHORGESGFXAZXVLDP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QYIPPKJHGGFXAZXV");
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

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Desventuras em Série");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BRNÉZEEUXIETSRVAEJZSKXMDSB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXBBKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*DESVENTURAS***EM*SÉRIE**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 51);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Sabrina");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KAJNILUBWYQWHLOTRHOAESQTYP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWETTYYUOOPLLKJHH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***SABRINA****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 52);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "House of Cards");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MUHVJFMCGVKBOLOSARZKNXDZSE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXVVBNMMLKKJG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**HOUSE*OF******CARDS****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 53);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Orange is the New Black");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "AEBRJZPZVCWJINAEKONEHLTGSX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXVJJP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ORANGE*IS****NEW*BLACK**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 54);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Ranch");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IHGCGAGDIWKWRUQLYQOHNOEKPT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWYUIIOOPLKKGGD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**THE*RANCH***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 55);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Two and Half Men");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JBAWGNSJAELNKMZDBVFZTKOXXH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXVBBKJJGKS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***TWO*AND*****HALF*MEN**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 56);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "O Mecanismo");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SROAKLJYOWKMPQTCNPYQRIFEMU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWRRTYYUPPLKKJF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*O*MECANISMO**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 57);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Titans");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SXVZIZCJXTLANBKVTBMK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBBMLKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**TITANS************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 58);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Marco Polo");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "POLOMOWYWAJKUQRYCHTQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWTYYUKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "MARCO*POLO**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 59);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Travelers");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BVRJDETAHMXGZMJLBZFNXSERKC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCBBNMMKJJHGFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**TRAVELERS***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 60);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Luke Cage");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JWPAWLPKQEITHEYQFTRGJIYKCU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWRTTYYKIIPPJHJF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**LUKE*CAGE***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 61);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "This is Us");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BILSIUVMCXMTZSHSZNVX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBNMML");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THIS*IS*US**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 62);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Sopranos");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BKZHSVMJPARLXMCTKNOGSVEZPO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXCVVBMMLKKJPG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*****THE*******SOPRANOS**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 63);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Better Call Saul");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OLRQAQTYETAEYBWSLUCLIWPPIK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWYYIIOPPK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*BETTER*CALL*****SAUL****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 64);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Umbrella Academy");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZJRAOKLLYAXNADEVXKUBZCENMM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXVNNOKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**UMBRELLA*****ACADEMY***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 65);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Greenleaf");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FJOPENEQAWIQKIYOLYUTPHERWG");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWOTYYUIIOPPKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GREENLEAF***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 66);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Alexa And Katie");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NKVZCEAZGATXPBGLVAAUMIEGDJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZUPCVVBMGGJG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ALEXA*AND******KATIE****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 67);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Punho de Ferro");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "YYGUKTWKLQGWIRQNPROEJHOEDF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWTYYILKKJGG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**PUNHO*DE******FERRO****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 68);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Perdidos no Espaço");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BVEEXSOPSZPDOÇVCIZOKCMARND");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXCCVVBMK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*PERDIDOS*NO****ESPAÇO***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 69);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Good Girls");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "serie");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LGOOEWUGIYRQDTYKWPQS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWETYYUPK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "GOOD*GIRLS**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 70);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}