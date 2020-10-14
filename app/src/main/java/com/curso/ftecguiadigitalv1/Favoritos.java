package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Favoritos extends AppCompatActivity {

    private Button Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Voltar = findViewById(R.id.button_voltar1);

        Voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percursos = new Intent(Favoritos.this, PercursoPlanejado.class);
                startActivity(tela_Percursos);
            }
        });

    }
}