package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocalTemporario extends AppCompatActivity {

    private Button button_Iniciar;
    private Button button_Adicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_temporario);

        button_Iniciar = findViewById(R.id.button_IR);
        button_Adicionar = findViewById(R.id.button_adicionar);

        button_Iniciar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Mapa = new Intent(LocalTemporario.this, TelaMapa.class);
                startActivity(tela_Mapa);
            }
        });
        button_Adicionar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Adicionar = new Intent(LocalTemporario.this, GravarPosicao.class);
                startActivity(tela_Adicionar);
            }
        });


    }
}