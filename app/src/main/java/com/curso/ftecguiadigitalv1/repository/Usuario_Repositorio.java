package com.curso.ftecguiadigitalv1.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.curso.ftecguiadigitalv1.model.Usuario_model;
import com.curso.ftecguiadigitalv1.uteis.DatabaseUtil;

import java.util.ArrayList;
import java.util.List;

public class Usuario_Repositorio {

    DatabaseUtil databaseUtil;

    public Usuario_Repositorio (Context context){

        databaseUtil =  new DatabaseUtil(context);
    }

    public void Salvar(Usuario_model usuario_model){

        ContentValues contentValues =  new ContentValues();
        /*MONTANDO OS PARAMETROS PARA SEREM SALVOS*/
        contentValues.put("ds_Nome",       usuario_model.getNome());
        contentValues.put("ds_Sobrenome",   usuario_model.getSobrenome());
        contentValues.put("fl_sexo",       usuario_model.getSexo());
        contentValues.put("dt_Email", usuario_model.getEmail());
        contentValues.put("fl_Senha",usuario_model.getSenha());
        contentValues.put("fl_Registro_Ativo", usuario_model.getRegistroAtivo());

        /*EXECUTANDO INSERT DE UM NOVO REGISTRO*/

        databaseUtil.GetConexaoDataBase().insert("tb_usuario",null,contentValues);
    }
    public void Atualizar (Usuario_model usuario_model){

        ContentValues contentValues =  new ContentValues();

        /*MONTA OS PARAMENTROS PARA REALIZAR UPDATE NOS CAMPOS*/
        contentValues.put("ds_Nome",       usuario_model.getNome());
        contentValues.put("ds_Sobrenome",   usuario_model.getSobrenome());
        contentValues.put("fl_sexo",       usuario_model.getSexo());
        contentValues.put("dt_Email", usuario_model.getEmail());
        contentValues.put("fl_Senha",usuario_model.getSenha());
        contentValues.put("fl_Registro_Ativo", usuario_model.getRegistroAtivo());

        /*REALIZANDO UPDATE PELA CHAVE DA TABELA*/
        databaseUtil.GetConexaoDataBase().update("tb_usuario", contentValues, "id_usuario = ?", new String[]{Integer.toString(usuario_model.getCodigo())});
    }


        /*CONSULTA UMA PESSOA CADASTRADA PELO CÓDIGO*/

    public Usuario_model GetPessoa(int codigo){

        Cursor cursor =  databaseUtil.GetConexaoDataBase().rawQuery("SELECT * FROM tb_usuario WHERE id_usuario= "+ codigo,null);

        cursor.moveToFirst();

        ///CRIANDO UMA NOVA PESSOAS

        Usuario_model usuario_model = new Usuario_model();

        //ADICIONANDO OS DADOS DA PESSOA
        usuario_model.setCodigo(cursor.getInt(cursor.getColumnIndex("id_usuario")));
        usuario_model.setNome(cursor.getString(cursor.getColumnIndex("ds_nome")));
        usuario_model.setSobrenome(cursor.getString(cursor.getColumnIndex("ds_sobrenome")));
        usuario_model.setSexo(cursor.getString(cursor.getColumnIndex("fl_sexo")));
        usuario_model.setEmail(cursor.getString(cursor.getColumnIndex("dt_email")));
        usuario_model.setSenha(cursor.getString(cursor.getColumnIndex("fl_senha")));
        usuario_model.setRegistroAtivo((byte)cursor.getShort(cursor.getColumnIndex("fl_ativo")));

        //RETORNANDO A PESSOA
        return usuario_model;

    }
     /*EXCLUI UM REGISTRO PELO CÓDIGO*/

    public Integer Excluir(int codigo){

        //EXCLUINDO  REGISTRO E RETORNANDO O NÚMERO DE LINHAS AFETADAS
        return databaseUtil.GetConexaoDataBase().delete("tb_usuario","id_usuario = ?", new String[]{Integer.toString(codigo)});
    }


    /*CONSULTA TODAS AS PESSOAS CADASTRADAS NA BASE */
    public List<Usuario_model> SelecionarTodos(){

        List<Usuario_model> usuario = new ArrayList<Usuario_model>();


        //MONTA A QUERY A SER EXECUTADA
        StringBuilder stringBuilderQuery = new StringBuilder();
        stringBuilderQuery.append(" SELECT id_usuario,      ");
        stringBuilderQuery.append("        ds_nome,        ");
        stringBuilderQuery.append("        ds_sobrenome,    ");
        stringBuilderQuery.append("        fl_sexo,        ");
        stringBuilderQuery.append("        dt_email,  ");
        stringBuilderQuery.append("        fl_senha, ");
        stringBuilderQuery.append("        fl_registro_ativo    ");
        stringBuilderQuery.append("  FROM  tb_usuario       ");
        stringBuilderQuery.append(" ORDER BY ds_nome       ");


        //CONSULTANDO OS REGISTROS CADASTRADOS
        Cursor cursor = databaseUtil.GetConexaoDataBase().rawQuery(stringBuilderQuery.toString(), null);

        /*POSICIONA O CURSOR NO PRIMEIRO REGISTRO*/
        cursor.moveToFirst();

        Usuario_model usuario_model;

        //REALIZA A LEITURA DOS REGISTROS ENQUANTO NÃO FOR O FIM DO CURSOR
        while (!cursor.isAfterLast()){

            /* CRIANDO UM NOVO USUARIO */
            usuario_model = new Usuario_model();

            //ADICIONANDO OS DADOS DA PESSOA
            usuario_model.setCodigo(cursor.getInt(cursor.getColumnIndex("id_usuario")));
            usuario_model.setNome(cursor.getString(cursor.getColumnIndex("ds_nome")));
            usuario_model.setSobrenome(cursor.getString(cursor.getColumnIndex("ds_sobrenome")));
            usuario_model.setSexo(cursor.getString(cursor.getColumnIndex("fl_sexo")));
            usuario_model.setEmail(cursor.getString(cursor.getColumnIndex("dt_email")));
            usuario_model.setSenha(cursor.getString(cursor.getColumnIndex("fl_senha")));
            usuario_model.setRegistroAtivo((byte)cursor.getShort(cursor.getColumnIndex("fl_registro_ativo")));

            /*ADICIONANDO UMA PESSOA NA LISTA*/
            usuario.add (usuario_model);

            /*VAI PARA O PRÓXIMO REGISTRO*/
            cursor.moveToNext();
        }

        //RETORNANDO A LISTA DE PESSOAS
        return usuario;

    }

}