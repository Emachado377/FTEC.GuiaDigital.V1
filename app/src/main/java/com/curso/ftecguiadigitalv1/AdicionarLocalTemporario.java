package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarLocalTemporario extends AppCompatActivity {

    private Button Gravar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_local_temporario);

        Gravar = findViewById(R.id.button_IR);

        Gravar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Local_Temp = new Intent(AdicionarLocalTemporario.this, LocalTemporario.class);
                startActivity(tela_Local_Temp);
            }
        });
    }
}