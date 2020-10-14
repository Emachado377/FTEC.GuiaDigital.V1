package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GravarPosicao extends AppCompatActivity {

    private Button Gravar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gravar_posicao);

        Gravar = findViewById(R.id.button_Gravar);

        Gravar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                EditText nome_digitado = (EditText) findViewById(R.id.nome_posicao);
                String nome = nome_digitado.getText().toString();

                EditText descricao_digitada = (EditText) findViewById(R.id.descricao_posicao);
                String descricao = descricao_digitada.getText().toString();

                if (!nome.equals("")  && !descricao.equals("") ){
                    Intent tela_Mapa = new Intent(GravarPosicao.this, TelaMapa.class);
                    startActivity(tela_Mapa);
                }
                else{

                    Intent tela_Erro = new Intent(GravarPosicao.this, ErroGravarPosicao.class);
                    startActivity(tela_Erro);
                }
            }
        });

    }
}