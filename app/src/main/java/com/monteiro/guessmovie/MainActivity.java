package com.monteiro.guessmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.monteiro.guessmovie.about.AboutActivity;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button bt_start;
    private ImageView img_star;
    private ImageView img_info;

    //Usar para reiniciar as preferencias do app
    SharedPreferences.Editor editor;

    SharedPreferences pref;

    private Boolean jaAcessou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = getSharedPreferences("pref", MODE_PRIVATE);
        jaAcessou = pref.getBoolean("ja_acessou", false);

        bt_start = (Button) findViewById(R.id.bt_start);
        img_star = (ImageView) findViewById(R.id.img_star);
        img_info = (ImageView) findViewById(R.id.img_info);

        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            }
        });

        /*img_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/";
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });*/

        img_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            }
        });
    }
}