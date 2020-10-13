package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ErroCriarConta extends AppCompatActivity {

    private Button buttonVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro_criar_conta);
        buttonVoltar = findViewById(R.id.button_iniciar);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela_Criar_Conta = new Intent(ErroCriarConta.this, CriarConta.class);
                startActivity(tela_Criar_Conta);
            }
        });
    }
}