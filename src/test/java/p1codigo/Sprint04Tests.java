package p1codigo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Sprint04Tests {

	@Test
	public void testLivrosRetiradosComSituação() {
		Sistema s0 = new Sistema();
		List<LivroUsuario> luLista = new ArrayList<LivroUsuario>();
		Usuario u0 = new Usuario("nomeUsuarioTeste",true,0);
		Livro l0 = new Livro("nomeLivroTeste0","disponível");
		Livro l1 = new Livro("nomeLivroTeste1","disponível");
		Livro l2 = new Livro("nomeLivroTeste2","disponível");
		
		//Livros adicionados ao 'BD' manualmente
		s0.BDLivros.add(l0);
		s0.BDLivros.add(l1);
		s0.BDLivros.add(l2);
		
		s0.Inserir("nomeUsuarioTeste");
		
		s0.RegistrarEmprestimo("nomeLivroTeste0","nomeUsuarioTeste",2);
		s0.RegistrarEmprestimo("nomeLivroTeste1","nomeUsuarioTeste",1);
		
		luLista = s0.GetStatusLivros("nomeUsuarioTeste");
		
		assertEquals("nomeLivroTeste0", luLista.get(0).GetNomeLivro());
		assertEquals("No prazo", luLista.get(0).GetStatusPrazo());
		
		assertEquals("nomeLivroTeste1", luLista.get(1).GetNomeLivro());
		assertEquals("No prazo", luLista.get(1).GetStatusPrazo());
		
	}

}
