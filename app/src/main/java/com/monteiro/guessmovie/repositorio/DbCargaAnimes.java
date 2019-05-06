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
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQCXPIETUBSYWJNATDMWKOHEQX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "WQCXPIUBSYJMKX");
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

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Shingeki no Kyojin");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CJDKSAIBNNNZKLIHEFXIGVOOQY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCVBLAFDQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**SHINGEKI****NO*KYOJIN**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 11);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "World Trigger");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IPHJSRJWEGXXDQTÇZGFUORKLRS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QXXUPÇKJJHFSZS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "WORLD*TRIGGER*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 12);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tokyo Ghoul");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TFZGJKRUYJOXOAIQPHLDOSWQAW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWRIPJJFDSAAZXD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*TOKYO*GHOUL**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 13);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Jojo Bizarre");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MZJJLHLRHACBXOOWENGKVFXIDZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "XXCVNMLLKHHGFDW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "JOJO*BIZZARE*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 14);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Soul Eater");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FQRUHEYOKWPTAJWKELSG");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYPKKJHGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "SOUL*EATER**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 15);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Guilty Crown");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HCPTYVKULEBWGRISOENXDJZQFK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QEEXPKJHFDSZVBK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "GUILTY*CROWN*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 16);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Orange");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GDOYKUQJFRNPTETHKLWA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTTYUPLKKJHFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ORANGE************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 17);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Steins Gate");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JSEQRTNAYFEVPYKGZTDIXHLJSD");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QRYYPLKJJHFDZXVD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*STEINS*GATE**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 18);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Haikyuu");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LGDQZWRKFAJWXGHYBXOUISPVUO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWROPLJGGFDSZXXVBO");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***HAIKYUU****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 19);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Magi");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "IARKJGHTPPTWKQLMYUOQ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWRTTYUOPPLKKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***MAGI*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 20);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Black Clover");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LWJHCORFBJZPTCKVGQWALEYFDZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYPJJHGFFDZZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "BLACK*CLOVER*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 21);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Shougeki no Souma");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MSGWOUWEOSUNTARHOIQK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWRT");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*SHOUGEKI**NO*SOUMA*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 22);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Elfen Lied");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WEYPELFRGWITQYONUDEL");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWRTYYUPOG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "ELFEN*LIED**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 23);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "One Punch Man");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GNDOLHAJEWRYNPMCWQTFGYNKUY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWRTYYLKJGGFDY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "ONE*PUNCH*MAN*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 24);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Sword Art Online");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQLAJNPUTIFONEYYDORRSHJGKX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QYYUPKJJHGFX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****SWORD*****ART*ONLINE*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 25);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Digimon");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QIMKWZDPPWTJGXVNFISZLHOYHX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYPLKJHHFPSZZXVX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DIGIMON****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 26);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Ao No Exorcist");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ESJPFKNWRTOOIQYCJAXOLWHGGZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYPLKJJHGGFZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****AO*NO******EXORCIST**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 27);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Toradora");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JKRLRAIAWLDIOOPYQTQU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWQYUIIPLLKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*TORADORA***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 28);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Yu Yu Hakusho");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LYGXMUKVHUSUXYFAZXNBHOCZJX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVBMNZXLJGFX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "YU*YU*HAKUSHO*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 29);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Another");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ESXPJBYONRWLTHFAKZDWPQGKMV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYPPLKKJGFDSZXBMV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***ANOTHER****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 30);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Boruto");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KBOIJUHPKQILWWYOGRTX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYXIIPLKKJHG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**BORUTO************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 31);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Cavaleiros do Zodiaco");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ACELSDQZOOAIADOVPWBCOYIRXX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYXPBX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "CAVALEIROS*DO***ZODIACO***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 32);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Code Geass");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LDCZGSOSKEMNVZKHAXJE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXVNMLKKJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "CODE*GEASS**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 33);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Hunter X Hunter");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "UHMURRTNVHZTKVLNEEXK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZVVMLKK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*HUNTER*X***HUNTER**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 34);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Kuroshitsuji");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NXVHTCFIORFLCZSMKGUSDIJUBM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCCVBNMMLGFFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "KUROSHITSUJI*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 35);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Sakura Card Captores");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RPWACUDAAARTQCWLYRSOKSXWYX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYXLWYX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*SAKURA*CARD****CAPTORS***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 36);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Log Horizon");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JHBGXZVKLFRFAKOSQNIWOMDXOX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "KXXVBMKJFFDSAQWX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*LOG*HORIZON**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 37);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Fullmetal Alchemist");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "AMAEWHSCQLTUIYLTELFMLKWPGX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYPKGX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**FULLMETAL****ALCHEMIST**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 38);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Yu Gi Oh");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FULWKWIJQYODPGPHSFXT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTXPPLKJFFDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*YU*GI*OH***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 39);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Bakuman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WZJBKWDFMAXHZVLCALFSUQXNYJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVLLZJHFFDSQWWYJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***BAKUMAN****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 40);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Hajime no Ippo");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HPEJOXBAFOKKIMLIPWQWGRTNUX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWRTULKKBXGFX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**HAJIME*NO******IPPO****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 41);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Madoka Magica");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GMAQWAOTJYXYFZALHDKPCAIMYX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWTYYPLJHFYZX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "MADOKA*MAGICA*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 42);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Inuyasha");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NAIURWTRSYKJQLHJXZAP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRRTXZPLKJJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*INUYASHA***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 43);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Zatch Bell");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BCTGXKELZJAXLNQHPVFM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QXXVPNMKJGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "ZATCH*BELL**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 44);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Deadman Wonderland");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DKJEMUTAQODPILAWADENDNNZRZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QZTUIPKJXZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DEADMAN****WONDERLAND*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 45);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Kuroko no Basket");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OTAKOBUVXXGEMJKZKLJOHCNSRZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVMLJJHGZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**KUROKO*NO*****BASKET***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 46);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Blood C");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WFIXKZJHXVRWDSOQOYCMALGFBV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXVMKJHGFFSAQWWRYIV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***BLOOD*C****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 47);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Ore Mono Gatari");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OANOETQGYQOMULIRARPW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWYUPL");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*ORE*MONO***GATARI**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 48);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Evangelion");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ABXXIEZCNONGEKLVMJKX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCBMXKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "EVANGELION**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 49);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Berserk");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RHWUKLDRPFZYTMBXEVAJQSPEWC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYUPPLJHFDAZXVMC");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***BERSERK****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 50);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Major");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WMOGLRBHCNTSDFJXQVXKRZAUGX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "XXCVBNLKHGGFDSQWRTUX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****MAJOR*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 51);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Mirai Nikki");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KIFKAHCVIGDWXLINIRMJSBQZKC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCVBLKJHGFDSQWC");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*MIRAI*NIKKI**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 52);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Love is War");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WFQPUHODYSQIERJGALVPAAKYJT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "LOVEISWARQQTYYUPPKJJHGFDAA");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*LOVE*IS*WAR**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 53);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Brave 10");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "X34ANZ91MXVCBN2Z80RE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCNNM23498");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*BRAVE*10***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 54);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Cowboy Bebop");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RBIURUQBPQCYGBTKGLWJEOOHKO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQRRTUUILKKJHGG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***COWBOY*******BEBOP****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 55);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Accel World");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HZXJNLFJVDRZGLOMKCMWFVECAX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXVVNMMKJJHGFF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*ACCEL*WORLD**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 56);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Goblyn Slayer");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QEGATWLLPWIYSQNRUBYO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWTUIP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**GOBLYN****SLAYER**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 57);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Fate Stay Night");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PFNTKTWALGQAITJOQUKYSWEHUP");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWUUOPPLKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**FATE*STAY******NIGHT****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 58);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Gintama");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LWGVIJDSÇKZNBMTZKXQQAXRAFH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXVBLKKJHFDSQQWRÇ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***GINTAMA****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 59);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Hinomaru zumou");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "KUOYMPMWJLIKQHRWUZAUTNPGQO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWTYPKPLKJG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**HINOMARU******ZUMOU****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 60);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Demon Slayer");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "VZVJYCGGFLEMXODJREXKSHANBZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBKJJHGGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****DEMON*******SLAYER***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 61);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tate no Yuusha");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GUWLKWQYJQHGITISANEKUAPORT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWRIIPPLKKJG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***TATE*NO******YUUSHA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 62);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Dororo");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OVLKCXKOBVXRJDNZMZOR");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVVBNMLKKJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**DORORO************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 63);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Megalo Box");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GAQOEIMWYXQLRTUIOBYW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWRTYYUII");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "MEGALO*BOX**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 64);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Mob Psycko 100");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JSCOO5JYMFXBHR1PZ2ZGX90K30");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXX2395RJJHGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*MOB*PSYCKO******100*****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 65);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "The Promised Neverland");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZHQVERNMRESOLQAXPIEXDZNEDT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXQQ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "THE*PROMISED**NEVERLAND**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 66);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Overlord");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "YYLORDIWQPQKTVURWOIE");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWWTYYUIIPK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*OVERLORD***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 67);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Ano Natsu de Matteru");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "NVLDAZUSUTTXOXZECNTMABREBA");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXCVBBL");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ANO*NATSU***DE*MATTERU*");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 68);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Great Teacher Onizuka");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ÇITOEACABEKGNUHRXTJBVERXAZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ÇJXXVBB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "GREAT*TEACHER***ONIZUKA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 69);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Amanchu");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "anime");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "HAUVFXLKMGXGBJCJKALSZDZDVN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZZXXKVVBLLKJJGGFDDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***AMANCHU****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 70);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}