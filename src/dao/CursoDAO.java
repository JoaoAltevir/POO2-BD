package dao;

import entities.Curso;
import java.sql.*;
import java.util.List;
import java.io.*;

public class CursoDAO {
	
	private Connection conn;

	public CursoDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public int cadastrar(Curso curso) throws SQLException{
		
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("insert into curso(Nome, Periodo, Duracao) values (? , ?, ?)");
			
			st.setString(1, curso.getNome());
			st.setString(2, curso.getPeriodo());
			st.setInt(3, curso.getDuracao());
			
			return st.executeUpdate();
		}finally {
			
			BancoDados.finalizarStatement(st);
			BancoDados.desconectar();
		}
	}
	
	public List<Curso> buscarTodos() throws SQLException{
		
		return null;
	}
	
	public Curso buscarPorCodigo(int codigo) throws SQLException{
		
		return null;
	}
	
	public int atualizar(Curso curso) throws SQLException{
		
		return 0;
	}
	
	public int excluir(int codigo) throws SQLException{
		return 0;
	}
}
