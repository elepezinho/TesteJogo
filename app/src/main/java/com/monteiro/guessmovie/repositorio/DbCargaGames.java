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

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Shadow of Mordor");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TAOQMGHFJLYOWOZYDSOPRVRKDJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QZVTYYPLKJGJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**SHADOW*OF*****MORDOR***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 11);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Call of Duty");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TGVMSBFGMLJDHXOYKZALCUXQXG");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXVBMXKJHGGMSQG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "CALL*OF*DUTY*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 12);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Prince of Persia");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RSNEGOJFYWQHILKPKIRWCPETAW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYLKKJHGW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**PRINCE*OF*****PERSIA***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 13);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tony Hawks");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WBAPXYRRSQHMTNOUKIPU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QRRXBUUIMPP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "TONY*HAWKS**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 14);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Shadow of the Colossus ");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TSYLYUDOZWHOXXECSOQSSHAOFG");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QXYYZXG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**SHADOW*OF**THE*COLOSSUS");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 15);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Uncharted");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CTKEWPVUZSXQDLJYGRGAFZNYHF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWYYPLKJZGGFSZXVF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**UNCHARTED***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 16);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Battlefield");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "ZXTMXJBGFYEVVGHDNALESTLIKX");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXVVMNKJHGGYSX");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*BATTLEFIELD**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 17);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Dinocrisis");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WPWLIDIYUYKLCRSSONQI");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYYUPLLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "DINOCRISIS**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 18);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Doom");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "MJUGQDPYOHWKSFLTAIWO");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYUIPLKJHGFSA");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***DOOM*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 19);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Driver");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RBCDIMELJKVZBXHRXNJM");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCBBNMMLKJJH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**DRIVER************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 20);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Haverst Moon");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "AKHFJFKMYENRTWGUSLOPQWOYVB");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWYYUPLKKJGFFB");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "HAVERST*MOON*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 21);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Kingdom Hearts");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RSXTZLVGLNDOXHIFABJVCKMPEC");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVVBLLJFPC");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***KINGDOM******HEARTS***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 22);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Pokémon ");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DFSYOOMKFTLIUÉSRHJPQRNWIGU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRRTYUIILJHGFFDSSGU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***POKÉMON****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 23);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Bomberman");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "EGMWOWFBPBQKALJIRUIYTMKHNJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWTYUIIPLKKJHGFJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**BOMBERMAN***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 24);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Crash");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "BHGFVAEWCFKJJNMQETSRLVZXDK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXVVBNMLKJJGFFDQWEETK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****CRASH*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 25);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Monument Valley");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "PQOWMMAELLTRNEPVUYRN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRRPP");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*MONUMENT***VALLEY**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 26);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Far Cry");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FVBPRVVAJDOGVXRMCSKMHZNLYU");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXVVBNMMLKJHGVVDSPOHU");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***FAR*CRY****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 27);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "League of Legends");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DPEAEWNEKSGFPUWKGEQLROLITW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWRTPIPKKW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**LEAGUE*OF*****LEGENDS***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 28);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Bastion");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "CGVHBKFLXJRZPMPKNOTSAYWCIF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCCVMLKKJHGFPPYRWF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***BASTION****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 29);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Jack Chan");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "SUYQAWFTJLIHDCKOPNGIQARCUY");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWRTYUUIIOPLGFDSY");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**JACK*CHAN***************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 30);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Horizon Zero dawn");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "EZCIJKHKODROONZXRBXWALNGVJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "XXCVBLKKJGJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***HORIZON*****ZERO*DAWN**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 31);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Watch Dogs");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "RUDIWSHPCQYGKAOTKLQI");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQRYUIIPLKK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "WATCH*DOGS**********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 32);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tibia");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "WQTIGCKRLDIAMBJZHDSFNXZKVK");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXZCVNMLKKJHGFDDSQWRK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****TIBIA*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 33);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Contra");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "JQKLYXINAPUEKWCORETI");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWEEYUIIXPLKJK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**CONTRA************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 34);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Final Fantasy");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "GTDNKMBAVLYIHZAFCSNVPXAJFG");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCVVBMKJHGDPG");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "FINAL*FANTASY*************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 35);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Tomb Rayder");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "DFVGROYTFJMZARCLXNXEKBJZXJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVNXLKJJGFFZJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*TOMB*RAYDER**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 36);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Pac Man");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LGOWJIFWCQYTRJTAKNDMIHAPUS");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWWRTTYUIIOLKJJHGFDS");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***PAC*MAN****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 37);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Onymusha");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XXLNGGFZSYUOCAHLJMKV");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVLLKJGGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*ONYMUSHA***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 38);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Bioshock");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "XKMLBZOHJGSIGFXVCOMN");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXVNMMLJGGF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*BIOSHOCK***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 39);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Infamous");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FWKLQANKPUMTLQYROLSI");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWRTYKLPLLK");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*INFAMOUS***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 40);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Red Dead Redemption");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "EOEXDDRVZNEAIDDERPMT");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXV");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*RED*DEAD*REDEMPTION");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 41);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Limbo");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "UOHFXGNJXPADBAXMZCSKVLAFIW");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXCVNXKJHGFFDSAAAPUW");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****LIMBO*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 42);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Kirby");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "QCDWTHJBUYVFLQODKGAIXRUZPH");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QQWTUUOPLJHGFDDAZXVCH");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****KIRBY*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 43);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Spyro");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LXCHJKGBDPABONMQYZCFRWKVSZ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCCVBBNMLKKJGFDHAQWZ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****SPYRO*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 44);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Assassins Creed");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "VLEKRNSDSHAXSZGEZIBSXACSKJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXZXVBLKKHGJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "**ASSASSINS******CREED****");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 45);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Silent Hill");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "LUVELNPRZKIHLTJSPWFDYIQOGF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "QWRYUOPVKJPGFDZF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*SILENT*HILL**************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 46);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Sonic");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "VDSZIXMFAPLQNWBAHGMKLXJOCJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXXVBMMLKJHGFDLAAPQWJ");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "****SONIC*****************");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 47);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Street Fighter");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "TLRFTYDSTQEGKEOLRWHPAIEKAJ");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "LPQWYOLKKJDAA");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "***STREET******FIGHTER***");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 48);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Mega Man");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "FJVMAHAVLXGBENZKDMCF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXCVVBLKJHFFD");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*MEGA*MAN***********");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 49);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);

        values.put(PostFase.PostEntry.COLUMN_TITULO, "Pro Soccer Evolution");
        values.put(PostFase.PostEntry.COLUMN_CATEGORIA, "game");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS, "OUBEIKOPMEKXZOCTKSNVRCLROF");
        values.put(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS, "ZXKKBMKF");
        values.put(PostFase.PostEntry.COLUMN_RESPOSTA, "*PRO*SOCCER***EVOLUTION**");
        values.put(PostFase.PostEntry.COLUMN_NIVEL, 50);
        newRowId = db.insert(PostFase.PostEntry.TABLE_NAME, null, values);
    }
}
