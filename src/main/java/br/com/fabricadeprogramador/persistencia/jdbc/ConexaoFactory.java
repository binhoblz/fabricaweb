package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
	
	public static Connection getConnection(){
		try {
			
			return DriverManager .getConnection("jdbc:postgresql://localhost:5432/fabricaweb","postgres","123456");
			
		} catch (Exception ex) {
			// Embrulhando a Exception SQLException em uma RuntimeException para a classe que a conexao não ficar dependente do JDBC
			throw new RuntimeException("Não conectou com o banco!",ex);
		}
		
		
	}

}
