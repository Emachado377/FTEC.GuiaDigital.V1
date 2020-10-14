package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeusAmigos extends AppCompatActivity {

    private Button Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_amigos);

        Voltar = findViewById(R.id.button_voltar1);

        Voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percursos = new Intent(MeusAmigos.this, PercursoPlanejado.class);
                startActivity(tela_Percursos);
            }
        });
    }
}