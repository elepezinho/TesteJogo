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
    private int totalFilme;
    private int totalSerie;
    private int totalAnime;
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
        totalFilme = pref.getInt("total_filme", 03);
        totalSerie = pref.getInt("total_serie", 03);
        totalAnime = pref.getInt("total_anime", 03);
        moeda = pref.getInt("qt_moedas", 500);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("CATEGORIAS");
        setSupportActionBar(toolbar);

        listas = todasCategorias();
        lista = (ListView) findViewById(R.id.list_categories);

        adapter = new CategoryAdapter(listas, this);
        lista.setAdapter(adapter);

        /*bt_filme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(CategoriesActivity.this, Filme02Activity.class);
                startActivity( intent );
            }
        });*/

        /*iv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(CategoriesActivity.this, Filme02Activity.class);
                startActivity( intent );
            }
        });*/

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    if (verificarAcertosFilme()) {
                        if (nvlFilme == 01 || nvlFilme == 03) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo7LetrasActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                        } else if (nvlFilme == 02) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo6LetrasActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
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
                        if (nvlSerie == 01) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo4LetrasActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                        } else if (nvlSerie == 02) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo13LetrasActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                        } else if (nvlSerie == 03) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo5LetrasActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
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
                        if (nvlAnime == 01) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo10LetrasActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                        } else if (nvlAnime == 02) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo6LetrasActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                        } else if (nvlAnime == 03) {
                            Intent intent = new Intent(CategoriesActivity.this, Jogo8LetrasActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                        }
                    } else {
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

    private List<Category> todasCategorias() {
        return new ArrayList<>(Arrays.asList(
                new Category("FILMES", R.drawable.cat01, nvlFilme, totalFilme),
                new Category("SÉRIES", R.drawable.cat02, nvlSerie, totalSerie),
                new Category("ANIMES", R.drawable.cat03, nvlAnime, totalAnime)
        ));
    }
}