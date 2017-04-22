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
		
		Sistema s0 = mock(Sistema.class);
		Usuario u0 = new Usuario("nomeTeste",true,0);
		
		when(s0.Inserir("nomeTeste")).thenReturn(true);
		
		assertTrue(s0.Inserir("nomeTeste"));
		
		when(s0.ProcurarBD("nomeTeste")).thenReturn(u0);
		
		when(s0.EmprestarLivro("nomeTeste","NomeDoLivro")).thenReturn(true);
		
		assertTrue(s0.EmprestarLivro("nomeTeste","NomeDoLivro"));
		
	}
	
	

}
