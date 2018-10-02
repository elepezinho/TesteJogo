package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.monteiro.guessmovie.screenshot.ScreenshotType;
import com.monteiro.guessmovie.screenshot.ScreenshotUtils;

import java.io.File;

public class Jogo13LetrasActivity extends AppCompatActivity implements RewardedVideoAdListener, View.OnClickListener {

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

    private Toolbar toolbar;

    private String[] respostaUsuario = new String[13];
    private String[] resposta = new String[13];
    private String[] letras = new String[16];

    private RewardedVideoAd mAd;
    private TextView txv_coins;
    private int img;
    private int moeda;
    private int nvlFilme;
    private int nvlSerie;
    private int nvlAnime;
    private String jogando;
    private AdView mAdview;
    private Button fullPageScreenshot;
    private ImageView imageView;
    private ConstraintLayout rootContent;

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_13_letras);

        //implementação de onclick para o screenshoot
        findViews();
        implementClickEvents();

        //recuperando dados de preferencia do usuario
        pref = getSharedPreferences("pref", MODE_PRIVATE);
        moeda = pref.getInt("qt_moedas", 500);
        nvlFilme = pref.getInt("nvl_filme", 01);
        nvlSerie = pref.getInt("nvl_serie", 01);
        nvlAnime = pref.getInt("nvl_anime", 01);

        //inserir qt moedas do usuario na tela
        txv_coins = (TextView)findViewById(R.id.txv_coins13);
        txv_coins.setText(""+moeda);

        //recuperando tipo de categoria que o usuario selecionou
        Bundle extra = getIntent().getExtras();
        if(extra != null){
            jogando = extra.getString("jogando");
        }
        toolbar = (Toolbar) findViewById(R.id.toolbar13);

        //verificando a categoria e criando a fase de acordo com o nvl do usuario na categoria
        if(jogando.equals("filme")) {
            toolbar.setTitle("FILME");
            criarJogo(nvlFilme);
        }
        else if(jogando.equals("serie")) {
            toolbar.setTitle("SÉRIE");
            criarJogo(nvlSerie);
        }
        else if(jogando.equals("anime")) {
            toolbar.setTitle("ANIME");
            criarJogo(nvlAnime);
        }
        setSupportActionBar(toolbar);

        //inserir imagem da jogada na tela
        im_principal = (ImageView) findViewById(R.id.im_principal_13);
        im_principal.setImageResource(img);

        //ação de clicar em umas das 16 letras
        bt_lt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_1.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[0], "lt1");
                }
            }
        });

        bt_lt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_2.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[1], "lt2");
                }
            }
        });

        bt_lt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_3.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[2], "lt3");
                }
            }
        });

        bt_lt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_4.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[3], "lt4");
                }
            }
        });

        bt_lt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_5.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[4], "lt5");
                }
            }
        });

        bt_lt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_6.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[5], "lt6");
                }
            }
        });

        bt_lt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_7.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[6], "lt7");
                }
            }
        });

        bt_lt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_8.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[7], "lt8");
                }
            }
        });

        bt_lt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_9.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[8], "lt9");
                }
            }
        });

        bt_lt_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_10.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[9], "lt10");
                }
            }
        });

        bt_lt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_11.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[10], "lt11");
                }
            }
        });

        bt_lt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_12.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[11], "lt12");
                }
            }
        });

        bt_lt_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_13.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[12], "lt13");
                }
            }
        });

        bt_lt_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_14.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[13], "lt14");
                }
            }
        });

        bt_lt_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_15.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[14], "lt15");
                }
            }
        });

        bt_lt_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lt_16.setVisibility(View.INVISIBLE);
                    inserirLetra(letras[15], "lt16");
                }
            }
        });

        //ação ao clicar nas letras escolhidas
        bt_opc_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_1.setText("");
                removerLetra(lt1_resposta);
                respostaUsuario[0] = null;
            }
        });

        bt_opc_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_2.setText("");
                removerLetra(lt2_resposta);
                respostaUsuario[1] = null;
            }
        });

        bt_opc_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_3.setText("");
                removerLetra(lt3_resposta);
                respostaUsuario[2] = null;
            }
        });
        bt_opc_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_4.setText("");
                removerLetra(lt4_resposta);
                respostaUsuario[3] = null;
            }
        });
        bt_opc_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_5.setText("");
                removerLetra(lt5_resposta);
                respostaUsuario[4] = null;
            }
        });
        bt_opc_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_6.setText("");
                removerLetra(lt6_resposta);
                respostaUsuario[5] = null;
            }
        });
        bt_opc_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_7.setText("");
                removerLetra(lt7_resposta);
                respostaUsuario[6] = null;
            }
        });

        bt_opc_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_8.setText("");
                removerLetra(lt8_resposta);
                respostaUsuario[7] = null;
            }
        });

        bt_opc_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_9.setText("");
                removerLetra(lt9_resposta);
                respostaUsuario[8] = null;
            }
        });
        bt_opc_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_10.setText("");
                removerLetra(lt10_resposta);
                respostaUsuario[9] = null;
            }
        });
        bt_opc_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_11.setText("");
                removerLetra(lt11_resposta);
                respostaUsuario[10] = null;
            }
        });
        bt_opc_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_12.setText("");
                removerLetra(lt12_resposta);
                respostaUsuario[11] = null;
            }
        });
        bt_opc_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_13.setText("");
                removerLetra(lt13_resposta);
                respostaUsuario[12] = null;
            }
        });

        //banner
        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
        mAdview = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        //AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        mAdview.loadAd(adRequest);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-3940256099942544~3347511713");

        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);

        loadRewardVideoAd();
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
    }

    private void criarJogo(int nvlSerie) {

        //botões de escolha do usuário
        criarBotoesOpcoes();

        //botões das letras
        criarBotoesLetras();

        if(nvlSerie == 02){
            //inserindo o caminho da imagem
            img = R.drawable.serie02;
            //Iniciando o vetor da resposta correta
            resposta[0] = "G";
            resposta[1] = "A";
            resposta[2] = "M";
            resposta[3] = "E";
            resposta[4] = "O";
            resposta[5] = "F";
            resposta[6] = "T";
            resposta[7] = "H";
            resposta[8] = "R";
            resposta[9] = "O";
            resposta[10] = "N";
            resposta[11] = "E";
            resposta[12] = "S";
            //iniciando o vetor com as 16 letras embaralhadas
            letras[0] = "O";
            letras[1] = "E";
            letras[2] = "T";
            letras[3] = "E";
            letras[4] = "H";
            letras[5] = "I";
            letras[6] = "S";
            letras[7] = "R";
            letras[8] = "T";
            letras[9] = "B";
            letras[10] = "F";
            letras[11] = "A";
            letras[12] = "O";
            letras[13] = "G";
            letras[14] = "N";
            letras[15] = "M";

            //inserir letras nos botões
            inserirLetrasBotoes();

            bt_opc_4.setLetterSpacing(23);
        }
    }

    public void inserirLetra(String letra, String lt_resposta){
        if(respostaUsuario[0]==null) {
            respostaUsuario[0] = letra;
            bt_opc_1.setText(letra);
            lt1_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[1]==null) {
            respostaUsuario[1] = letra;
            bt_opc_2.setText(letra);
            lt2_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[2]==null) {
            respostaUsuario[2] = letra;
            bt_opc_3.setText(letra);
            lt3_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[3]==null) {
            respostaUsuario[3] = letra;
            bt_opc_4.setText(letra);
            lt4_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[4]==null) {
            respostaUsuario[4] = letra;
            bt_opc_5.setText(letra);
            lt5_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[5]==null) {
            respostaUsuario[5] = letra;
            bt_opc_6.setText(letra);
            lt6_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[6]==null) {
            respostaUsuario[6] = letra;
            bt_opc_7.setText(letra);
            lt7_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[7]==null) {
            respostaUsuario[7] = letra;
            bt_opc_8.setText(letra);
            lt8_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[8]==null) {
            respostaUsuario[8] = letra;
            bt_opc_9.setText(letra);
            lt9_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[9]==null) {
            respostaUsuario[9] = letra;
            bt_opc_10.setText(letra);
            lt10_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[10]==null) {
            respostaUsuario[10] = letra;
            bt_opc_11.setText(letra);
            lt11_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[11]==null) {
            respostaUsuario[11] = letra;
            bt_opc_12.setText(letra);
            lt12_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[12]==null) {
            respostaUsuario[12] = letra;
            bt_opc_13.setText(letra);
            lt13_resposta = lt_resposta;
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
    }

    private void verificarResposta(){
        if(respostaUsuario[0] == resposta[0] &&
                respostaUsuario[1] == resposta[1] &&
                respostaUsuario[2] == resposta[2] &&
                respostaUsuario[3] == resposta[3] &&
                respostaUsuario[4] == resposta[4] &&
                respostaUsuario[5] == resposta[5] &&
                respostaUsuario[6] == resposta[6] &&
                respostaUsuario[7] == resposta[7] &&
                respostaUsuario[8] == resposta[8] &&
                respostaUsuario[9] == resposta[9] &&
                respostaUsuario[10] == resposta[10] &&
                respostaUsuario[11] == resposta[11] &&
                respostaUsuario[12] == resposta[12] ){

            String resp = "";

            for(String letra: respostaUsuario) {
                resp = resp + letra;
            }

            Intent intent;
            intent = new Intent(Jogo13LetrasActivity.this, CheckAnswer.class);
            intent.putExtra("resposta", resp);
            intent.putExtra("jogando", jogando);
            startActivity( intent );
        }
    }

    //verifica se existe campo em branco para colocar a letra
    private boolean verificarEspacoBranco() {
        if (respostaUsuario[0] == null ||
                respostaUsuario[1] == null ||
                respostaUsuario[2] == null ||
                respostaUsuario[3] == null ||
                respostaUsuario[4] == null ||
                respostaUsuario[5] == null ||
                respostaUsuario[6] == null ||
                respostaUsuario[7] == null ||
                respostaUsuario[8] == null ||
                respostaUsuario[9] == null ||
                respostaUsuario[10] == null ||
                respostaUsuario[11] == null||
                respostaUsuario[12] == null ||
                respostaUsuario[13] == null ){

            return true;
        }
        return false;
    }

    //screenshoot
    private void findViews() {
        fullPageScreenshot = (Button) findViewById(R.id.helpfriends);

        imageView = (ImageView) findViewById(R.id.image_view);

        rootContent = (ConstraintLayout) findViewById(R.id.root_content);

    }

    private void implementClickEvents() {
        fullPageScreenshot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.helpfriends:
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
        Uri uri = Uri.fromFile(file);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, getString(R.string.sharing_text));
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(intent, getString(R.string.share_title)));
    }

    private void  loadRewardVideoAd()
    {
        if(!mAd.isLoaded())
        {
            mAd.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build());
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