package p1codigo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sprint04Tests {

	@Test
	public void testLivrosRetiradosComSitua��o() {
		Sistema s0 = new Sistema();
		Usuario u0 = new Usuario("nomeUsuarioTeste",true,0);
		Livro l0 = new Livro("nomeLivroTeste0","dispon�vel");
		Livro l1 = new Livro("nomeLivroTeste1","dispon�vel");
		Livro l2 = new Livro("nomeLivroTeste2","dispon�vel");
		
		//Livros adicionados ao 'BD' manualmente
		s0.BDLivros.add(l0);
		s0.BDLivros.add(l1);
		s0.BDLivros.add(l2);
		
		s0.Inserir("nomeUsuarioTeste");
		
		s0.RegistrarEmprestimo("nomeLivroTeste0","nomeUsuarioTeste","2");
		s0.RegistrarEmprestimo("nomeLivroTeste1","nomeUsuarioTeste","1");
		
		assertEquals("OK", s0.GetStatusLivros("nomeUsuarioTeste"));
		
	}

}
