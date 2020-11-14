package com.curso.ftecguiadigitalv1.uteis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseUtil extends SQLiteOpenHelper {

    //NOME DA BASE DE DADOS
    private static final String NOME_BASE_DE_DADOS = "BD_GUIA_DIGITAL.db";

    //VERSÃO DO BANCO DE DADOS
    private static final int VERSAO_BASE_DE_DADOS = 1;

    //CONSTRUTOR
    public DatabaseUtil(Context context) {

        super(context, NOME_BASE_DE_DADOS, null, VERSAO_BASE_DE_DADOS);
    }

    public void onCreate(SQLiteDatabase db) {

        StringBuilder stringBuilderCreateTable = new StringBuilder();

        stringBuilderCreateTable.append(" CREATE TABLE tb_usuario (");
        stringBuilderCreateTable.append("        id_Usuario      INTEGER PRIMARY KEY AUTOINCREMENT, ");
        stringBuilderCreateTable.append("        ds_nome         TEXT    NOT NULL,            ");
        stringBuilderCreateTable.append("        ds_sobrenome    TEXT    NOT NULL,            ");
        stringBuilderCreateTable.append("        fl_sexo         TEXT    NOT NULL,            ");
        stringBuilderCreateTable.append("        ds_email        TEXT    NOT NULL,            ");
        stringBuilderCreateTable.append("        fl_registroAtivo INT     NOT NULL )          ");

        db.execSQL(stringBuilderCreateTable.toString());
    }
    /*SE TROCAR A VERSÃO DO BANCO DE DADOS VOCÊ PODE EXECUTAR ALGUMA ROTINA
     COMO CRIAR COLUNAS, EXCLUIR ENTRE OUTRAS */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS tb_pessoa");
        onCreate(db);

    }

    /*MÉTODO QUE VAMOS USAR NA CLASSE QUE VAI EXECUTAR AS ROTINAS NO
    BANCO DE DADOS*/
    public SQLiteDatabase GetConexaoDataBase(){

        return this.getWritableDatabase();
    }

}
