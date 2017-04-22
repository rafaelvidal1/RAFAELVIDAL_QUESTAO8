package p1codigo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sprint02Tests {

	@Test
	public void testRegistrarEmprestimoLivro() {
		Sistema s0 = new Sistema();
		Usuario u0 = new Usuario("nomeTeste",true,0);
		Livro l0 = new Livro("nomeLivroTeste","disponível");
		s0.BDLivros.add(l0);
		
		s0.Inserir("nomeUsuarioTeste");
		
		s0.RegistrarEmprestimo("nomeLivroTeste","nomeUsuarioTeste");
		
		assertEquals("retirado", s0.BDLivros.get(0).GetStatus());
	}
	
	@Test
	public void testRegistrarDevolucaoLivro(){
		Sistema s0 = new Sistema();
		Usuario u0 = new Usuario("nomeTeste",true,0);
		Livro l0 = new Livro("nomeLivroTeste","disponível");
		s0.BDLivros.add(l0);
		
		s0.Inserir("nomeUsuarioTeste");
		
		s0.RegistrarEmprestimo("nomeLivroTeste","nomeUsuarioTeste");
		
		s0.RegistrarDevolucao("nomeLivroTeste","nomeUsuarioTeste");
		
		assertEquals("disponível", s0.BDLivros.get(0).GetStatus());
	}
	
}
