package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    //private ImageView bt_filme;
    private ListView lista;
    private List<Category> listas;
    private CategoryAdapter adapter;
    private Toolbar toolbar;

    SharedPreferences pref;

    private Boolean jaAcessou;
    private int nvlFilme;
    private int nvlSerie;
    private int nvlAnime;
    private int nvlGame;
    private int totalFilme;
    private int totalSerie;
    private int totalAnime;
    private int totalGame;
    private int moeda;
    private String jogando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //consultando preferencias do usuario
        pref = getSharedPreferences("pref", MODE_PRIVATE);
        jaAcessou = pref.getBoolean("ja_acessou", false);
        nvlFilme = pref.getInt("nvl_filme", 01);
        nvlSerie = pref.getInt("nvl_serie", 01);
        nvlAnime = pref.getInt("nvl_anime", 01);
        nvlGame = pref.getInt("nvl_game", 01);
        totalFilme = pref.getInt("total_filme", 10);
        totalSerie = pref.getInt("total_serie", 10);
        totalAnime = pref.getInt("total_anime", 10);
        totalGame = pref.getInt("total_game", 10);
        moeda = pref.getInt("qt_moedas", 100);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("CATEGORIAS");
        setSupportActionBar(toolbar);

        listas = todasCategorias();
        lista = (ListView) findViewById(R.id.list_categories);

        adapter = new CategoryAdapter(listas, this);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    if (verificarAcertosFilme()) {
                        if (nvlFilme == 01 || nvlFilme == 04 || nvlFilme == 05 || nvlFilme == 07) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparParActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlFilme == 02 || nvlFilme == 03 || nvlFilme == 06 || nvlFilme == 10) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlFilme == 8 || nvlFilme == 9) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                    }
                    else{
                        Toast.makeText(
                                CategoriesActivity.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
                else if(position == 1) {
                    if (verificarAcertosSerie()) {
                        if (nvlSerie == 01 || nvlSerie == 9) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        } else if (nvlSerie == 02 || nvlSerie == 03 || nvlSerie == 06 || nvlSerie == 10) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlSerie == 04 || nvlSerie == 07) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParImparActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }else if (nvlSerie == 05 || nvlSerie == 8) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparParActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                    } else {
                        Toast.makeText(
                                CategoriesActivity.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
                else if(position == 2) {
                    if (verificarAcertosAnime()) {
                        if (nvlAnime == 01 || nvlAnime == 02 || nvlAnime == 05) {
                        Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                        jogando = "anime";
                        intent.putExtra("jogando", jogando);
                        startActivity(intent);
                        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                        onPause();
                        }
                        else if (nvlAnime == 03 || nvlAnime == 06 || nvlAnime == 8 ) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlAnime == 04 || nvlAnime == 07 || nvlAnime == 9 || nvlAnime == 10) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparParActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                    } else {
                        Toast.makeText(
                                CategoriesActivity.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
                else if(position == 3) {
                    if (verificarAcertosGame()) {
                        if (nvlGame == 01 || nvlGame == 03 || nvlGame == 04 || nvlGame == 9) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        } if (nvlGame == 06 || nvlGame == 8) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParImparActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        } if (nvlGame == 02 || nvlGame == 05 || nvlGame == 07 || nvlGame == 10) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                    }
                    else{
                        Toast.makeText(
                                CategoriesActivity.this,
                                "Você já acertou tudo dessa categoria!!\nEm breve teremos mais fases =)",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        });
    }

    @Override
    public void onStart(){
        super.onStart();

        pref = getSharedPreferences("pref", MODE_PRIVATE);
        nvlFilme = pref.getInt("nvl_filme", 01);
        nvlSerie = pref.getInt("nvl_serie", 01);
        nvlAnime = pref.getInt("nvl_anime", 01);
        nvlGame = pref.getInt("nvl_game", 01);

        listas = todasCategorias();
        lista = (ListView) findViewById(R.id.list_categories);
        adapter = new CategoryAdapter(listas, this);
        lista.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        // finish() is called in super: we only override method to be able to override transition
        super.onBackPressed();
        overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
    }

    private boolean verificarAcertosFilme() {
        if (nvlFilme <= totalFilme) return true;
        else return false;
    }

    private boolean verificarAcertosSerie() {
        if (nvlSerie <= totalSerie) return true;
        else return false;
    }

    private boolean verificarAcertosAnime() {
        if (nvlAnime <= totalAnime) return true;
        else return false;
    }

    private boolean verificarAcertosGame() {
        if (nvlGame <= totalGame) return true;
        else return false;
    }

    private List<Category> todasCategorias() {
        return new ArrayList<>(Arrays.asList(
                new Category("FILMES", R.drawable.cat01, nvlFilme, totalFilme),
                new Category("SÉRIES", R.drawable.cat02, nvlSerie, totalSerie),
                new Category("ANIMES", R.drawable.cat03, nvlAnime, totalAnime),
                new Category("GAMES", R.drawable.cat04, nvlGame, totalGame)
        ));
    }
}