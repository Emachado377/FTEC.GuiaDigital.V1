package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMapa extends AppCompatActivity {

    private Button Percurso;
    private Button GravarPosicao;
    private Button Configurar;
    private Button Sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_mapa);

        Percurso = findViewById(R.id.Percurso);
        GravarPosicao = findViewById(R.id.Gravar);
        Configurar = findViewById(R.id.Configurar);
        Sair = findViewById(R.id.button_Sair);

        Percurso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percurso = new Intent(TelaMapa.this, PercursoPlanejado.class);
                startActivity(tela_Percurso);
            }
        });

        GravarPosicao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percurso = new Intent(TelaMapa.this, GravarPosicao.class);
                startActivity(tela_Percurso);
            }
        });

        Configurar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percurso = new Intent(TelaMapa.this, ConfigurarPerfil.class);
                startActivity(tela_Percurso);
            }
        });

        Sair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Inicial = new Intent(TelaMapa.this, MainActivity.class);
                startActivity(tela_Inicial);
            }
        });
    }
}