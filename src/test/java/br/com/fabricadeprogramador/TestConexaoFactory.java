package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestConexaoFactory {

	public static void main(String[] args) {
		
		//testCadastrar();
		//testAlterar();
		  testExcluir();
	
	}

	public static void testCadastrar(){
		
		//Criando um usuario
	    Usuario usu = new Usuario();
		//usuario.setId(01);
		usu.setLogin("soares");
		usu.setNome("benedito8");
		usu.setSenha("123");
				
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		System.out.println("Cadastrado com Sucesso!");
				
		
	}
	
	public static void testAlterar(){
		
		//Criando um usuario
	    Usuario usuAlt = new Usuario();
	    usuAlt.setId(01);
	    usuAlt.setLogin("soares");
	    usuAlt.setNome("benedito8");
	    usuAlt.setSenha("123");
				
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usuAlt);
		System.out.println("Alterado Com Sucesso!!!");
		
	}
	
	public static void testExcluir(){
		
		//Criando um usuario
	    Usuario usuExc = new Usuario();
	    usuExc.setId(6);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usuExc);
		System.out.println("Excluido com Sucesso!");
	}
}
