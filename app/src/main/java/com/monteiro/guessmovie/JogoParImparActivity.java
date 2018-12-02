package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.monteiro.guessmovie.repositorio.DbHelper;
import com.monteiro.guessmovie.repositorio.PostFase;
import com.monteiro.guessmovie.screenshot.ScreenshotType;
import com.monteiro.guessmovie.screenshot.ScreenshotUtils;

import java.io.File;

public class JogoParImparActivity extends AppCompatActivity implements RewardedVideoAdListener, View.OnClickListener {

    //imagem da rodada
    private ImageView im_principal;

    //botões da letra escolhida pelo usuário na opcao
    private Button bt_opc_1;
    private Button bt_opc_2;
    private Button bt_opc_3;
    private Button bt_opc_4;
    private Button bt_opc_5;
    private Button bt_opc_6;
    private Button bt_opc_7;
    private Button bt_opc_8;
    private Button bt_opc_9;
    private Button bt_opc_10;
    private Button bt_opc_11;
    private Button bt_opc_12;
    private Button bt_opc_13;
    private Button bt_opc_14;
    private Button bt_opc_15;
    private Button bt_opc_16;
    private Button bt_opc_17;
    private Button bt_opc_18;
    private Button bt_opc_19;
    private Button bt_opc_20;
    private Button bt_opc_21;
    private Button bt_opc_22;
    private Button bt_opc_23;
    private Button bt_opc_24;
    private Button bt_opc_25;

    //botões das letras sortiadas
    private Button bt_lt_1;
    private Button bt_lt_2;
    private Button bt_lt_3;
    private Button bt_lt_4;
    private Button bt_lt_5;
    private Button bt_lt_6;
    private Button bt_lt_7;
    private Button bt_lt_8;
    private Button bt_lt_9;
    private Button bt_lt_10;
    private Button bt_lt_11;
    private Button bt_lt_12;
    private Button bt_lt_13;
    private Button bt_lt_14;
    private Button bt_lt_15;
    private Button bt_lt_16;
    private Button bt_lt_17;
    private Button bt_lt_18;
    private Button bt_lt_19;
    private Button bt_lt_20;
    private Button bt_lt_21;
    private Button bt_lt_22;
    private Button bt_lt_23;
    private Button bt_lt_24;
    private Button bt_lt_25;
    private Button bt_lt_26;

    //controle da letra que está na respostaUsuario
    private String lt1_resposta;
    private String lt2_resposta;
    private String lt3_resposta;
    private String lt4_resposta;
    private String lt5_resposta;
    private String lt6_resposta;
    private String lt7_resposta;
    private String lt8_resposta;
    private String lt9_resposta;
    private String lt10_resposta;
    private String lt11_resposta;
    private String lt12_resposta;
    private String lt13_resposta;
    private String lt14_resposta;
    private String lt15_resposta;
    private String lt16_resposta;
    private String lt17_resposta;
    private String lt18_resposta;
    private String lt19_resposta;
    private String lt20_resposta;
    private String lt21_resposta;
    private String lt22_resposta;
    private String lt23_resposta;
    private String lt24_resposta;
    private String lt25_resposta;
    private String lt26_resposta;

    private Toolbar toolbar;

    private String[] respostaUsuario = new String[25];
    private String[] resposta = new String[25];
    private String[] letras = new String[26];
    private String respostaFinal;
    private String[] letrasErradas = new String[25];

    private RewardedVideoAd mAd;
    private TextView txv_coins;
    private int img;
    private int moeda;
    private int nvlFilme;
    private int nvlSerie;
    private int nvlAnime;
    private int nvlGame;
    private int removeuFilme;
    private int removeuSerie;
    private int removeuAnime;
    private int removeuGame;
    private String jogando;
    private AdView mAdview;
    private Button fullPageScreenshot;
    private Button btAddLetter;
    private Button btRemoveLetters;
    private ImageView imageView;
    private ConstraintLayout rootContent;
    private ProgressBar pb;

    SharedPreferences pref;

    public SQLiteDatabase db;
    public DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
        setContentView(R.layout.activity_jogo_par_impar);

        dbHelper = new DbHelper(getBaseContext());

        //new CriarFase().execute();
        //recuperando dados de preferencia do usuario
        pref = getSharedPreferences("pref", MODE_PRIVATE);
        moeda = pref.getInt("qt_moedas", 100);
        nvlFilme = pref.getInt("nvl_filme", 01);
        nvlSerie = pref.getInt("nvl_serie", 01);
        nvlAnime = pref.getInt("nvl_anime", 01);
        nvlGame = pref.getInt("nvl_game", 01);
        removeuFilme = pref.getInt("removeu_filme", 00);
        removeuSerie = pref.getInt("removeu_serie", 00);
        removeuAnime = pref.getInt("removeu_anime", 00);
        removeuGame = pref.getInt("removeu_game", 00);

        //inserir qt moedas do usuario na tela
        txv_coins = (TextView)findViewById(R.id.txv_coins_par);
        txv_coins.setText(""+moeda);
        btAddLetter = (Button) findViewById(R.id.bt_add_letter);
        btRemoveLetters = (Button) findViewById(R.id.btn_remove_letters);
        //inserir imagem da jogada na tela
        im_principal = (ImageView) findViewById(R.id.im_principal_par);
        //im_principal.setImageResource(img);

        //recuperando tipo de categoria que o usuario selecionou
        Bundle extra = getIntent().getExtras();
        if(extra != null){
            jogando = extra.getString("jogando");
        }
        toolbar = (Toolbar) findViewById(R.id.toolbar_par);

        //verificando a categoria e criando a fase de acordo com o nvl do usuario na categoria
        if(jogando.equals("filme")) {
            toolbar.setTitle("FILME");
            criarJogo(jogando, nvlFilme);
        }
        else if(jogando.equals("serie")) {
            toolbar.setTitle("SÉRIE");
            criarJogo(jogando, nvlSerie);
        }
        else if(jogando.equals("anime")) {
            toolbar.setTitle("ANIME");
            criarJogo(jogando, nvlAnime);
        }
        else if(jogando.equals("game")) {
            toolbar.setTitle("GAME");
            criarJogo(jogando, nvlGame);
        }
        setSupportActionBar(toolbar);

        //Remover os botões que não irão aparecer na resposta
        prepararBotaoOpc();

