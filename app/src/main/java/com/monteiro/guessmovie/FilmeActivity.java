package com.monteiro.guessmovie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FilmeActivity extends AppCompatActivity {

    //botões da letra escolhida pelo usuário
    private Button bt_lt1;
    private Button bt_lt2;
    private Button bt_lt3;
    private Button bt_lt4;
    private Button bt_lt5;
    private Button bt_lt6;

    //botões das letras sortiadas
    private Button bt_letterb;
    private Button bt_lettera;
    private Button bt_lettera1;
    private Button bt_lettert;
    private Button bt_letterm;
    private Button bt_lettern;
    private Button bt_letterd;
    private Button bt_letterl;

    //controle da letra que está na resposta
    private String lt1_resposta;
    private String lt2_resposta;
    private String lt3_resposta;
    private String lt4_resposta;
    private String lt5_resposta;
    private String lt6_resposta;

    private Toolbar toolbar;

    private String[] resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("FILMES");
        setSupportActionBar(toolbar);

        resposta = new String[6];

        //botões de escolha do usuário
        bt_lt1 = (Button) findViewById(R.id.bt_lt1);
        bt_lt2 = (Button) findViewById(R.id.bt_lt2);
        bt_lt3 = (Button) findViewById(R.id.bt_lt3);
        bt_lt4 = (Button) findViewById(R.id.bt_lt4);
        bt_lt5 = (Button) findViewById(R.id.bt_lt5);
        bt_lt6 = (Button) findViewById(R.id.bt_lt6);

        //botões das letras
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
                if(verificarEspacoBranco()) {
                    bt_lettern.setVisibility(View.INVISIBLE);
                    inserirLetra("N", "lettern");
                }
            }
        });

        bt_lettera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lettera.setVisibility(View.INVISIBLE);
                    inserirLetra("A", "lettera");
                }
            }
        });

        bt_lettera1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lettera1.setVisibility(View.INVISIBLE);
                    inserirLetra("A", "lettera1");
                }
            }
        });

        bt_lettert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_lettert.setVisibility(View.INVISIBLE);
                    inserirLetra("T", "lettert");
                }
            }
        });

        bt_letterm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_letterm.setVisibility(View.INVISIBLE);
                    inserirLetra("M", "letterm");
                }
            }
        });

        bt_letterb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_letterb.setVisibility(View.INVISIBLE);
                    inserirLetra("B", "letterb");
                }
            }
        });

        bt_letterd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_letterd.setVisibility(View.INVISIBLE);
                    inserirLetra("D", "letterd");
                }
            }
        });

        bt_letterl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verificarEspacoBranco()) {
                    bt_letterl.setVisibility(View.INVISIBLE);
                    inserirLetra("L", "letterl");
                }
            }
        });

        bt_lt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lt1.setText("");
                removerLetra(lt1_resposta);
                resposta[0] = null;
            }
        });

        bt_lt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lt2.setText("");
                removerLetra(lt2_resposta);
                resposta[1] = null;
            }
        });

        bt_lt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lt3.setText("");
                removerLetra(lt3_resposta);
                resposta[2] = null;
            }
        });
        bt_lt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lt4.setText("");
                removerLetra(lt4_resposta);
                resposta[3] = null;
            }
        });
        bt_lt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lt5.setText("");
                removerLetra(lt5_resposta);
                resposta[4] = null;
            }
        });
        bt_lt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_lt6.setText("");
                removerLetra(lt6_resposta);
                resposta[5] = null;
            }
        });
    }

    public void inserirLetra(String letra, String lt_resposta){
        if(resposta[0]==null) {
            resposta[0] = letra;
            bt_lt1.setText(letra);
            lt1_resposta = lt_resposta;
            verificarResposta();
        }
        else if (resposta[1]==null) {
            resposta[1] = letra;
            bt_lt2.setText(letra);
            lt2_resposta = lt_resposta;
            verificarResposta();
        }
        else if (resposta[2]==null) {
            resposta[2] = letra;
            bt_lt3.setText(letra);
            lt3_resposta = lt_resposta;
            verificarResposta();
        }
        else if (resposta[3]==null) {
            resposta[3] = letra;
            bt_lt4.setText(letra);
            lt4_resposta = lt_resposta;
            verificarResposta();
        }
        else if (resposta[4]==null) {
            resposta[4] = letra;
            bt_lt5.setText(letra);
            lt5_resposta = lt_resposta;
            verificarResposta();
        }
        else if (resposta[5]==null) {
            resposta[5] = letra;
            bt_lt6.setText(letra);
            lt6_resposta = lt_resposta;
            verificarResposta();
        }
    }

    private void removerLetra(String lt_resposta) {
        if(lt_resposta=="lettera"){
            bt_lettera.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lettera1"){
            bt_lettera1.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="letterb"){
            bt_letterb.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="letterd"){
            bt_letterd.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="letterl"){
            bt_letterl.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="letterm"){
            bt_letterm.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lettern"){
            bt_lettern.setVisibility(View.VISIBLE);
        }
        else if(lt_resposta=="lettert"){
            bt_lettert.setVisibility(View.VISIBLE);
        }
    }

    private void verificarResposta(){
        if(resposta[0] == "B" &&
                resposta[1] == "A" &&
                resposta[2] == "T" &&
                resposta[3] == "M" &&
                resposta[4] == "A" &&
                resposta[5] == "N"){

            Intent intent;
            intent = new Intent(FilmeActivity.this, CheckAnswer.class);
            startActivity( intent );
        }
    }

    //verifica se existe campo em branco para colocar a letra
    private boolean verificarEspacoBranco() {
        if (resposta[0] == null ||
                resposta[1] == null ||
                resposta[2] == null ||
                resposta[3] == null ||
                resposta[4] == null ||
                resposta[5] == null) {

            return true;

        }

        return false;
    }
}