package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
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

public class JogoParActivity extends AppCompatActivity implements RewardedVideoAdListener, View.OnClickListener {

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

    private Toolbar toolbar;

    private String[] respostaUsuario = new String[20];
    private String[] resposta = new String[20];
    private String[] letras = new String[20];
    private String respostaFinal;
    private String[] letrasErradas = new String[20];

    private RewardedVideoAd mAd;
    private TextView txv_coins;
    private int img;
    private int moeda;
    private int nvlFilme;
    private int nvlSerie;
    private int nvlAnime;
    private int removeuFilme;
    private int removeuSerie;
    private int removeuAnime;
    private String jogando;
    private AdView mAdview;
    private Button fullPageScreenshot;
    private Button btAddLetter;
    private Button btRemoveLetters;
    private ImageView imageView;
    private ConstraintLayout rootContent;

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_par);

        //implementação de onclick para o screenshoot
        findViews();
        implementClickEvents();

        //recuperando dados de preferencia do usuario
        pref = getSharedPreferences("pref", MODE_PRIVATE);
        moeda = pref.getInt("qt_moedas", 100);
        nvlFilme = pref.getInt("nvl_filme", 01);
        nvlSerie = pref.getInt("nvl_serie", 01);
        nvlAnime = pref.getInt("nvl_anime", 01);
        removeuFilme = pref.getInt("removeu_filme", 00);
        removeuSerie = pref.getInt("removeu_serie", 00);
        removeuAnime = pref.getInt("removeu_anime", 00);

        //inserir qt moedas do usuario na tela
        txv_coins = (TextView)findViewById(R.id.txv_coins_par);
        txv_coins.setText(""+moeda);
        btAddLetter = (Button) findViewById(R.id.bt_add_letter);
        btRemoveLetters = (Button) findViewById(R.id.btn_remove_letters);

        //recuperando tipo de categoria que o usuario selecionou
        Bundle extra = getIntent().getExtras();
        if(extra != null){
            jogando = extra.getString("jogando");
        }
        toolbar = (Toolbar) findViewById(R.id.toolbar_par);

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
                (jogando.equals("anime") && removeuAnime==1) ) {
            jaApagouLetras();
        }

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

    @Override
    public void onStart(){
        super.onStart();

        //ação de clicar em umas das 16 letras
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

        //ação ao clicar nas letras escolhidas
        bt_opc_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_1.setText("");
                removerLetra(lt1_resposta);
                respostaUsuario[0] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_2.setText("");
                removerLetra(lt2_resposta);
                respostaUsuario[1] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_3.setText("");
                removerLetra(lt3_resposta);
                respostaUsuario[2] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_4.setText("");
                removerLetra(lt4_resposta);
                respostaUsuario[3] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_5.setText("");
                removerLetra(lt5_resposta);
                respostaUsuario[4] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_6.setText("");
                removerLetra(lt6_resposta);
                respostaUsuario[5] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_7.setText("");
                removerLetra(lt7_resposta);
                respostaUsuario[6] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_8.setText("");
                removerLetra(lt8_resposta);
                respostaUsuario[7] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_9.setText("");
                removerLetra(lt9_resposta);
                respostaUsuario[8] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_10.setText("");
                removerLetra(lt10_resposta);
                respostaUsuario[9] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_11.setText("");
                removerLetra(lt11_resposta);
                respostaUsuario[10] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_12.setText("");
                removerLetra(lt12_resposta);
                respostaUsuario[11] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_13.setText("");
                removerLetra(lt13_resposta);
                respostaUsuario[12] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_14.setText("");
                removerLetra(lt14_resposta);
                respostaUsuario[13] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_15.setText("");
                removerLetra(lt15_resposta);
                respostaUsuario[14] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_16.setText("");
                removerLetra(lt16_resposta);
                respostaUsuario[15] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_17.setText("");
                removerLetra(lt17_resposta);
                respostaUsuario[16] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_18.setText("");
                removerLetra(lt18_resposta);
                respostaUsuario[17] = null;
                verificarEspacoBranco();
            }
        });

        bt_opc_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_19.setText("");
                removerLetra(lt19_resposta);
                respostaUsuario[18] = null;
                verificarEspacoBranco();
            }
        });
        bt_opc_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_opc_20.setText("");
                removerLetra(lt20_resposta);
                respostaUsuario[19] = null;
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
    }

    private void criarJogo(int nvl) {

        //botões de escolha do usuário
        criarBotoesOpcoes();

        //botões das letras
        criarBotoesLetras();

        if(nvl == 01 && jogando.equals("filme")){
            //inserindo o caminho da imagem
            img = R.drawable.filme01;
            //Iniciando o vetor da resposta correta
            resposta[0] = "*";
            resposta[1] = "T";
            resposta[2] = "I";
            resposta[3] = "T";
            resposta[4] = "A";
            resposta[5] = "N";
            resposta[6] = "I";
            resposta[7] = "C";
            resposta[8] = "*";
            resposta[9] = "*";
            resposta[10] = "*";
            resposta[11] = "*";
            resposta[12] = "*";
            resposta[13] = "*";
            resposta[14] = "*";
            resposta[15] = "*";
            resposta[16] = "*";
            resposta[17] = "*";
            resposta[18] = "*";
            resposta[19] = "*";

            //iniciando o vetor com as 20 letras embaralhadas
            letras[0] = "O";
            letras[1] = "I";
            letras[2] = "T";
            letras[3] = "E";
            letras[4] = "U";
            letras[5] = "I";
            letras[6] = "S";
            letras[7] = "C";
            letras[8] = "T";
            letras[9] = "B";
            letras[10] = "D";
            letras[11] = "A";
            letras[12] = "L";
            letras[13] = "P";
            letras[14] = "N";
            letras[15] = "M";
            letras[16] = "S";
            letras[17] = "H";
            letras[18] = "H";
            letras[19] = "E";

            //inserir letras nos botões
            inserirLetrasBotoes();

            //String com a resposta final
            respostaFinal = "Titanic";

            //vetor com as letras erradas
            letrasErradas[0] = "O";
            letrasErradas[1] = "H";
            letrasErradas[2] = "S";
            letrasErradas[3] = "F";
            letrasErradas[4] = "M";
            letrasErradas[5] = "P";
            letrasErradas[6] = "E";
            letrasErradas[7] = "L";
            letrasErradas[8] = "U";
            letrasErradas[9] = "D";
            letrasErradas[10] = "B";
        }
        else if(nvl == 01 && jogando.equals("serie")) {
            //inserindo o caminho da imagem
            img = R.drawable.serie01;
            //Iniciando o vetor da resposta correta
            resposta[0] = "*";
            resposta[1] = "*";
            resposta[2] = "*";
            resposta[3] = "L";
            resposta[4] = "O";
            resposta[5] = "S";
            resposta[6] = "T";
            resposta[7] = "*";
            resposta[8] = "*";
            resposta[9] = "*";
            resposta[10] = "*";
            resposta[11] = "*";
            resposta[12] = "*";
            resposta[13] = "*";
            resposta[14] = "*";
            resposta[15] = "*";
            resposta[16] = "*";
            resposta[17] = "*";
            resposta[18] = "*";
            resposta[19] = "*";

            //iniciando o vetor com as 20 letras embaralhadas
            letras[0] = "A";
            letras[1] = "I";
            letras[2] = "T";
            letras[3] = "E";
            letras[4] = "A";
            letras[5] = "I";
            letras[6] = "L";
            letras[7] = "C";
            letras[8] = "U";
            letras[9] = "B";
            letras[10] = "D";
            letras[11] = "O";
            letras[12] = "J";
            letras[13] = "P";
            letras[14] = "N";
            letras[15] = "M";
            letras[16] = "J";
            letras[17] = "S";
            letras[18] = "G";
            letras[19] = "E";

            //inserir letras nos botões
            inserirLetrasBotoes();

            //String com a resposta final
            respostaFinal = "Lost";

            //vetor com as letras erradas
            letrasErradas[0] = "A";
            letrasErradas[1] = "E";
            letrasErradas[2] = "I";
            letrasErradas[3] = "C";
            letrasErradas[4] = "U";
            letrasErradas[5] = "B";
            letrasErradas[6] = "D";
            letrasErradas[7] = "P";
            letrasErradas[8] = "N";
            letrasErradas[9] = "M";
            letrasErradas[10] = "G";
            letrasErradas[11] = "J";
        }

        else if(nvl == 01 && jogando.equals("anime")){
            //inserindo o caminho da imagem
            img = R.drawable.anime01;
            //Iniciando o vetor da resposta correta
            resposta[0] = "*";
            resposta[1] = "*";
            resposta[2] = "D";
            resposta[3] = "R";
            resposta[4] = "A";
            resposta[5] = "G";
            resposta[6] = "O";
            resposta[7] = "N";
            resposta[8] = "*";
            resposta[9] = "*";
            resposta[10] = "*";
            resposta[11] = "*";
            resposta[12] = "*";
            resposta[13] = "B";
            resposta[14] = "A";
            resposta[15] = "L";
            resposta[16] = "L";
            resposta[17] = "*";
            resposta[18] = "*";
            resposta[19] = "*";

            //iniciando o vetor com as 20 letras embaralhadas
            letras[0] = "A";
            letras[1] = "E";
            letras[2] = "L";
            letras[3] = "E";
            letras[4] = "H";
            letras[5] = "D";
            letras[6] = "S";
            letras[7] = "R";
            letras[8] = "L";
            letras[9] = "B";
            letras[10] = "F";
            letras[11] = "M";
            letras[12] = "O";
            letras[13] = "G";
            letras[14] = "N";
            letras[15] = "P";
            letras[16] = "S";
            letras[17] = "H";
            letras[18] = "A";
            letras[19] = "E";

            //inserir letras nos botões
            inserirLetrasBotoes();

            //String com a resposta final
            respostaFinal = "Dragon Ball";

            //vetor com as letras erradas
            letrasErradas[0] = "E";
            letrasErradas[1] = "H";
            letrasErradas[2] = "S";
            letrasErradas[3] = "F";
            letrasErradas[4] = "M";
            letrasErradas[5] = "P";
            letrasErradas[6] = "T";
        }
        else if(nvl == 03 && jogando.equals("filme")){
            //inserindo o caminho da imagem
            img = R.drawable.filme03;
            //Iniciando o vetor da resposta correta
            resposta[0] = "O";
            resposta[1] = "*";
            resposta[2] = "R";
            resposta[3] = "E";
            resposta[4] = "I";
            resposta[5] = "*";
            resposta[6] = "L";
            resposta[7] = "E";
            resposta[8] = "Ã";
            resposta[9] = "0";
            resposta[10] = "*";
            resposta[11] = "*";
            resposta[12] = "*";
            resposta[13] = "*";
            resposta[14] = "*";
            resposta[15] = "*";
            resposta[16] = "*";
            resposta[17] = "*";
            resposta[18] = "*";
            resposta[19] = "*";

            //iniciando o vetor com as 20 letras embaralhadas
            letras[0] = "C";
            letras[1] = "E";
            letras[2] = "L";
            letras[3] = "S";
            letras[4] = "H";
            letras[5] = "D";
            letras[6] = "S";
            letras[7] = "R";
            letras[8] = "I";
            letras[9] = "B";
            letras[10] = "F";
            letras[11] = "M";
            letras[12] = "O";
            letras[13] = "G";
            letras[14] = "N";
            letras[15] = "P";
            letras[16] = "S";
            letras[17] = "H";
            letras[18] = "Ã";
            letras[19] = "E";

            //inserir letras nos botões
            inserirLetrasBotoes();

            //String com a resposta final
            respostaFinal = "O Rei Leão";

            //vetor com as letras erradas
            letrasErradas[0] = "N";
            letrasErradas[1] = "H";
            letrasErradas[2] = "S";
            letrasErradas[3] = "F";
            letrasErradas[4] = "M";
            letrasErradas[5] = "P";
            letrasErradas[6] = "T";
            letrasErradas[7] = "C";
            letrasErradas[8] = "G";
            letrasErradas[9] = "D";
            letrasErradas[10] = "B";
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
        else if (respostaUsuario[13]==null) {
            respostaUsuario[13] = letra;
            bt_opc_14.setText(letra);
            lt14_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[14]==null) {
            respostaUsuario[14] = letra;
            bt_opc_15.setText(letra);
            lt15_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[15]==null) {
            respostaUsuario[15] = letra;
            bt_opc_16.setText(letra);
            lt16_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[16]==null) {
            respostaUsuario[16] = letra;
            bt_opc_17.setText(letra);
            lt17_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[17]==null) {
            respostaUsuario[17] = letra;
            bt_opc_18.setText(letra);
            lt18_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[18]==null) {
            respostaUsuario[18] = letra;
            bt_opc_19.setText(letra);
            lt19_resposta = lt_resposta;
            verificarResposta();
        }
        else if (respostaUsuario[19]==null) {
            respostaUsuario[19] = letra;
            bt_opc_20.setText(letra);
            lt20_resposta = lt_resposta;
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
    }

    private void prepararBotaoOpc(){
        if (resposta[0] == "*"){
            bt_opc_1.setVisibility(View.INVISIBLE);
            respostaUsuario[0] = "*";
        }
        if (resposta[1] == "*"){
            bt_opc_2.setVisibility(View.INVISIBLE);
            respostaUsuario[1] = "*";
        }
        if (resposta[2] == "*"){
            bt_opc_3.setVisibility(View.INVISIBLE);
            respostaUsuario[2] = "*";
        }
        if (resposta[3] == "*"){
            bt_opc_4.setVisibility(View.INVISIBLE);
            respostaUsuario[3] = "*";
        }
        if (resposta[4] == "*"){
            bt_opc_5.setVisibility(View.INVISIBLE);
            respostaUsuario[4] = "*";
        }
        if (resposta[5] == "*"){
            bt_opc_6.setVisibility(View.INVISIBLE);
            respostaUsuario[5] = "*";
        }
        if (resposta[6] == "*"){
            bt_opc_7.setVisibility(View.INVISIBLE);
            respostaUsuario[6] = "*";
        }
        if (resposta[7] == "*"){
            bt_opc_8.setVisibility(View.INVISIBLE);
            respostaUsuario[7] = "*";
        }
        if (resposta[8] == "*"){
            bt_opc_9.setVisibility(View.INVISIBLE);
            respostaUsuario[8] = "*";
        }
        if (resposta[9] == "*"){
            bt_opc_10.setVisibility(View.INVISIBLE);
            respostaUsuario[9] = "*";
        }
        if (resposta[10] == "*"){
            bt_opc_11.setVisibility(View.INVISIBLE);
            respostaUsuario[10] = "*";
        }
        if (resposta[11] == "*"){
            bt_opc_12.setVisibility(View.INVISIBLE);
            respostaUsuario[11] = "*";
        }
        if (resposta[12] == "*"){
            bt_opc_13.setVisibility(View.INVISIBLE);
            respostaUsuario[12] = "*";
        }
        if (resposta[13] == "*"){
            bt_opc_14.setVisibility(View.INVISIBLE);
            respostaUsuario[13] = "*";
        }
        if (resposta[14] == "*"){
            bt_opc_15.setVisibility(View.INVISIBLE);
            respostaUsuario[14] = "*";
        }
        if (resposta[15] == "*"){
            bt_opc_16.setVisibility(View.INVISIBLE);
            respostaUsuario[15] = "*";
        }
        if (resposta[16] == "*"){
            bt_opc_17.setVisibility(View.INVISIBLE);
            respostaUsuario[16] = "*";
        }
        if (resposta[17] == "*"){
            bt_opc_18.setVisibility(View.INVISIBLE);
            respostaUsuario[17] = "*";
        }
        if (resposta[18] == "*"){
            bt_opc_19.setVisibility(View.INVISIBLE);
            respostaUsuario[18] = "*";
        }
        if (resposta[19] == "*"){
            bt_opc_20.setVisibility(View.INVISIBLE);
            respostaUsuario[19] = "*";
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
                respostaUsuario[12] == resposta[12] &&
                respostaUsuario[13] == resposta[13] &&
                respostaUsuario[14] == resposta[14] &&
                respostaUsuario[15] == resposta[15] &&
                respostaUsuario[16] == resposta[16] &&
                respostaUsuario[17] == resposta[17] &&
                respostaUsuario[18] == resposta[18] &&
                respostaUsuario[19] == resposta[19] ){

            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("removeu_filme", 00);
            editor.putInt("removeu_serie", 00);
            editor.putInt("removeu_anime", 00);
            editor.commit();

            Intent intent;
            intent = new Intent(JogoParActivity.this, CheckAnswer.class);
            intent.putExtra("resposta", respostaFinal);
            intent.putExtra("jogando", jogando);
            startActivity( intent );
            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            finish();
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
                respostaUsuario[11] == null ||
                respostaUsuario[12] == null ||
                respostaUsuario[13] == null ||
                respostaUsuario[14] == null ||
                respostaUsuario[15] == null ||
                respostaUsuario[16] == null ||
                respostaUsuario[17] == null ||
                respostaUsuario[18] == null ||
                respostaUsuario[19] == null){
            pintarDeBranco();
            return true;
        }
        pintarDeVermelho();
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
    }

    private void resolverFase(){
        if(moeda>=50) {
            txv_coins.setText("" + (moeda -= 50));
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
            verificarResposta();

        } else {
            Toast.makeText(
                    JogoParActivity.this,
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

        //limpando todas as letras da resposta na tela
        bt_opc_1.setText(null);
        bt_opc_2.setText(null);
        bt_opc_3.setText(null);
        bt_opc_4.setText(null);
        bt_opc_5.setText(null);
        bt_opc_6.setText(null);
        bt_opc_7.setText(null);
        bt_opc_8.setText(null);
        bt_opc_9.setText(null);
        bt_opc_10.setText(null);
        bt_opc_11.setText(null);
        bt_opc_12.setText(null);
        bt_opc_13.setText(null);
        bt_opc_14.setText(null);
        bt_opc_15.setText(null);
        bt_opc_16.setText(null);
        bt_opc_17.setText(null);
        bt_opc_18.setText(null);
        bt_opc_19.setText(null);
        bt_opc_20.setText(null);
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
        }
    }

    private void apagarRespostaUsuario(){
        for (int i = 0; i < 20;i++){
            respostaUsuario[i] = null;
        }
    }

    private void apagarLetras(String j){

        if ((j.equals("filme") && removeuFilme==0) || (j.equals("serie") && removeuSerie==0) || (j.equals("anime") && removeuAnime==0) ){
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
                }
            }
            else {
                Toast.makeText(
                        JogoParActivity.this,
                        "Você não tem moedas suficientes =(\nAssista a vídeos para receber moedas =)",
                        Toast.LENGTH_LONG
                ).show();
            }
        }
        else {
            Toast.makeText(
                    JogoParActivity.this,
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
        Uri uri = Uri.fromFile(file);
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
        txv_coins.setText(""+(moeda += 10));
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