package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private Button buttonEntrar;
  private TextView textCadastrar;

    String email = "evandro@gmail.com";
    String senha = "12345";
    String emailDigitado;
    String senhaDigitada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();  //Para Esconder a Action Bar

        textCadastrar = findViewById(R.id.tx_cadastrar);
        textCadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AbrirTelaDeCadastro();
            }
        });
    }
    private void AbrirTelaDeCadastro(){
        Intent intent = new Intent(Login.this, CriarConta.class);
        startActivity(intent);
    }

}