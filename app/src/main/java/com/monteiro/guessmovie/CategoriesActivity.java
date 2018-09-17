package com.monteiro.guessmovie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    //private ImageView bt_filme;
    private ImageView iv_start;
    private ListView lista;
    private List<Category> listas;
    private CategoryAdapter adapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.list_category);
        setContentView(R.layout.activity_categories);

        //bt_filme = (ImageView) findViewById(R.id.bt_filme);
        //iv_start = (ImageView) findViewById(R.id.image_start);
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
                intent = new Intent(CategoriesActivity.this, FilmeActivity.class);
                startActivity( intent );
            }
        });*/

        /*iv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(CategoriesActivity.this, FilmeActivity.class);
                startActivity( intent );
            }
        });*/

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    Intent intent = new Intent(CategoriesActivity.this, FilmeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private List<Category> todasCategorias() {
        return new ArrayList<>(Arrays.asList(
                new Category("FILMES", R.drawable.cat01),
                new Category("SÉRIES", R.drawable.cat02),
                new Category("ANIMES", R.drawable.cat03)
        ));
    }
}