package p1codigo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sprint03Tests {

	@Test
	public void testUsuarioAcessarSistema() {
		Sistema s0 = new Sistema();
		Usuario u0 = new Usuario("nomeUsuarioTeste",true,0);
		Livro l0 = new Livro("nomeLivroTeste","disponível");
		Usuario uRetorno;
		//Livro adicionado ao "BD" manualmente
		s0.BDLivros.add(l0);
		
		s0.Inserir("nomeUsuarioTeste");
		
		uRetorno = s0.ProcurarBD("nomeUsuarioTeste");
		
		assertEquals("nomeUsuarioTeste", uRetorno.GetNome());
		assertTrue(uRetorno.GetStatus());
		assertEquals(0,uRetorno.GetTempoBan());
		
		s0.BanUsuario("nomeUsuarioTeste", 2);
		
		uRetorno = s0.ProcurarBD("nomeUsuarioTeste");
		assertEquals(2,uRetorno.GetTempoBan());
		
	}

}
