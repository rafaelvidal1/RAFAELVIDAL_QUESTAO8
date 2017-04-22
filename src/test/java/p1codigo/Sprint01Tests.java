package p1codigo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Test;


public class Sprint01Tests {

	@Test
	public void testInserirUsuario() throws Exception {
		
		Sistema s0 = new Sistema();
		Usuario u0 = new Usuario("nomeTeste",true,0);
		
		assertTrue(s0.Inserir("nomeTeste"));
		assertEquals(s0.BD.get(0).GetNome(), "nomeTeste");
		
		assertTrue(s0.EmprestarLivro("nomeTeste","NomeDoLivro"));
		
	}
	
	@Test
	public void testRemoverUsuario(){
		Sistema s0 = new Sistema();
		Usuario u0 = new Usuario("nomeTeste",true,0);
		
		assertTrue(s0.Inserir("nomeTeste"));
		
		assertTrue(s0.Remover("nomeTeste"));
	}

}
