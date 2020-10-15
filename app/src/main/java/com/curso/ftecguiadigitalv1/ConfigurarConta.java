package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigurarConta extends AppCompatActivity {

    private Button Salvar;
    private Button Avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_conta);

        Salvar = findViewById(R.id.salvar_sair);
        Avatar = findViewById(R.id.button_avatar);

        Avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela_Avatar = new Intent(ConfigurarConta.this, AtribuirAvatar.class);
                startActivity(tela_Avatar);
            }
        });

        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela_1 = new Intent(ConfigurarConta.this, TelaMapa.class);
                startActivity(tela_1);
            }
        });

    }
}


