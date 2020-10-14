package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ErroGravarPosicao extends AppCompatActivity {

    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro_gravar_posicao);

        buttonVoltar = findViewById(R.id.button_voltar1);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela_Gravar_Posicao = new Intent(ErroGravarPosicao.this, GravarPosicao.class);
                startActivity(tela_Gravar_Posicao);
            }
        });
    }
}