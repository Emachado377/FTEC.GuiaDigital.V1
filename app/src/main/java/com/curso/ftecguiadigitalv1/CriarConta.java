package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CriarConta extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        buttonEnviar = findViewById(R.id.salvar_sair);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText nome_digitado = (EditText) findViewById(R.id.editTextTextPersonName);
                String nome = nome_digitado.getText().toString();

                EditText email_digitado = (EditText) findViewById(R.id.idmail);
                String email = email_digitado.getText().toString();

                EditText senha_digitada = (EditText) findViewById(R.id.senha);
                String senha = senha_digitada.getText().toString();

                if (!nome.equals("") && !email.equals("") && !senha.equals("")) {
                    Intent tela_sucesso = new Intent(CriarConta.this, SucessoCriaConta.class);
                    tela_sucesso.putExtra("nome_digitado", nome);
                    //System.out.print(nome);
                    startActivity(tela_sucesso);

                } else {
                    Intent tela_Erro = new Intent(CriarConta.this, ErroCriarConta.class);
                    startActivity(tela_Erro);
                }
            }
        });
    }
}