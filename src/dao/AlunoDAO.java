package dao;

import java.sql.*;
import java.util.List;

import entities.Aluno;

public class AlunoDAO {
	
	private Connection conn;

	public AlunoDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public int cadastrar(Aluno aluno) throws SQLException{
		
		return 0;
	}
	
	public List<Aluno> buscarTodos()throws SQLException{
		
		return null;
	}
	
	public Aluno buscarPorRA(int ra) throws SQLException{
		
		return null;
	}
	
	public int atualziar(Aluno aluno) throws SQLException{
		
		return 0;
	}
	
	public int exluir(int ra) throws SQLException{
		
		return 0;
	}

}
