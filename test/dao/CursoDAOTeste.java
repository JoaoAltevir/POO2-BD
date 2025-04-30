package dao;

import entities.Curso;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class CursoDAOTeste {
	
	@Test
	void cadastrarCursoTeste() throws SQLException, IOException{
		
		Curso curso = new Curso();
		curso.setNome("ADS");
		curso.setPeriodo("Noturno");
		curso.setDuracao(6);
		
		Connection conn = BancoDados.conectar();
		int resultado = new CursoDAO(conn).cadastrar(curso);
		
		assertEquals(1, resultado);
	}
}
