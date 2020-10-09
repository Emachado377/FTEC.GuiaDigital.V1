package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private Button buttonEnviar;
    String email = "evandro@gmail.com";
    String senha = "12345";
    String emailDigitado;
    String senhaDigitada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonEnviar = findViewById(R.id.button_enviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText email_digitado = (EditText) findViewById(R.id.editTextTextEmailAddress);
                emailDigitado = email_digitado.getText().toString();

                EditText senha_digitada = (EditText) findViewById(R.id.editTextTextPassword);
                senhaDigitada = senha_digitada.getText().toString();

                if (!emailDigitado.equals(email) || !senhaDigitada.equals(senha)){
                    Intent erro_Login = new Intent(Login.this, ErroLogin.class);
                    startActivity(erro_Login);
                }
                else {
                    Intent sucesso_Login = new Intent(Login.this, TelaMapa.class);
                    startActivity(sucesso_Login);
                }

            }
        });
    }
}