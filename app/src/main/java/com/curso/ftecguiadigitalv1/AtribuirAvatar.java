package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AtribuirAvatar extends AppCompatActivity {

    private Button Salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atribuir_avatar);

        Salvar = findViewById(R.id.salvar_sair);

        Salvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Configurar = new Intent(AtribuirAvatar.this, ConfigurarConta.class);
                startActivity(tela_Configurar);
            }
        });
    }
}