package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button bt_start;
    private ImageView img_sound;

    //Usar para reiniciar as preferencias do app
    SharedPreferences.Editor editor;

    SharedPreferences pref;

    private Boolean jaAcessou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //usar para reiniciar as preferencias do app
        //editor = getSharedPreferences("pref", MODE_PRIVATE).edit();
        //editor.putInt("qt_moedas", 500);
        //editor.putInt("nvl_filme", 01);
        //editor.putInt("nvl_anime", 01);
        //editor.commit();

        pref = getSharedPreferences("pref", MODE_PRIVATE);
        jaAcessou = pref.getBoolean("ja_acessou", false);

        bt_start = (Button) findViewById(R.id.bt_start);
        img_sound = (ImageView) findViewById(R.id.img_sound);

        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(intent);
            }
        });

        img_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}