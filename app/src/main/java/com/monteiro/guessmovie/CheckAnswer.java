package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class CheckAnswer extends AppCompatActivity {

    private Button bt_inicio;
    private Button bt_proximo;
    private TextView txv_resposta;
    private String resposta;
    private int moeda;
    private String jogando;
    private int nvlFilme;
    private int nvlSerie;
    private int nvlAnime;
    private int nvlGame;
    private int totalFilme;
    private int totalSerie;
    private int totalAnime;
    private int totalGame;
    private AdView mAdview;
    private InterstitialAd interstitial;

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);

        pref = getSharedPreferences("pref", MODE_PRIVATE);

        bt_inicio = (Button) findViewById(R.id.bt_inicio);
        bt_proximo = (Button) findViewById(R.id.bt_proximo);
        txv_resposta = (TextView) findViewById(R.id.txv_resposta);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            resposta = extra.getString("resposta");
            jogando = extra.getString("jogando");
        }

        //pegando a preferencia moeda e somando +15
        moeda = pref.getInt("qt_moedas", 100);
        moeda += 15;

        //pegando as preferencias nvl de jogo
        nvlFilme = pref.getInt("nvl_filme", 01);
        nvlSerie = pref.getInt("nvl_serie", 01);
        nvlAnime = pref.getInt("nvl_anime", 01);
        nvlGame = pref.getInt("nvl_game", 01);
        totalFilme = pref.getInt("total_filme", 10);
        totalSerie = pref.getInt("total_serie", 10);
        totalAnime = pref.getInt("total_anime", 10);
        totalGame = pref.getInt("total_game", 10);

        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("qt_moedas", moeda);

        //somando mais 1 no nivel de jogo
        if(jogando.equals("filme")) {
            nvlFilme+=1;
            editor.putInt("nvl_filme", nvlFilme);
        }
        else if(jogando.equals("serie")) {
            nvlSerie+=1;
            editor.putInt("nvl_serie", nvlSerie);
        }
        else if(jogando.equals("anime")) {
            nvlAnime+=1;
            editor.putInt("nvl_anime", nvlAnime);
        }
        else if(jogando.equals("game")) {
            nvlGame+=1;
            editor.putInt("nvl_game", nvlGame);
        }

        editor.commit();

        txv_resposta.setText(resposta);

        bt_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(CheckAnswer.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bt_proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jogando.equals("filme")) {
                    if (verificarAcertosFilme()) {
                        if (nvlFilme == 01 || nvlFilme == 04 || nvlFilme == 05 || nvlFilme == 07) {
                            Intent intent = new Intent(CheckAnswer.this, JogoImparParActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                        else if (nvlFilme == 02 || nvlFilme == 03 || nvlFilme == 06 || nvlFilme == 10) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                        else if (nvlFilme == 8 || nvlFilme == 9) {
                            Intent intent = new Intent(CheckAnswer.this, JogoImparImparActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                    }
                    else{
                        Toast.makeText(
                                CheckAnswer.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
                else if(jogando.equals("serie")) {
                    if (verificarAcertosSerie()) {
                        if (nvlSerie == 01 || nvlSerie == 9) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        } else if (nvlSerie == 02 || nvlSerie == 03 || nvlSerie == 06 || nvlSerie == 10) {
                            Intent intent = new Intent(CheckAnswer.this, JogoImparImparActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                        else if (nvlSerie == 04 || nvlSerie == 07) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParImparActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                        else if (nvlSerie == 05 || nvlSerie == 8) {
                            Intent intent = new Intent(CheckAnswer.this, JogoImparParActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                    }
                    else{
                        Toast.makeText(
                                CheckAnswer.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
                else if(jogando.equals("anime")) {
                    if (verificarAcertosAnime()) {
                        if (nvlAnime == 01 || nvlAnime == 02 || nvlAnime == 05) {
                        Intent intent = new Intent(CheckAnswer.this, JogoParActivity.class);
                        jogando = "anime";
                        intent.putExtra("jogando", jogando);
                        startActivity(intent);
                        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                        finish();
                        }
                        if (nvlAnime == 03 || nvlAnime == 06 || nvlAnime == 8 ) {
                            Intent intent = new Intent(CheckAnswer.this, JogoImparImparActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                        if (nvlAnime == 04 || nvlAnime == 07 || nvlAnime == 9 || nvlAnime == 10 ) {
                            Intent intent = new Intent(CheckAnswer.this, JogoImparParActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                    }
                    else{
                        Toast.makeText(
                                CheckAnswer.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
                if(jogando.equals("game")) {
                    if (verificarAcertosGame()) {
                        if (nvlGame == 01 || nvlGame == 03 || nvlGame == 04 || nvlGame == 9) {
                            Intent intent = new Intent(CheckAnswer.this, JogoImparImparActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        } if (nvlGame == 06 || nvlGame == 8) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParImparActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        } if (nvlGame == 02 || nvlGame == 05 || nvlGame == 07 || nvlGame == 10) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        }
                    }
                    else{
                        Toast.makeText(
                                CheckAnswer.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        });

        //banner
        MobileAds.initialize(this,"ca-app-pub-1493186259985891~9080093224");
        mAdview = (AdView)findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("9FD8ED97110B2A6E9CD4264637EBDCF7").build();
        mAdview.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1493186259985891/2131541497");
    }

    private void exibirPropaganda(){
        //propaganda interticial
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("9FD8ED97110B2A6E9CD4264637EBDCF7").build();
        //AdRequest adRequest = new AdRequest.Builder().build();
        interstitial = new InterstitialAd(CheckAnswer.this);
        interstitial.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                displayInterstitial();
            }
        });
    }

    private boolean verificarAcertosFilme() {
        if(nvlFilme%5==0){
            exibirPropaganda();
        }
        if (nvlFilme <= totalFilme) return true;
        else return false;
    }

    private boolean verificarAcertosSerie() {
        if(nvlSerie%5==0){
            exibirPropaganda();
        }
        if (nvlSerie <= totalSerie) return true;
        else return false;
    }

    private boolean verificarAcertosAnime() {
        if(nvlAnime%5==0){
            exibirPropaganda();
        }
        if (nvlAnime <= totalAnime) return true;
        else return false;
    }

    private boolean verificarAcertosGame() {
        if(nvlGame%5==0){
            exibirPropaganda();
        }
        if (nvlGame <= totalGame) return true;
        else return false;
    }

    private void displayInterstitial() {
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

    @Override
    public void onBackPressed() {
        // finish() is called in super: we only override method to be able to override transition
        super.onBackPressed();
        overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
    }
}