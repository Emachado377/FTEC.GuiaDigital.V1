package com.curso.ftecguiadigitalv1.model;

import android.graphics.Bitmap;
import android.provider.ContactsContract;

public class Usuario_model {
    private Integer codigo;
    private String nome;
    private String sobrenome;
    private String sexo;
    private String email;
    private String senha;
    private byte registroAtivo;

    public Usuario_model() {

    }
    public Usuario_model (Integer codigo, String nome, String sobrenome, String sexo, String email, String senha, byte registroAtivo){
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo =sexo;
        this.email = email;
        this.senha = senha;
        this.registroAtivo = registroAtivo;
    }

    public Integer getCodigo () { return codigo;}

    public void setCodigo (Integer codigo){ this.codigo = codigo;}

    public String getNome () { return nome;}

    public void setNome (String nome){ this.nome = nome;}

    public String getSobrenome () { return sobrenome;}

    public void setSobrenome (String sobrenome){ this.sobrenome = sobrenome;}

    public String getSexo () { return sexo;}

    public void setSexo (String sexo){ this.sexo = sexo;}

    public String getEmail () { return email;}

    public void setEmail (String email){ this.email = email;}

    public String getSenha () { return senha;}

    public void setSenha (String senha){ this.email = senha;}

    public byte getRegistroAtivo() { return registroAtivo;}

    public void setRegistroAtivo(byte registroAtivo) { this.registroAtivo = registroAtivo; }

}

