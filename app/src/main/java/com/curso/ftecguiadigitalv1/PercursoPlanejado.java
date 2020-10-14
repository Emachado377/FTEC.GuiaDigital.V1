package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PercursoPlanejado extends AppCompatActivity {

    private ImageButton Meus_Amigos;
    private ImageButton Meus_Locais;
    private ImageButton Locais_Temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percurso_planejado);

        Meus_Amigos = findViewById(R.id.imageButton);
        Meus_Locais = findViewById(R.id.imageButton2);
        Locais_Temp = findViewById(R.id.imageButton3);

        Meus_Amigos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Tela_Meus_Amigos = new Intent(PercursoPlanejado.this, MeusAmigos.class);
                startActivity(Tela_Meus_Amigos);
            }
        });

        Meus_Locais.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Tela_Favoritos = new Intent(PercursoPlanejado.this, Favoritos.class);
                startActivity(Tela_Favoritos);
            }
        });

        Locais_Temp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Tela_Notificacao = new Intent(PercursoPlanejado.this, LocalTemporario.class);
                startActivity(Tela_Notificacao);
            }
        });
    }
}