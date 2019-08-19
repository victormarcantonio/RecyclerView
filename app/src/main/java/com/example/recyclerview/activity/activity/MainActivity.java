package com.example.recyclerview.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //Configurar Adapter
        Adapter adapter = new Adapter(listaFilmes);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){

        Filme filme = new Filme ("Homem-Aranha","Aventura","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Mulher maravilha","Fantasia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Liga da Justiça","Ficção","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Capitão América - Guerra Civil","Aventura/Ficcão","2016");
        this.listaFilmes.add(filme);

        filme = new Filme ("It: A Coisa","Drama/Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Pica-Pau","Comédia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("A Múmia","Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("A Bela e Fera","Romance","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Meu Malvado Favorito 3","Comédia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme ("Carros","Animação","2017");
        this.listaFilmes.add(filme);
    }
}
