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
		
		assertTrue(s0.Add("NomeTeste"));
		
		assertTrue(s0.EmprestarLivro("NomeTeste","NomeDoLivro"));
		
		//when(sMock.Add("nomeTeste")).thenReturn(true);
		
		//assertTrue(sMock.Add("nomeTeste"));
	
		//doThrow(new SQLException()).when(sMock).Persistir(uMock);
		
		//when(sMock.Add(uMock)).thenReturn(false);
		
		//assertFalse(sMock.Add(uMock));
		
		
	}

}
