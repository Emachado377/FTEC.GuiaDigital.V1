package com.curso.ftecguiadigitalv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sobre extends AppCompatActivity {

    private Button tela_Inicial;
    private Button button_ftec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        tela_Inicial = findViewById(R.id.tela_inicial);
        button_ftec = findViewById(R.id.button_ftec);

        tela_Inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela_Inicial = new Intent(Sobre.this, TelaMapa.class);
                startActivity(tela_Inicial);
            }
        });

        button_ftec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Button campoEndereco = (Button) findViewById(R.id.button_ftec);

                String ftec = campoEndereco.getText().toString();

                Intent pagina = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br/portal-academico"));
                startActivity(pagina);
            }
        });
    }
}