        //ação ao clicar no botão de remover letras
        btRemoveLetters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apagarLetras(jogando);
            }
        });

        //ação ao clicar no botão de ganhar uma letra
        btAddLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolverFase();
            }
        });

        //verificar se o usuario já removeu letras
        if (( jogando.equals("filme") && removeuFilme==1) ||
                (jogando.equals("serie") && removeuSerie==1) ||
                (jogando.equals("anime") && removeuAnime==1) ||
                (jogando.equals("game") && removeuGame==1) ) {
            jaApagouLetras();
        }

        //banner
        MobileAds.initialize(this,"ca-app-pub-1493186259985891~9080093224");
        mAdview = (AdView)findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("9FD8ED97110B2A6E9CD4264637EBDCF7").build();
        mAdview.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1493186259985891/2131541497");

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-1493186259985891~9080093224"); //

        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);

        loadRewardVideoAd();

        //implementação de onclick para o screenshoot
        findViews();
        implementClickEvents();
    }

    private class CriarFase extends AsyncTask<Void, Void, String> {

        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(Void... params) {
            //recuperando dados de preferencia do usuario
            pref = getSharedPreferences("pref", MODE_PRIVATE);
            moeda = pref.getInt("qt_moedas", 100);
            nvlFilme = pref.getInt("nvl_filme", 01);
            nvlSerie = pref.getInt("nvl_serie", 01);
            nvlAnime = pref.getInt("nvl_anime", 01);
            nvlGame = pref.getInt("nvl_game", 01);
            removeuFilme = pref.getInt("removeu_filme", 00);
            removeuSerie = pref.getInt("removeu_serie", 00);
            removeuAnime = pref.getInt("removeu_anime", 00);
            removeuGame = pref.getInt("removeu_game", 00);

            //inserir qt moedas do usuario na tela
            txv_coins = (TextView)findViewById(R.id.txv_coins_par);
            txv_coins.setText(""+moeda);
            btAddLetter = (Button) findViewById(R.id.bt_add_letter);
            btRemoveLetters = (Button) findViewById(R.id.btn_remove_letters);
            //inserir imagem da jogada na tela
            im_principal = (ImageView) findViewById(R.id.im_principal_par);
            //im_principal.setImageResource(img);

            //recuperando tipo de categoria que o usuario selecionou
            Bundle extra = getIntent().getExtras();
            if(extra != null){
                jogando = extra.getString("jogando");
            }
            toolbar = (Toolbar) findViewById(R.id.toolbar_par);

            //verificando a categoria e criando a fase de acordo com o nvl do usuario na categoria
            if(jogando.equals("filme")) {
                toolbar.setTitle("FILME");
                criarJogo(jogando, nvlFilme);
            }
            else if(jogando.equals("serie")) {
                toolbar.setTitle("SÉRIE");
                criarJogo(jogando, nvlSerie);
            }
            else if(jogando.equals("anime")) {
                toolbar.setTitle("ANIME");
                criarJogo(jogando, nvlAnime);
            }
            else if(jogando.equals("game")) {
                toolbar.setTitle("GAME");
                criarJogo(jogando, nvlGame);
            }
            setSupportActionBar(toolbar);

            //inserir imagem da jogada na tela
            im_principal = (ImageView) findViewById(R.id.im_principal_par);
            im_principal.setImageResource(img);

            //Remover os botões que não irão aparecer na resposta
            prepararBotaoOpc();

            //ação ao clicar no botão de remover letras
            btRemoveLetters.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    apagarLetras(jogando);
                }
            });

            //ação ao clicar no botão de ganhar uma letra
            btAddLetter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    resolverFase();
                }
            });

            //verificar se o usuario já removeu letras
            if (( jogando.equals("filme") && removeuFilme==1) ||
                    (jogando.equals("serie") && removeuSerie==1) ||
                    (jogando.equals("anime") && removeuAnime==1) ||
                    (jogando.equals("game") && removeuGame==1) ) {
                jaApagouLetras();
            }

            return  "";
        }

        protected void onPostExecute(String string) {
            super.onPostExecute(string);
        }
    }

    @Override
    public void onBackPressed() {
        // finish() is called in super: we only override method to be able to override transition
        super.onBackPressed();
        overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
    }

    @Override
    public void onStart(){
        super.onStart();

        final View decorview = getWindow().getDecorView();
        decorview.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);

        decorview.setOnSystemUiVisibilityChangeListener(
                new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int i) {
                        decorview.setSystemUiVisibility(
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
                    }
                }
        );

        criarBotoesLetras();

        //ação de clicar em umas das 26 letras
        bt_lt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_1.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[0], "lt1");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_2.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[1], "lt2");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_3.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[2], "lt3");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_4.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[3], "lt4");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_5.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[4], "lt5");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_6.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[5], "lt6");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_7.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[6], "lt7");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_8.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[7], "lt8");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_9.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[8], "lt9");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_10.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[9], "lt10");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_11.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[10], "lt11");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_12.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[11], "lt12");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_13.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[12], "lt13");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_14.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[13], "lt14");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_15.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[14], "lt15");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_16.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[15], "lt16");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_17.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[16], "lt17");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_18.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[17], "lt18");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_19.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[18], "lt19");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_20.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[19], "lt20");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_21.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[20], "lt21");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_22.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[21], "lt22");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_23.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[22], "lt23");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_24.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[23], "lt24");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_25.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[24], "lt25");
                }
                verificarEspacoBranco();
            }
        });
        bt_lt_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_26.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[25], "lt26");
                }
                verificarEspacoBranco();
            }
        });

        criarBotoesOpcoes();

        //ação ao clicar nas letras escolhidas
        bt_opc_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_1.setText("");
                removerLetra(lt1_resposta);
                respostaUsuario[0] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_2.setText("");
                removerLetra(lt2_resposta);
                respostaUsuario[1] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_3.setText("");
                removerLetra(lt3_resposta);
                respostaUsuario[2] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_4.setText("");
                removerLetra(lt4_resposta);
                respostaUsuario[3] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_5.setText("");
                removerLetra(lt5_resposta);
                respostaUsuario[4] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_6.setText("");
                removerLetra(lt6_resposta);
                respostaUsuario[5] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_7.setText("");
                removerLetra(lt7_resposta);
                respostaUsuario[6] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_8.setText("");
                removerLetra(lt8_resposta);
                respostaUsuario[7] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_9.setText("");
                removerLetra(lt9_resposta);
                respostaUsuario[8] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_10.setText("");
                removerLetra(lt10_resposta);
                respostaUsuario[9] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_11.setText("");
                removerLetra(lt11_resposta);
                respostaUsuario[10] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_12.setText("");
                removerLetra(lt12_resposta);
                respostaUsuario[11] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_13.setText("");
                removerLetra(lt13_resposta);
                respostaUsuario[12] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_14.setText("");
                removerLetra(lt14_resposta);
                respostaUsuario[13] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_15.setText("");
                removerLetra(lt15_resposta);
                respostaUsuario[14] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_16.setText("");
                removerLetra(lt16_resposta);
                respostaUsuario[15] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_17.setText("");
                removerLetra(lt17_resposta);
                respostaUsuario[16] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_18.setText("");
                removerLetra(lt18_resposta);
                respostaUsuario[17] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_19.setText("");
                removerLetra(lt19_resposta);
                respostaUsuario[18] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_20.setText("");
                removerLetra(lt20_resposta);
                respostaUsuario[19] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_21.setText("");
                removerLetra(lt21_resposta);
                respostaUsuario[20] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_22.setText("");
                removerLetra(lt22_resposta);
                respostaUsuario[21] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_23.setText("");
                removerLetra(lt23_resposta);
                respostaUsuario[22] = "";
                verificarEspacoBranco();
            }
        });

        bt_opc_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_24.setText("");
                removerLetra(lt24_resposta);
                respostaUsuario[23] = "";
                verificarEspacoBranco();
            }
        });
        bt_opc_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_25.setText("");
                removerLetra(lt25_resposta);
                respostaUsuario[24] = "";
                verificarEspacoBranco();
            }
        });
    }

    private void inserirLetrasBotoes() {
        //inserir letras nos botões
        bt_lt_1.setText(letras[0]);
        bt_lt_2.setText(letras[1]);
        bt_lt_3.setText(letras[2]);
        bt_lt_4.setText(letras[3]);
        bt_lt_5.setText(letras[4]);
        bt_lt_6.setText(letras[5]);
        bt_lt_7.setText(letras[6]);
        bt_lt_8.setText(letras[7]);
        bt_lt_9.setText(letras[8]);
        bt_lt_10.setText(letras[9]);
        bt_lt_11.setText(letras[10]);
        bt_lt_12.setText(letras[11]);
        bt_lt_13.setText(letras[12]);
        bt_lt_14.setText(letras[13]);
        bt_lt_15.setText(letras[14]);
        bt_lt_16.setText(letras[15]);
        bt_lt_17.setText(letras[16]);
        bt_lt_18.setText(letras[17]);
        bt_lt_19.setText(letras[18]);
        bt_lt_20.setText(letras[19]);
        bt_lt_21.setText(letras[20]);
        bt_lt_22.setText(letras[21]);
        bt_lt_23.setText(letras[22]);
        bt_lt_24.setText(letras[23]);
        bt_lt_25.setText(letras[24]);
        bt_lt_26.setText(letras[25]);
    }

    private void criarBotoesLetras() {
        //botões das letras
        bt_lt_1 = (Button) findViewById(R.id.bt_lt_1);
        bt_lt_2 = (Button) findViewById(R.id.bt_lt_2);
        bt_lt_3 = (Button) findViewById(R.id.bt_lt_3);
        bt_lt_4 = (Button) findViewById(R.id.bt_lt_4);
        bt_lt_5 = (Button) findViewById(R.id.bt_lt_5);
        bt_lt_6 = (Button) findViewById(R.id.bt_lt_6);
        bt_lt_7 = (Button) findViewById(R.id.bt_lt_7);
        bt_lt_8 = (Button) findViewById(R.id.bt_lt_8);
        bt_lt_9 = (Button) findViewById(R.id.bt_lt_9);
        bt_lt_10 = (Button) findViewById(R.id.bt_lt_10);
        bt_lt_11 = (Button) findViewById(R.id.bt_lt_11);
        bt_lt_12 = (Button) findViewById(R.id.bt_lt_12);
        bt_lt_13 = (Button) findViewById(R.id.bt_lt_13);
        bt_lt_14 = (Button) findViewById(R.id.bt_lt_14);
        bt_lt_15 = (Button) findViewById(R.id.bt_lt_15);
        bt_lt_16 = (Button) findViewById(R.id.bt_lt_16);
        bt_lt_17 = (Button) findViewById(R.id.bt_lt_17);
        bt_lt_18 = (Button) findViewById(R.id.bt_lt_18);
        bt_lt_19 = (Button) findViewById(R.id.bt_lt_19);
        bt_lt_20 = (Button) findViewById(R.id.bt_lt_20);
        bt_lt_21 = (Button) findViewById(R.id.bt_lt_21);
        bt_lt_22 = (Button) findViewById(R.id.bt_lt_22);
        bt_lt_23 = (Button) findViewById(R.id.bt_lt_23);
        bt_lt_24 = (Button) findViewById(R.id.bt_lt_24);
        bt_lt_25 = (Button) findViewById(R.id.bt_lt_25);
        bt_lt_26 = (Button) findViewById(R.id.bt_lt_26);
    }

    private void criarBotoesOpcoes() {
        //botões de escolha do usuário
        bt_opc_1 = (Button) findViewById(R.id.bt_opc_1);
        bt_opc_2 = (Button) findViewById(R.id.bt_opc_2);
        bt_opc_3 = (Button) findViewById(R.id.bt_opc_3);
        bt_opc_4 = (Button) findViewById(R.id.bt_opc_4);
        bt_opc_5 = (Button) findViewById(R.id.bt_opc_5);
        bt_opc_6 = (Button) findViewById(R.id.bt_opc_6);
        bt_opc_7 = (Button) findViewById(R.id.bt_opc_7);
        bt_opc_8 = (Button) findViewById(R.id.bt_opc_8);
        bt_opc_9 = (Button) findViewById(R.id.bt_opc_9);
        bt_opc_10 = (Button) findViewById(R.id.bt_opc_10);
        bt_opc_11 = (Button) findViewById(R.id.bt_opc_11);
        bt_opc_12 = (Button) findViewById(R.id.bt_opc_12);
        bt_opc_13 = (Button) findViewById(R.id.bt_opc_13);
        bt_opc_14 = (Button) findViewById(R.id.bt_opc_14);
        bt_opc_15 = (Button) findViewById(R.id.bt_opc_15);
        bt_opc_16 = (Button) findViewById(R.id.bt_opc_16);
        bt_opc_17 = (Button) findViewById(R.id.bt_opc_17);
        bt_opc_18 = (Button) findViewById(R.id.bt_opc_18);
        bt_opc_19 = (Button) findViewById(R.id.bt_opc_19);
        bt_opc_20 = (Button) findViewById(R.id.bt_opc_20);
        bt_opc_21 = (Button) findViewById(R.id.bt_opc_21);
        bt_opc_22 = (Button) findViewById(R.id.bt_opc_22);
        bt_opc_23 = (Button) findViewById(R.id.bt_opc_23);
        bt_opc_24 = (Button) findViewById(R.id.bt_opc_24);
        bt_opc_25 = (Button) findViewById(R.id.bt_opc_25);
    }

    private void criarJogo(String categoria, int nvl) {

        //botões de escolha do usuário
        criarBotoesOpcoes();

        //botões das letras
        criarBotoesLetras();

        criarFase(categoria, nvl, dbHelper );
    }

    public void criarFase(String categoria, int nivel, DbHelper dbHelper) {
        int resid;
        if(nivel == 1 || nivel == 2 || nivel == 3 || nivel == 4 || nivel == 5 || nivel == 6 || nivel == 7 || nivel == 8 || nivel == 9) {
            resid = this.getResources().getIdentifier(categoria + "0" + nivel, "drawable", this.getPackageName());
        } else{
            resid = this.getResources().getIdentifier(categoria + nivel, "drawable", this.getPackageName());
        }
        im_principal.setImageResource(resid);

        db = dbHelper.getReadableDatabase();
        String[] projection = {
                PostFase.PostEntry._ID,
                PostFase.PostEntry.COLUMN_TITULO,
                PostFase.PostEntry.COLUMN_RESPOSTA,
                PostFase.PostEntry.COLUMN_LETRAS_ERRADAS,
                PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS,
                PostFase.PostEntry.COLUMN_NIVEL
        };
        String selection = PostFase.PostEntry.COLUMN_CATEGORIA + " = '" + categoria + "' AND " + PostFase.PostEntry.COLUMN_NIVEL + " = " + nivel;
        String[] selectionArgs = { categoria };
        Cursor c = db.query(PostFase.PostEntry.TABLE_NAME,projection,selection,null,null,null,null);

        c.moveToFirst();
        String valorTitulo = c.getString(
                c.getColumnIndexOrThrow(PostFase.PostEntry.COLUMN_TITULO)
        );

        String valorResposta = c.getString(
                c.getColumnIndexOrThrow(PostFase.PostEntry.COLUMN_RESPOSTA)
        );

        String valorLetrasEmbaralhadas = c.getString(
                c.getColumnIndexOrThrow(PostFase.PostEntry.COLUMN_LETRAS_EMBARALHADAS)
        );

        String valorLetrasErradas = c.getString(
                c.getColumnIndexOrThrow(PostFase.PostEntry.COLUMN_LETRAS_ERRADAS)
        );

        //popular vetor resposta
        for(int z = 0; z<valorResposta.length(); z++){
            resposta[z] = String.valueOf(valorResposta.charAt(z));
        }

        //popular vetor resposta
        for(int z = 0; z<25; z++){
            respostaUsuario[z] = "";
            letrasErradas[z] = "";
        }

        prepararBotaoOpc();

        //iniciando o vetor com as 20 letras embaralhadas
        for(int z = 0; z<valorLetrasEmbaralhadas.length(); z++){
            letras[z] = String.valueOf(valorLetrasEmbaralhadas.charAt(z));
        }

        //vetor com as letras erradas
        for(int z = 0; z<valorLetrasErradas.length(); z++){
            letrasErradas[z] = String.valueOf(valorLetrasErradas.charAt(z));
        }

        //inserir letras nos botões
        inserirLetrasBotoes();

        //String com a resposta final
        respostaFinal = valorTitulo;
    }

    public void inserirLetra(String letra, String lt_resposta){
        if(respostaUsuario[0].equals("")) {
            respostaUsuario[0] = letra;
            bt_opc_1.setText(letra);
            lt1_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[1].equals("")) {
            respostaUsuario[1] = letra;
            bt_opc_2.setText(letra);
            lt2_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[2].equals("")) {
            respostaUsuario[2] = letra;
            bt_opc_3.setText(letra);
            lt3_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[3].equals("")) {
            respostaUsuario[3] = letra;
            bt_opc_4.setText(letra);
            lt4_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[4].equals("")) {
            respostaUsuario[4] = letra;
            bt_opc_5.setText(letra);
            lt5_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[5].equals("")) {
            respostaUsuario[5] = letra;
            bt_opc_6.setText(letra);
            lt6_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[6].equals("")) {
            respostaUsuario[6] = letra;
            bt_opc_7.setText(letra);
            lt7_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[7].equals("")) {
            respostaUsuario[7] = letra;
            bt_opc_8.setText(letra);
            lt8_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[8].equals("")) {
            respostaUsuario[8] = letra;
            bt_opc_9.setText(letra);
            lt9_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[9].equals("")) {
            respostaUsuario[9] = letra;
            bt_opc_10.setText(letra);
            lt10_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[10].equals("")) {
            respostaUsuario[10] = letra;
            bt_opc_11.setText(letra);
            lt11_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[11].equals("")) {
            respostaUsuario[11] = letra;
            bt_opc_12.setText(letra);
            lt12_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[12].equals("")) {
            respostaUsuario[12] = letra;
            bt_opc_13.setText(letra);
            lt13_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[13].equals("")) {
            respostaUsuario[13] = letra;
            bt_opc_14.setText(letra);
            lt14_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[14].equals("")) {
            respostaUsuario[14] = letra;
            bt_opc_15.setText(letra);
            lt15_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[15].equals("")) {
            respostaUsuario[15] = letra;
            bt_opc_16.setText(letra);
            lt16_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[16].equals("")) {
            respostaUsuario[16] = letra;
            bt_opc_17.setText(letra);
            lt17_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[17].equals("")) {
            respostaUsuario[17] = letra;
            bt_opc_18.setText(letra);
            lt18_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[18].equals("")) {
            respostaUsuario[18] = letra;
            bt_opc_19.setText(letra);
            lt19_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[19].equals("")) {
            respostaUsuario[19] = letra;
            bt_opc_20.setText(letra);
            lt20_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[20].equals("")) {
            respostaUsuario[20] = letra;
            bt_opc_21.setText(letra);
            lt21_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[21].equals("")) {
            respostaUsuario[21] = letra;
            bt_opc_22.setText(letra);
            lt22_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[22].equals("")) {
            respostaUsuario[22] = letra;
            bt_opc_23.setText(letra);
            lt23_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[23].equals("")) {
            respostaUsuario[23] = letra;
            bt_opc_24.setText(letra);
            lt24_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[24].equals("")) {
            respostaUsuario[24] = letra;
            bt_opc_25.setText(letra);
            lt25_resposta = lt_resposta;
            verificarResposta();
        }
    }

    private void removerLetra(String lt_resposta) {
        if(lt_resposta=="lt1"){
            bt_lt_1.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt2"){
            bt_lt_2.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt3"){
            bt_lt_3.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt4"){
            bt_lt_4.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt5"){
            bt_lt_5.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt6"){
            bt_lt_6.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt7"){
            bt_lt_7.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt8"){
            bt_lt_8.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt9"){
            bt_lt_9.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt10"){
            bt_lt_10.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt11"){
            bt_lt_11.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt12"){
            bt_lt_12.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt13"){
            bt_lt_13.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt14"){
            bt_lt_14.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt15"){
            bt_lt_15.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt16"){
            bt_lt_16.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt17"){
            bt_lt_17.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt18"){
            bt_lt_18.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt19"){
            bt_lt_19.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt20"){
            bt_lt_20.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt21"){
            bt_lt_21.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt22"){
            bt_lt_22.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt23"){
            bt_lt_23.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt24"){
            bt_lt_24.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt25"){
            bt_lt_25.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lt26"){
            bt_lt_26.setVisibility(View.VISIBLE);
        }
    }

    private void prepararBotaoOpc(){
        if (resposta[0].equals("*")){
            bt_opc_1.setVisibility(View.INVISIBLE);
            respostaUsuario[0] = "*";
        }
        if (resposta[1].equals("*")){
            bt_opc_2.setVisibility(View.INVISIBLE);
            respostaUsuario[1] = "*";
        }
        if (resposta[2].equals("*")){
            bt_opc_3.setVisibility(View.INVISIBLE);
            respostaUsuario[2] = "*";
        }
        if (resposta[3].equals("*")){
            bt_opc_4.setVisibility(View.INVISIBLE);
            respostaUsuario[3] = "*";
        }
        if (resposta[4].equals("*")){
            bt_opc_5.setVisibility(View.INVISIBLE);
            respostaUsuario[4] = "*";
        }
        if (resposta[5].equals("*")){
            bt_opc_6.setVisibility(View.INVISIBLE);
            respostaUsuario[5] = "*";
        }
        if (resposta[6].equals("*")){
            bt_opc_7.setVisibility(View.INVISIBLE);
            respostaUsuario[6] = "*";
        }
        if (resposta[7].equals("*")){
            bt_opc_8.setVisibility(View.INVISIBLE);
            respostaUsuario[7] = "*";
        }
        if (resposta[8].equals("*")){
            bt_opc_9.setVisibility(View.INVISIBLE);
            respostaUsuario[8] = "*";
        }
        if (resposta[9].equals("*")){
            bt_opc_10.setVisibility(View.INVISIBLE);
            respostaUsuario[9] = "*";
        }
        if (resposta[10].equals("*")){
            bt_opc_11.setVisibility(View.INVISIBLE);
            respostaUsuario[10] = "*";
        }
        if (resposta[11].equals("*")){
            bt_opc_12.setVisibility(View.INVISIBLE);
            respostaUsuario[11] = "*";
        }
        if (resposta[12].equals("*")){
            bt_opc_13.setVisibility(View.INVISIBLE);
            respostaUsuario[12] = "*";
        }
        if (resposta[13].equals("*")){
            bt_opc_14.setVisibility(View.INVISIBLE);
            respostaUsuario[13] = "*";
        }
        if (resposta[14].equals("*")){
            bt_opc_15.setVisibility(View.INVISIBLE);
            respostaUsuario[14] = "*";
        }
        if (resposta[15].equals("*")){
            bt_opc_16.setVisibility(View.INVISIBLE);
            respostaUsuario[15] = "*";
        }
        if (resposta[16].equals("*")){
            bt_opc_17.setVisibility(View.INVISIBLE);
            respostaUsuario[16] = "*";
        }
        if (resposta[17].equals("*")){
            bt_opc_18.setVisibility(View.INVISIBLE);
            respostaUsuario[17] = "*";
        }
        if (resposta[18].equals("*")){
            bt_opc_19.setVisibility(View.INVISIBLE);
            respostaUsuario[18] = "*";
        }
        if (resposta[19].equals("*")){
            bt_opc_20.setVisibility(View.INVISIBLE);
            respostaUsuario[19] = "*";
        }
        if (resposta[20].equals("*")){
            bt_opc_21.setVisibility(View.INVISIBLE);
            respostaUsuario[20] = "*";
        }
        if (resposta[21].equals("*")){
            bt_opc_22.setVisibility(View.INVISIBLE);
            respostaUsuario[21] = "*";
        }
        if (resposta[22].equals("*")){
            bt_opc_23.setVisibility(View.INVISIBLE);
            respostaUsuario[22] = "*";
        }
        if (resposta[23].equals("*")){
            bt_opc_24.setVisibility(View.INVISIBLE);
            respostaUsuario[23] = "*";
        }
        if (resposta[24].equals("*")){
            bt_opc_25.setVisibility(View.INVISIBLE);
            respostaUsuario[24] = "*";
        }
    }

    private void verificarResposta(){
        if( compararResposta() ){
            Intent intent;
            intent = new Intent(JogoParImparActivity.this, CheckAnswer.class);
            intent.putExtra("resposta", respostaFinal);
            intent.putExtra("jogando", jogando);
            startActivity( intent );
            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            finish();
        }
    }

    private boolean compararResposta(){
        if (respostaUsuario[0].equals(resposta[0]) &&
                respostaUsuario[1].equals(resposta[1]) &&
                respostaUsuario[2].equals(resposta[2]) &&
                respostaUsuario[3].equals(resposta[3]) &&
                respostaUsuario[4].equals(resposta[4]) &&
                respostaUsuario[5].equals(resposta[5]) &&
                respostaUsuario[6].equals(resposta[6]) &&
                respostaUsuario[7].equals(resposta[7]) &&
                respostaUsuario[8].equals(resposta[8]) &&
                respostaUsuario[9].equals(resposta[9]) &&
                respostaUsuario[10].equals(resposta[10]) &&
                respostaUsuario[11].equals(resposta[11]) &&
                respostaUsuario[12].equals(resposta[12]) &&
                respostaUsuario[13].equals(resposta[13]) &&
                respostaUsuario[14].equals(resposta[14]) &&
                respostaUsuario[15].equals(resposta[15]) &&
                respostaUsuario[16].equals(resposta[16]) &&
                respostaUsuario[17].equals(resposta[17]) &&
                respostaUsuario[18].equals(resposta[18]) &&
                respostaUsuario[19].equals(resposta[19]) &&
                respostaUsuario[20].equals(resposta[20]) &&
                respostaUsuario[21].equals(resposta[21]) &&
                respostaUsuario[22].equals(resposta[22]) &&
                respostaUsuario[23].equals(resposta[23]) &&
                respostaUsuario[24].equals(resposta[24])) {
            return true;
        }
        else return false;
    }

    //verifica se existe campo em branco para colocar a letra
    private boolean verificarEspacoBranco() {
        if (respostaUsuario[0].equals("") ||
                respostaUsuario[1].equals("") ||
                respostaUsuario[2].equals("") ||
                respostaUsuario[3].equals("") ||
                respostaUsuario[4].equals("") ||
                respostaUsuario[5].equals("") ||
                respostaUsuario[6].equals("") ||
                respostaUsuario[7].equals("") ||
                respostaUsuario[8].equals("") ||
                respostaUsuario[9].equals("") ||
                respostaUsuario[10].equals("") ||
                respostaUsuario[11].equals("") ||
                respostaUsuario[12].equals("") ||
                respostaUsuario[13].equals("") ||
                respostaUsuario[14].equals("") ||
                respostaUsuario[15].equals("") ||
                respostaUsuario[16].equals("") ||
                respostaUsuario[17].equals("") ||
                respostaUsuario[18].equals("") ||
                respostaUsuario[19].equals("") ||
                respostaUsuario[20].equals("") ||
                respostaUsuario[21].equals("") ||
                respostaUsuario[22].equals("") ||
                respostaUsuario[23].equals("") ||
                respostaUsuario[24].equals("")){
            pintarDeBranco();
            return true;
        }

        if (compararResposta()) {
            pintarDeVerde();
        } else {
            pintarDeVermelho();
        }
        return false;
    }

    private void pintarDeBranco(){
        //deixar todas as letras na cor branca
        bt_opc_1.setTextColor(Color.WHITE);
        bt_opc_2.setTextColor(Color.WHITE);
        bt_opc_3.setTextColor(Color.WHITE);
        bt_opc_4.setTextColor(Color.WHITE);
        bt_opc_5.setTextColor(Color.WHITE);
        bt_opc_6.setTextColor(Color.WHITE);
        bt_opc_7.setTextColor(Color.WHITE);
        bt_opc_8.setTextColor(Color.WHITE);
        bt_opc_9.setTextColor(Color.WHITE);
        bt_opc_10.setTextColor(Color.WHITE);
        bt_opc_11.setTextColor(Color.WHITE);
        bt_opc_12.setTextColor(Color.WHITE);
        bt_opc_13.setTextColor(Color.WHITE);
        bt_opc_14.setTextColor(Color.WHITE);
        bt_opc_15.setTextColor(Color.WHITE);
        bt_opc_16.setTextColor(Color.WHITE);
        bt_opc_17.setTextColor(Color.WHITE);
        bt_opc_18.setTextColor(Color.WHITE);
        bt_opc_19.setTextColor(Color.WHITE);
        bt_opc_20.setTextColor(Color.WHITE);
        bt_opc_21.setTextColor(Color.WHITE);
        bt_opc_22.setTextColor(Color.WHITE);
        bt_opc_23.setTextColor(Color.WHITE);
        bt_opc_24.setTextColor(Color.WHITE);
        bt_opc_25.setTextColor(Color.WHITE);
    }

    private void pintarDeVermelho(){
        //deixar todas as letras na cor branca
        bt_opc_1.setTextColor(Color.RED);
        bt_opc_2.setTextColor(Color.RED);
        bt_opc_3.setTextColor(Color.RED);
        bt_opc_4.setTextColor(Color.RED);
        bt_opc_5.setTextColor(Color.RED);
        bt_opc_6.setTextColor(Color.RED);
        bt_opc_7.setTextColor(Color.RED);
        bt_opc_8.setTextColor(Color.RED);
        bt_opc_9.setTextColor(Color.RED);
        bt_opc_10.setTextColor(Color.RED);
        bt_opc_11.setTextColor(Color.RED);
        bt_opc_12.setTextColor(Color.RED);
        bt_opc_13.setTextColor(Color.RED);
        bt_opc_14.setTextColor(Color.RED);
        bt_opc_15.setTextColor(Color.RED);
        bt_opc_16.setTextColor(Color.RED);
        bt_opc_17.setTextColor(Color.RED);
        bt_opc_18.setTextColor(Color.RED);
        bt_opc_19.setTextColor(Color.RED);
        bt_opc_20.setTextColor(Color.RED);
        bt_opc_21.setTextColor(Color.RED);
        bt_opc_22.setTextColor(Color.RED);
        bt_opc_23.setTextColor(Color.RED);
        bt_opc_24.setTextColor(Color.RED);
        bt_opc_25.setTextColor(Color.RED);
    }

    private void pintarDeVerde(){
        //deixar todas as letras na cor branca
        bt_opc_1.setTextColor(Color.GREEN);
        bt_opc_2.setTextColor(Color.GREEN);
        bt_opc_3.setTextColor(Color.GREEN);
        bt_opc_4.setTextColor(Color.GREEN);
        bt_opc_5.setTextColor(Color.GREEN);
        bt_opc_6.setTextColor(Color.GREEN);
        bt_opc_7.setTextColor(Color.GREEN);
        bt_opc_8.setTextColor(Color.GREEN);
        bt_opc_9.setTextColor(Color.GREEN);
        bt_opc_10.setTextColor(Color.GREEN);
        bt_opc_11.setTextColor(Color.GREEN);
        bt_opc_12.setTextColor(Color.GREEN);
        bt_opc_13.setTextColor(Color.GREEN);
        bt_opc_14.setTextColor(Color.GREEN);
        bt_opc_15.setTextColor(Color.GREEN);
        bt_opc_16.setTextColor(Color.GREEN);
        bt_opc_17.setTextColor(Color.GREEN);
        bt_opc_18.setTextColor(Color.GREEN);
        bt_opc_19.setTextColor(Color.GREEN);
        bt_opc_20.setTextColor(Color.GREEN);
        bt_opc_21.setTextColor(Color.GREEN);
        bt_opc_22.setTextColor(Color.GREEN);
        bt_opc_23.setTextColor(Color.GREEN);
        bt_opc_24.setTextColor(Color.GREEN);
        bt_opc_25.setTextColor(Color.GREEN);
    }

    private void resolverFase(){
        if(moeda>=100) {
            txv_coins.setText("" + (moeda -= 10));
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("qt_moedas", moeda);
            editor.commit();

            respostaUsuario[0] = resposta[0];
            respostaUsuario[1] = resposta[1];
            respostaUsuario[2] = resposta[2];
            respostaUsuario[3] = resposta[3];
            respostaUsuario[4] = resposta[4];
            respostaUsuario[5] = resposta[5];
            respostaUsuario[6] = resposta[6];
            respostaUsuario[7] = resposta[7];
            respostaUsuario[8] = resposta[8];
            respostaUsuario[9] = resposta[9];
            respostaUsuario[10] = resposta[10];
            respostaUsuario[11] = resposta[11];
            respostaUsuario[12] = resposta[12];
            respostaUsuario[13] = resposta[13];
            respostaUsuario[14] = resposta[14];
            respostaUsuario[15] = resposta[15];
            respostaUsuario[16] = resposta[16];
            respostaUsuario[17] = resposta[17];
            respostaUsuario[18] = resposta[18];
            respostaUsuario[19] = resposta[19];
            respostaUsuario[20] = resposta[20];
            respostaUsuario[21] = resposta[21];
            respostaUsuario[22] = resposta[22];
            respostaUsuario[23] = resposta[23];
            respostaUsuario[24] = resposta[24];

            bt_opc_1.setText(resposta[0]);
            bt_opc_2.setText(resposta[1]);
            bt_opc_3.setText(resposta[2]);
            bt_opc_4.setText(resposta[3]);
            bt_opc_5.setText(resposta[4]);
            bt_opc_6.setText(resposta[5]);
            bt_opc_7.setText(resposta[6]);
            bt_opc_8.setText(resposta[7]);
            bt_opc_9.setText(resposta[8]);
            bt_opc_10.setText(resposta[9]);
            bt_opc_11.setText(resposta[10]);
            bt_opc_12.setText(resposta[11]);
            bt_opc_13.setText(resposta[12]);
            bt_opc_14.setText(resposta[13]);
            bt_opc_15.setText(resposta[14]);
            bt_opc_16.setText(resposta[15]);
            bt_opc_17.setText(resposta[16]);
            bt_opc_18.setText(resposta[17]);
            bt_opc_19.setText(resposta[18]);
            bt_opc_20.setText(resposta[19]);
            bt_opc_21.setText(resposta[20]);
            bt_opc_22.setText(resposta[21]);
            bt_opc_23.setText(resposta[22]);
            bt_opc_24.setText(resposta[23]);
            bt_opc_25.setText(resposta[24]);
            pintarDeVerde();
            verificarResposta();

        } else {
            Toast.makeText(
                    JogoParImparActivity.this,
                    "Você não tem moedas suficientes =(\nAssista a vídeos para receber moedas =)",
                    Toast.LENGTH_LONG
            ).show();
        }
    }

    private void mostrarBotoes(){
        //mostrando todas as letras de opção
        bt_lt_1.setVisibility(View.VISIBLE);
        bt_lt_2.setVisibility(View.VISIBLE);
        bt_lt_3.setVisibility(View.VISIBLE);
        bt_lt_4.setVisibility(View.VISIBLE);
        bt_lt_5.setVisibility(View.VISIBLE);
        bt_lt_6.setVisibility(View.VISIBLE);
        bt_lt_7.setVisibility(View.VISIBLE);
        bt_lt_8.setVisibility(View.VISIBLE);
        bt_lt_9.setVisibility(View.VISIBLE);
        bt_lt_10.setVisibility(View.VISIBLE);
        bt_lt_11.setVisibility(View.VISIBLE);
        bt_lt_12.setVisibility(View.VISIBLE);
        bt_lt_13.setVisibility(View.VISIBLE);
        bt_lt_14.setVisibility(View.VISIBLE);
        bt_lt_15.setVisibility(View.VISIBLE);
        bt_lt_16.setVisibility(View.VISIBLE);
        bt_lt_17.setVisibility(View.VISIBLE);
        bt_lt_18.setVisibility(View.VISIBLE);
        bt_lt_19.setVisibility(View.VISIBLE);
        bt_lt_20.setVisibility(View.VISIBLE);
        bt_lt_21.setVisibility(View.VISIBLE);
        bt_lt_22.setVisibility(View.VISIBLE);
        bt_lt_23.setVisibility(View.VISIBLE);
        bt_lt_24.setVisibility(View.VISIBLE);
        bt_lt_25.setVisibility(View.VISIBLE);
        bt_lt_26.setVisibility(View.VISIBLE);

        //limpando todas as letras da resposta na tela
        bt_opc_1.setText("");
        bt_opc_2.setText("");
        bt_opc_3.setText("");
        bt_opc_4.setText("");
        bt_opc_5.setText("");
        bt_opc_6.setText("");
        bt_opc_7.setText("");
        bt_opc_8.setText("");
        bt_opc_9.setText("");
        bt_opc_10.setText("");
        bt_opc_11.setText("");
        bt_opc_12.setText("");
        bt_opc_13.setText("");
        bt_opc_14.setText("");
        bt_opc_15.setText("");
        bt_opc_16.setText("");
        bt_opc_17.setText("");
        bt_opc_18.setText("");
        bt_opc_19.setText("");
        bt_opc_20.setText("");
        bt_opc_21.setText("");
        bt_opc_22.setText("");
        bt_opc_23.setText("");
        bt_opc_24.setText("");
        bt_opc_25.setText("");
    }

    private void jaApagouLetras() {
        for (String c:letrasErradas) {
            if(bt_lt_1.getText().equals(c)){
                bt_lt_1.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_2.getText().equals(c)){
                bt_lt_2.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_3.getText().equals(c)){
                bt_lt_3.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_4.getText().equals(c)){
                bt_lt_4.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_5.getText().equals(c)){
                bt_lt_5.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_6.getText().equals(c)){
                bt_lt_6.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_7.getText().equals(c)){
                bt_lt_7.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_8.getText().equals(c)){
                bt_lt_8.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_9.getText().equals(c)){
                bt_lt_9.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_10.getText().equals(c)){
                bt_lt_10.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_11.getText().equals(c)){
                bt_lt_11.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_12.getText().equals(c)){
                bt_lt_12.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_13.getText().equals(c)){
                bt_lt_13.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_14.getText().equals(c)){
                bt_lt_14.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_15.getText().equals(c)){
                bt_lt_15.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_16.getText().equals(c)){
                bt_lt_16.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_17.getText().equals(c)){
                bt_lt_17.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_18.getText().equals(c)){
                bt_lt_18.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_19.getText().equals(c)){
                bt_lt_19.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_20.getText().equals(c)){
                bt_lt_20.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_21.getText().equals(c)){
                bt_lt_21.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_22.getText().equals(c)){
                bt_lt_22.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_23.getText().equals(c)){
                bt_lt_23.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_24.getText().equals(c)){
                bt_lt_24.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_25.getText().equals(c)){
                bt_lt_25.setVisibility(View.INVISIBLE);
            }
            if(bt_lt_26.getText().equals(c)){
                bt_lt_26.setVisibility(View.INVISIBLE);
            }
        }
    }

    private void apagarRespostaUsuario(){
        for (int i = 0; i < 25;i++){
            respostaUsuario[i] = "";
        }
    }

    private void apagarLetras(String j){

        if ((j.equals("filme") && removeuFilme==0) || (j.equals("serie") && removeuSerie==0) || (j.equals("anime") && removeuAnime==0) || (j.equals("game") && removeuGame==0) ){
            if(moeda>=30) {
                txv_coins.setText("" + (moeda -= 30));
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("qt_moedas", moeda);
                if(j.equals("filme")) {
                    editor.putInt("removeu_filme", 01);
                    removeuFilme = 1;
                }
                if(j.equals("serie")) {
                    editor.putInt("removeu_serie", 01);
                    removeuSerie = 1;
                }
                if(j.equals("anime")) {
                    editor.putInt("removeu_anime", 01);
                    removeuAnime = 1;
                }
                if(j.equals("game")) {
                    editor.putInt("removeu_game", 01);
                    removeuGame = 1;
                }
                editor.commit();

                mostrarBotoes();

                apagarRespostaUsuario();

                prepararBotaoOpc();

                for (String c:letrasErradas) {
                    if(bt_lt_1.getText().equals(c)){
                        bt_lt_1.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_2.getText().equals(c)){
                        bt_lt_2.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_3.getText().equals(c)){
                        bt_lt_3.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_4.getText().equals(c)){
                        bt_lt_4.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_5.getText().equals(c)){
                        bt_lt_5.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_6.getText().equals(c)){
                        bt_lt_6.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_7.getText().equals(c)){
                        bt_lt_7.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_8.getText().equals(c)){
                        bt_lt_8.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_9.getText().equals(c)){
                        bt_lt_9.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_10.getText().equals(c)){
                        bt_lt_10.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_11.getText().equals(c)){
                        bt_lt_11.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_12.getText().equals(c)){
                        bt_lt_12.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_13.getText().equals(c)){
                        bt_lt_13.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_14.getText().equals(c)){
                        bt_lt_14.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_15.getText().equals(c)){
                        bt_lt_15.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_16.getText().equals(c)){
                        bt_lt_16.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_17.getText().equals(c)){
                        bt_lt_17.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_18.getText().equals(c)){
                        bt_lt_18.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_19.getText().equals(c)){
                        bt_lt_19.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_20.getText().equals(c)){
                        bt_lt_20.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_21.getText().equals(c)){
                        bt_lt_21.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_22.getText().equals(c)){
                        bt_lt_22.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_23.getText().equals(c)){
                        bt_lt_23.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_24.getText().equals(c)){
                        bt_lt_24.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_25.getText().equals(c)){
                        bt_lt_25.setVisibility(View.INVISIBLE);
                    }
                    if(bt_lt_26.getText().equals(c)){
                        bt_lt_26.setVisibility(View.INVISIBLE);
                    }
                }
            }
            else {
                Toast.makeText(
                        JogoParImparActivity.this,
                        "Você não tem moedas suficientes =(\nAssista a vídeos para receber moedas =)",
                        Toast.LENGTH_LONG
                ).show();
            }
        }
        else {
            Toast.makeText(
                    JogoParImparActivity.this,
                    "Você já removeu as letras erradas dessa fase.",
                    Toast.LENGTH_LONG
            ).show();
        }
    }

    //screenshoot
    private void findViews() {
        fullPageScreenshot = (Button) findViewById(R.id.bt_help_friends);

        imageView = (ImageView) findViewById(R.id.image_view);

        rootContent = (ConstraintLayout) findViewById(R.id.root_content);

    }

    private void implementClickEvents() {
        fullPageScreenshot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_help_friends:
                takeScreenshot(ScreenshotType.FULL);
                break;
        }
    }

    private void takeScreenshot(ScreenshotType screenshotType) {
        Bitmap b = null;
        switch (screenshotType) {
            case FULL:
                b = ScreenshotUtils.getScreenShot(rootContent);
                break;
        }

        if (b != null) {
            showScreenShotImage(b);

            File saveFile = ScreenshotUtils.getMainDirectoryName(this);
            File file = ScreenshotUtils.store(b, "screenshot" + screenshotType + ".jpg", saveFile);
            shareScreenshot(file);
        } else
            Toast.makeText(this, R.string.screenshot_take_failed, Toast.LENGTH_SHORT).show();

    }

    private void showScreenShotImage(Bitmap b) {
        imageView.setImageBitmap(b);
    }

    private void shareScreenshot(File file) {
        //modificado para android oreo
        Uri uri = FileProvider.getUriForFile(JogoParImparActivity.this, BuildConfig.APPLICATION_ID + ".provider",file);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_SUBJECT, "");
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.sharing_text));
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(intent, getString(R.string.share_title)));
    }

    private void  loadRewardVideoAd()
    {
        if(!mAd.isLoaded())
        {
           // mAd.loadAd("ca-app-pub-1493186259985891/7164376328", new AdRequest.Builder().addTestDevice("2DB0EA37E5782F0EFA7DF542EEC99770").build());
            mAd.loadAd("ca-app-pub-1493186259985891/7164376328", new AdRequest.Builder().addTestDevice("9FD8ED97110B2A6E9CD4264637EBDCF7").build());
                   //   mAd.loadAd("ca-app-pub-1493186259985891/7164376328", new AdRequest.Builder().build()); //
        }
    }

    public void startVideoAd(View view)
    {
        if(mAd.isLoaded())
        {
            mAd.show();
        }
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

        loadRewardVideoAd();

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        //moeda = 0;
        txv_coins.setText(""+(moeda += 15));
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("qt_moedas", moeda);
        editor.commit();
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    protected void onPause() {
        mAd.pause(this);
        super.onPause();
    }

    @Override
    protected void onResume() {
        mAd.resume(this);
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        mAd.destroy(this);
        super.onDestroy();
    }

}