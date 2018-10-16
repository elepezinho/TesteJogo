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
    private int totalFilme;
    private int totalSerie;
    private int totalAnime;
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
        totalFilme = pref.getInt("total_filme", 3);
        totalSerie = pref.getInt("total_serie", 3);
        totalAnime = pref.getInt("total_anime", 3);

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
                        //if (nvlFilme == 01 || nvlFilme == 03 || nvlFilme ==  02) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        //}
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
                        //if (nvlSerie == 01 || nvlSerie == 02 || nvlSerie == 03) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        //}
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
                        //if (nvlAnime == 01) {
                            Intent intent = new Intent(CheckAnswer.this, JogoParActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            finish();
                        //}
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
        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
        mAdview = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        //AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        mAdview.loadAd(adRequest);
    }

    private void exibirPropaganda(){
        //propaganda interticial
        AdRequest adRequest = new AdRequest.Builder().build();
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
        if(nvlFilme%2==0){
            exibirPropaganda();
        }
        if (nvlFilme <= totalFilme) return true;
        else return false;
    }

    private boolean verificarAcertosSerie() {
        if(nvlSerie%3==0){
            exibirPropaganda();
        }
        if (nvlSerie <= totalSerie) return true;
        else return false;
    }

    private boolean verificarAcertosAnime() {
        if(nvlAnime%3==0){
            exibirPropaganda();
        }
        if (nvlAnime <= totalAnime) return true;
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