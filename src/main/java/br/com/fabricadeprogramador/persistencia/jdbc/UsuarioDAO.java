package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.jdbc.*;
import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class UsuarioDAO {

	private Connection con= ConexaoFactory .getConnection();
	
	public void cadastrar(Usuario usu) {
		
		String sql = "insert into usuario (nome, login,senha) values (?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			
			//Execultando comando SQL no banco de dados
			preparador.execute();
			//Fechando objeto preparador
			preparador.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public void alterar(Usuario usu){
		String sql = "update usuario set nome=?, login=?, senha=md5(?) where id=?";
		
		try (PreparedStatement preparador = con.prepareStatement(sql))
		{
			
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4,usu.getId());
			
			preparador.execute();
			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void excluir(Usuario usu){
		String sql = "delete from usuario where id=?";
		
		try (PreparedStatement preparador = con.prepareStatement(sql))
		{

			preparador.setInt(1,usu.getId());
			
			preparador.execute();
			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void buscarPorId(){
		// Objeto de retorno do método
		Usuario usuRetorno = null;
		
		String sql = "select * from usuario where id=?";
		
		try(PreparedStatement preparador = con.prepareStatement(sql))
		{
			
			preparador.setInt(1, id);
			// Retorno da consulta em resultSet
			ResultSet resultado = preparador.executeQuery();
			
			//se tem registro
			fi(resulta)
		}
	}

}
