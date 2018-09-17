package com.monteiro.guessmovie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CheckAnswer extends AppCompatActivity {

    private Button bt_inicio;
    private Button bt_proximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);

        bt_inicio = (Button) findViewById(R.id.bt_inicio);
        bt_proximo = (Button) findViewById(R.id.bt_proximo);

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
                Intent intent;
                intent = new Intent(CheckAnswer.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
