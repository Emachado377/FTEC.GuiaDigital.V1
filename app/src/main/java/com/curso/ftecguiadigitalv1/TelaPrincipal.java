package com.curso.ftecguiadigitalv1;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TelaPrincipal extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button Percurso;
    private Button GravarPosicao;
    private Button Configurar;
    private Button Sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        Percurso = findViewById(R.id.Percurso);
        GravarPosicao = findViewById(R.id.Gravar);
        Configurar = findViewById(R.id.Configurar);
        Sair = findViewById(R.id.button_Sair);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-29.1678, -51.1794);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

}

/*

        Percurso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percurso = new Intent(TelaPrincipal.this, PercursoPlanejado.class);
                startActivity(tela_Percurso);
            }
        });

        GravarPosicao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percurso = new Intent(TelaPrincipal.this, GravarPosicao.class);
                startActivity(tela_Percurso);
            }
        });

        Configurar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Percurso = new Intent(TelaPrincipal.this, ConfigurarPerfil.class);
                startActivity(tela_Percurso);
            }
        });

        Sair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tela_Inicial = new Intent(TelaPrincipal.this, MainActivity.class);
                startActivity(tela_Inicial);
            }
        });

 */