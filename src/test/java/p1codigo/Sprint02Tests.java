package p1codigo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sprint02Tests {

	@Test
	public void testRegistrarEmprestimoLivro() {
		Sistema s0 = new Sistema();
		Usuario u0 = new Usuario("nomeTeste",true,0);
		
		s0.Inserir("nomeUsuarioTeste");
		
		s0.RegistrarEmprestimo("nomeLivroTeste","nomeUsuarioTeste");
		
		assertEquals("Emprestado", s0.BDLivros.get(0).GetStatus());
	}

}
