package com.monteiro.guessmovie.about;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.monteiro.guessmovie.R;
import com.monteiro.guessmovie.repositorio.DbHelper;
import com.monteiro.guessmovie.repositorio.PostConfig;
import com.monteiro.guessmovie.slider.WelcomeActivity;

public class AboutActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView tutorial;
    private TextView questionary;
    private TextView version;

    SharedPreferences.Editor editor;
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
        setContentView(R.layout.activity_about);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        dbHelper = new DbHelper(getBaseContext());
        tutorial = (TextView) findViewById(R.id.txv_tutorial);
        questionary = (TextView) findViewById(R.id.txv_questionary);
        version = (TextView) findViewById(R.id.txv_version);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("INFORMAÇÃO");
        setSupportActionBar(toolbar);

        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor = getSharedPreferences("pref", MODE_PRIVATE).edit();
                editor.putBoolean("ja_acessou", false);
                editor.commit();

                Intent intent;
                intent = new Intent(AboutActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });

        questionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://bit.ly/2CKDIxc";
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        version.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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

                //usar para reiniciar as preferencias do app
                editor = getSharedPreferences("pref", MODE_PRIVATE).edit();
                editor.putInt("qt_moedas", valorMoedas);
                editor.putInt("nvl_filme", 01);
                editor.putInt("nvl_serie", 01);
                editor.putInt("nvl_anime", 01);
                editor.putInt("nvl_game", 01);
                editor.putInt("removeu_filme", 00);
                editor.putInt("removeu_serie", 00);
                editor.putInt("removeu_anime", 00);
                editor.putInt("removeu_game", 00);
                editor.putBoolean("ja_avaliou", false);
                editor.commit();
            }
        });
    }

    @Override
    protected void onStart() {
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
    }
}
