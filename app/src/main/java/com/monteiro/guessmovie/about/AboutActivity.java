package com.monteiro.guessmovie.about;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.monteiro.guessmovie.R;
import com.monteiro.guessmovie.slider.WelcomeActivity;

public class AboutActivity extends AppCompatActivity {

    private TextView tutorial;
    private TextView questionary;
    private TextView version;

    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tutorial = (TextView) findViewById(R.id.txv_tutorial);
        questionary = (TextView) findViewById(R.id.txv_questionary);
        version = (TextView) findViewById(R.id.txv_version);

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
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSe0nWosa1WtEonzrnBpkCHy8iDQBH_qzbEXvdxfH_3_4K1ojA/viewform";
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        version.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //usar para reiniciar as preferencias do app
                editor = getSharedPreferences("pref", MODE_PRIVATE).edit();
                editor.putInt("qt_moedas", 100);
                editor.putInt("nvl_filme", 01);
                editor.putInt("nvl_serie", 01);
                editor.putInt("nvl_anime", 01);
                editor.putInt("removeu_filme", 00);
                editor.putInt("removeu_serie", 00);
                editor.putInt("removeu_anime", 00);
                editor.commit();
            }
        });
    }
}
