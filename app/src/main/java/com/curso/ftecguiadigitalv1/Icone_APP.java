package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Icone_APP extends AppCompatActivity {

    private ImageView imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icone__a_p_p);

        getSupportActionBar().hide(); // Esconder a Action Bar
        imagem = findViewById(R.id.icone);
        imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirTelaLogin();
            }
        });
    }
    private void AbrirTelaLogin(){
        Intent intent = new Intent (this, Login.class);
        startActivity(intent);

    }

}