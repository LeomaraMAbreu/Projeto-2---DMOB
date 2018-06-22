package com.example.leomara.projetomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Botão para abrir a calculadora */

        Button calcular = (Button) findViewById(R.id.bt_calculadora);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiCalculadora = new Intent(MainActivity.this, CalculadoraActivity.class);
                startActivity(intentVaiCalculadora);
            }
        });

        /*Botão para abrir o Navegador*/
        Button navegador = (Button) findViewById(R.id.bt_navegador);
        navegador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentVaiNavegador = new Intent(MainActivity.this, Navegador.class);
                startActivity(intentVaiNavegador);
            }
        });

        /*Botão para abrir mapa com a localização atual*/
        Button mapa = (Button) findViewById(R.id.bt_localizacao);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentVaiMapa = new Intent(MainActivity.this, MapaActivity.class);
                startActivity(intentVaiMapa);
            }
        });

        /*Botão para abrir a Agenda Telefônica*/
        Button agendatel = (Button) findViewById(R.id.bt_agenda);
        agendatel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentVaiAgenda = new Intent(MainActivity.this, ListaTelefonica.class);
                startActivity(intentVaiAgenda);
            }
        });


    }
}
