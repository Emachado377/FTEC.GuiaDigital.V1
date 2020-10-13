package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SucessoCriaConta extends AppCompatActivity {

    private Button buttonIniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_cria_conta);

        TextView textResultado = (TextView) findViewById(R.id.textResultado);

        Intent telaNome = getIntent();
        String nome = telaNome.getStringExtra("nome_digitado");
        textResultado.setText(nome);
        textResultado.setTextColor(Color.parseColor("#0000FF"));
        textResultado.setTextSize(20);

        buttonIniciar = findViewById(R.id.button_iniciar);

        buttonIniciar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Mapa = new Intent(SucessoCriaConta.this, TelaMapa.class);
                startActivity(tela_Mapa);
            }
        });
    }
}