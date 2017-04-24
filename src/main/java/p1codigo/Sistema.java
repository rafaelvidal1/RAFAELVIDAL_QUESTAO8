package p1codigo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	List<Usuario> BD = new ArrayList<Usuario>(); 
	List<Livro> BDLivros = new ArrayList<Livro>(); 
	List<Emprestimo> BDEmprestimos = new ArrayList<Emprestimo>();
	
	boolean Inserir(String nomeUsuario){
		Usuario u0 = new Usuario(nomeUsuario,true,0);
		boolean flag = true;
		try{
			Persistir(u0);
		}catch(Exception e){
			System.out.println(e.getMessage());
			flag = false;
		}
		return flag;
	}
	
	boolean EmprestarLivro(String nomeUsuario){
		Usuario u0;
		
		u0 = ProcurarBD(nomeUsuario);
		
		if(u0==null){
			return false;
		}
		
		return u0.GetStatus();
	}
	
	void Persistir(Usuario u0) throws Exception{
		BD.add(u0);
		 
	}
	
	Usuario ProcurarBD(String nome){
		for(Usuario u : BD){
			if(u.GetNome() == nome){
				return u;
			}
		}
		return null;
	}
	
	Livro ProcurarLivroBD(String nome){
		
		System.out.printf("Livro %s sendo procurado no BD! \n",nome);
		for(Livro l : BDLivros){
			if(l.GetNome() == nome){
				return l;
			}
		}
		return null;
	}
	
	boolean Remover(String nome){
		Usuario u0;
		
		u0 = ProcurarBD(nome);
		
		if(u0 == null){
			return false;
		}
		
		BD.remove(u0);
		
		return true;
	}
	
	void BanUsuario(String nome,int tempo){
		Usuario u0;
		
		u0 = ProcurarBD(nome);
		
		if(u0 == null){
			return ;
		}
		
		BD.remove(u0);
		
		u0.SetStatus(false);
		u0.SetTempoBan(tempo);
		
		BD.add(u0);
	}
	
	void RegistrarEmprestimo(String nomeLivro, String nomeUsuario,int prazo){
		Livro l0;
		Usuario u0;
		
		l0 = ProcurarLivroBD(nomeLivro);
		
		if (l0==null){
			return;
		}
		
		u0 = ProcurarBD(nomeUsuario);
		
		if(u0 == null){
			return ;
		}
		
		Emprestimo e0 = new Emprestimo(nomeLivro,nomeUsuario,prazo);
		
		BDLivros.remove(l0);
		l0.SetStatus("retirado");
		BDLivros.add(l0);
		
		BDEmprestimos.add(e0);
	}
	
	void RegistrarDevolucao(String nomeLivro, String nomeUsuario){
		Livro l0;
		Usuario u0;
		
		l0 = ProcurarLivroBD(nomeLivro);
		
		if (l0==null){
			return;
		}
		
		u0 = ProcurarBD(nomeUsuario);
		
		if(u0 == null){
			return ;
		}
		
		Emprestimo e0 = new Emprestimo(nomeLivro,nomeUsuario);
		
		BDLivros.remove(l0);
		l0.SetStatus("dispon�vel");
		BDLivros.add(l0);
		
		BDEmprestimos.remove(e0);
	}
	
	public List<LivroUsuario> GetStatusLivros(String nomeUsuario){
		Usuario u0;
		List<LivroUsuario> luLista = new ArrayList<LivroUsuario>();
		
		u0 = ProcurarBD(nomeUsuario);
		
		if(u0 == null){
			return null;
		}
		
		for(Emprestimo e : BDEmprestimos){
			if(e.GetNomeUsuario() == nomeUsuario){
				if(e.GetPrazo()>=0){
					LivroUsuario lu0 = new LivroUsuario();
					lu0.SetNomeLivro(e.GetNomeLivro());
					lu0.SetStatusPrazo("No prazo");
					luLista.add(lu0);
				}else{
					LivroUsuario lu0 = new LivroUsuario();
					lu0.SetNomeLivro(e.GetNomeLivro());
					lu0.SetStatusPrazo("Fora do prazo");
					luLista.add(lu0);
				}
			}
		}
		
		return luLista;
	}
	
	public String StatusLivro(String nomeLivro){
		Livro l0;
		
		l0 = ProcurarLivroBD(nomeLivro);
		
		if (l0==null){
			return "Livro inexistente!";
		}
		
		return l0.GetStatus();
	}
	
}
