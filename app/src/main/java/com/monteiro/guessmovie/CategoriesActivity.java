package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.monteiro.guessmovie.repositorio.DbHelper;
import com.monteiro.guessmovie.repositorio.PostConfig;

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
        setContentView(R.layout.activity_categories);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        dbHelper = new DbHelper(getBaseContext());
        db = dbHelper.getReadableDatabase();
        String[] projection = {
                PostConfig.PostEntry._ID,
                PostConfig.PostEntry.COLUMN_QT_MOEDAS,
                PostConfig.PostEntry.COLUMN_TOTAL_FILME,
                PostConfig.PostEntry.COLUMN_TOTAL_SERIE,
                PostConfig.PostEntry.COLUMN_TOTAL_ANIME,
                PostConfig.PostEntry.COLUMN_TOTAL_GAME
        };
        Cursor c = db.query(PostConfig.PostEntry.TABLE_NAME,projection,null,null,null,null,null);

        c.moveToFirst();
        int valorMoedas = c.getInt(
                c.getColumnIndexOrThrow(PostConfig.PostEntry.COLUMN_QT_MOEDAS)
        );

        int valorFilme = c.getInt(
                c.getColumnIndexOrThrow(PostConfig.PostEntry.COLUMN_TOTAL_FILME)
        );

        int valorSerie = c.getInt(
                c.getColumnIndexOrThrow(PostConfig.PostEntry.COLUMN_TOTAL_SERIE)
        );

        int valorAnime = c.getInt(
                c.getColumnIndexOrThrow(PostConfig.PostEntry.COLUMN_TOTAL_ANIME)
        );

        int valorGame = c.getInt(
                c.getColumnIndexOrThrow(PostConfig.PostEntry.COLUMN_TOTAL_GAME)
        );

        //consultando preferencias do usuario
        pref = getSharedPreferences("pref", MODE_PRIVATE);
        jaAcessou = pref.getBoolean("ja_acessou", false);
        nvlFilme = pref.getInt("nvl_filme", 01);
        nvlSerie = pref.getInt("nvl_serie", 01);
        nvlAnime = pref.getInt("nvl_anime", 01);
        nvlGame = pref.getInt("nvl_game", 01);
        totalFilme = pref.getInt("total_filme", valorFilme);
        totalSerie = pref.getInt("total_serie", valorSerie);
        totalAnime = pref.getInt("total_anime", valorAnime);
        totalGame = pref.getInt("total_game", valorGame);
        moeda = pref.getInt("qt_moedas", valorMoedas);

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
                        if (nvlFilme == 1 || nvlFilme == 4 || nvlFilme == 5 || nvlFilme == 7 || nvlFilme == 13
                                || nvlFilme == 16 || nvlFilme == 46) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparParActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlFilme == 2 || nvlFilme == 3 || nvlFilme == 6 || nvlFilme == 10 || nvlFilme == 17
                                || nvlFilme == 19 || nvlFilme == 21 || nvlFilme == 23 || nvlFilme == 27 || nvlFilme == 28
                                || nvlFilme == 32 || nvlFilme == 35 || nvlFilme == 36 || nvlFilme == 37 || nvlFilme == 38
                                || nvlFilme == 43 || nvlFilme == 44 || nvlFilme == 45 || nvlFilme == 50) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlFilme == Integer.parseInt("8") || nvlFilme == Integer.parseInt("9")
                                || nvlFilme == 14 || nvlFilme == 18 || nvlFilme == 22 || nvlFilme == 24 || nvlFilme == 26
                                || nvlFilme == 29 || nvlFilme == 30 || nvlFilme == 31 || nvlFilme == 33 || nvlFilme == 39
                                || nvlFilme == 40 || nvlFilme == 41 || nvlFilme == 42 || nvlFilme == 47 || nvlFilme == 48
                                || nvlFilme == 49) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "filme";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlFilme == 11 || nvlFilme == 12 || nvlFilme == 15 || nvlFilme == 20 || nvlFilme == 25
                                || nvlFilme == 34) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParImparActivity.class);
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
                        if (nvlSerie == 01 || nvlSerie == 9 || nvlSerie == 13 || nvlSerie == 14 || nvlSerie == 15
                                || nvlSerie == 17 || nvlSerie == 20 || nvlSerie == 25 || nvlSerie == 26
                                || nvlSerie == 30 || nvlSerie == 32 || nvlSerie == 33 || nvlSerie == 41
                                || nvlSerie == 45 || nvlSerie == 50) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        } else if (nvlSerie == 02 || nvlSerie == 03 || nvlSerie == 06 || nvlSerie == 10 || nvlSerie == 11
                                || nvlSerie == 12 || nvlSerie == 18 || nvlSerie == 19 || nvlSerie == 21 || nvlSerie == 22
                                || nvlSerie == 23 || nvlSerie == 24 || nvlSerie == 28 || nvlSerie == 31 || nvlSerie == 34
                                || nvlSerie == 36 || nvlSerie == 37 || nvlSerie == 38 || nvlSerie == 46 || nvlSerie == 47
                                || nvlSerie == 48 || nvlSerie == 49) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlSerie == 04 || nvlSerie == 07 || nvlSerie == 16 || nvlSerie == 27 || nvlSerie == 29
                                || nvlSerie == 39 || nvlSerie == 40 || nvlSerie == 42) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParImparActivity.class);
                            jogando = "serie";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }else if (nvlSerie == 05 || nvlSerie == 8 || nvlSerie == 35 || nvlSerie == 43 || nvlSerie == 44) {
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
                        if (nvlAnime == 01 || nvlAnime == 02 || nvlAnime == 05 || nvlAnime == 15 || nvlAnime == 17 || nvlAnime == 20 || nvlAnime == 22 || nvlAnime == 23
                                || nvlAnime == 28 || nvlAnime == 31 || nvlAnime == 33 || nvlAnime == 34 || nvlAnime == 39 || nvlAnime == 43 || nvlAnime == 44
                                || nvlAnime == 48 || nvlAnime == 49) {
                        Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                        jogando = "anime";
                        intent.putExtra("jogando", jogando);
                        startActivity(intent);
                        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                        onPause();
                        }
                        else if (nvlAnime == 03 || nvlAnime == 06 || nvlAnime == 8 || nvlAnime == 12 || nvlAnime == 13 || nvlAnime == 18 || nvlAnime == 19  || nvlAnime == 24
                                || nvlAnime == 26 || nvlAnime == 29 || nvlAnime == 30 || nvlAnime == 32 || nvlAnime == 36 || nvlAnime == 37 || nvlAnime == 38
                                || nvlAnime == 40 || nvlAnime == 42 || nvlAnime == 47 || nvlAnime == 50) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlAnime == 04 || nvlAnime == 07 || nvlAnime == 9 || nvlAnime == 10 || nvlAnime == 25 || nvlAnime == 27 || nvlAnime == 41 || nvlAnime == 45
                                || nvlAnime == 46) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparParActivity.class);
                            jogando = "anime";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        else if (nvlAnime == 11 || nvlAnime == 14 || nvlAnime == 16 || nvlAnime == 21 || nvlAnime == 35) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParImparActivity.class);
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
                        if (nvlGame == 1 || nvlGame == 3 || nvlGame == 4 || nvlGame == 9 || nvlGame == 16 || nvlGame == 17 || nvlGame == 23 || nvlGame ==24 || nvlGame == 25
                                || nvlGame == 27 || nvlGame == 28 || nvlGame == 29 || nvlGame == 30 || nvlGame == 31 || nvlGame == 33 || nvlGame == 35 || nvlGame == 36
                                || nvlGame == 37 || nvlGame == 42 || nvlGame == 43 || nvlGame == 44 || nvlGame == 45 || nvlGame == 46 || nvlGame == 47) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparImparActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        } if (nvlGame == 6 || nvlGame == 8 || nvlGame == 12 || nvlGame == 21 || nvlGame == 48 || nvlGame == 50) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParImparActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        } if (nvlGame == 2 || nvlGame == 5 || nvlGame == 7 || nvlGame == 10  || nvlGame == 14 || nvlGame == 18 || nvlGame == 19 || nvlGame == 20
                                || nvlGame == 26 || nvlGame == 32 || nvlGame == 34 || nvlGame == 38 || nvlGame == 39 || nvlGame == 40 || nvlGame == 41
                                || nvlGame == 49) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoParActivity.class);
                            jogando = "game";
                            intent.putExtra("jogando", jogando);
                            startActivity(intent);
                            overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
                            onPause();
                        }
                        if (nvlGame == 11 || nvlGame == 13 || nvlGame == 15 || nvlGame == 22) {
                            Intent intent = new Intent(CategoriesActivity.this, JogoImparParActivity.class);
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