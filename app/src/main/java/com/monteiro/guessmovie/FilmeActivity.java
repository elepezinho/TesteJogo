package com.monteiro.guessmovie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FilmeActivity extends AppCompatActivity {

    private Button bt_letterb;
    private Button bt_lettera;
    private Button bt_lettera1;
    private Button bt_lettert;
    private Button bt_letterm;
    private Button bt_lettern;
    private Button bt_letterd;
    private Button bt_letterl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme);

        bt_letterb = (Button) findViewById(R.id.bt_b);
        bt_lettera = (Button) findViewById(R.id.bt_a);
        bt_lettera1 = (Button) findViewById(R.id.bt_ba);
        bt_lettert = (Button) findViewById(R.id.bt_t);
        bt_letterm = (Button) findViewById(R.id.bt_m);
        bt_lettern = (Button) findViewById(R.id.bt_n);
        bt_letterd = (Button) findViewById(R.id.bt_d);
        bt_letterl = (Button) findViewById(R.id.bt_l);

        bt_lettern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(FilmeActivity.this, CheckAnswer.class);
                startActivity( intent );
            }
        });

        bt_lettera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lettera.setVisibility(View.INVISIBLE);
            }
        });

        bt_lettera1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lettera1.setVisibility(View.INVISIBLE);
            }
        });

        bt_lettert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lettert.setVisibility(View.INVISIBLE);
            }
        });

        bt_letterm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_letterm.setVisibility(View.INVISIBLE);
            }
        });

        bt_letterb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_letterb.setVisibility(View.INVISIBLE);
            }
        });

        bt_letterd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_letterd.setVisibility(View.INVISIBLE);
            }
        });

        bt_letterl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_letterl.setVisibility(View.INVISIBLE);
            }
        });
    }
}