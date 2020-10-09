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

        buttonEnviar = findViewById(R.id.button_enviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText nome_digitado = (EditText) findViewById(R.id.editTextTextPersonName);
                String nome = nome_digitado.getText().toString();

                EditText email_digitado = (EditText) findViewById(R.id.editTextTextEmailAddress2);
                String email = email_digitado.getText().toString();

                EditText senha_digitada = (EditText) findViewById(R.id.editTextNumber);
                String senha = senha_digitado.getText().toString();

                if (!nome.equals("")  || !email.equals("")|| !senha.equals("")){
                    Intent tela_sucesso = new Intent(Cadastro.this, Sucesso_Cadastro.class);
                    tela_sucesso.putExtra("nome_digitado",nome);
                    startActivity(tela_sucesso);
                }
                else{
                    Intent tela_Erro = new Intent(Cadastro.this, Erro_Cadastro.class);
                    startActivity(tela_Erro);
                }
            }
        });
}