package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigurarPerfil extends AppCompatActivity {

    private Button button_Conta;
    private Button button_Sobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_perfil);

        button_Conta = findViewById(R.id.button_Conta);
        button_Sobre = findViewById(R.id.button_Sobre);

        button_Conta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Conta = new Intent(ConfigurarPerfil.this, ConfigurarConta.class);
                startActivity(tela_Conta);
            }
        });

        button_Sobre.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Conta = new Intent(ConfigurarPerfil.this, Sobre.class);
                startActivity(tela_Conta);
            }
        });

    }
}