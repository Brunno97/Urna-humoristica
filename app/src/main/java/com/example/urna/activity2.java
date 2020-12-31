package com.example.urna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {

    public ListView lista;

    static final String[] meuVetor = new String[] {
            "", "Rusbe: 01", "Carl Johnson: 92",
            "Pai de Familia: 24", "JRGAMESX: 11"

    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        // criação do Adapter
        ArrayAdapter<String> meuAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, meuVetor
        );

        // recupera a ListView na View
        lista = (ListView) findViewById(R.id.lista);



        // atribuindo o meuAdapter à lista (ListView)

        lista.setAdapter(meuAdapter);


        // criando uma ação: click
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long l) {
                // armazenar o valor do item selecionado
                String itemSelecionado = (String) lista.getItemAtPosition(posicao);

                // monta uma String para exibir na tela
                String saida = "Nome: " + itemSelecionado + "\nPosição na lista: " + posicao;

                // preparar uma mensagem na tela com o objeto TOAST
                Toast.makeText(getApplicationContext(), saida, Toast.LENGTH_LONG).show();
            }
        });

        Button voltar = findViewById(R.id.btnVoltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(activity2.this, MainActivity.class);

                startActivity(it);
            }
        });


    }
}