package com.curso.ftecguiadigitalv1.model;

import android.graphics.Bitmap;

public class Locais_model extends Usuario_model{

    private Double latitude;
    private Double longitude;
    private String descricao;
    private Bitmap foto;

    private Boolean temporaria;  // 0= temporaria  1= permanete

    public Double getLatitude(){return latitude;}

    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude(){return longitude;}

    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public String getdescricao(){return descricao;}

    public void setDescricao(String longitude) { this.descricao = descricao; }

    public Bitmap getFoto () { return foto;}

    public void setFoto(Bitmap foto){this.foto = foto;}

    public Locais_model(Double latitude, Double longitude, String descricao, Bitmap foto){
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.descricao = descricao;
        this.foto = foto;
    }

}
