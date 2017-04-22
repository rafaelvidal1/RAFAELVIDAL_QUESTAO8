package p1codigo;

public class Emprestimo {
	private String _nomeLivro;
	private String _nomeUsuario;
	
	Emprestimo(String nomeLivro,String nomeUsuario){
		_nomeLivro = nomeLivro;
		_nomeUsuario = nomeUsuario;
	}
	
	public String GetNomeUsuario(){
		return _nomeUsuario;
	}
	
	public void SetNomeUsuario(String nomeUsuario){
		_nomeUsuario = nomeUsuario;
	}
	
	public String GetNomeLivro(){
		return _nomeLivro;
	}
	
	public void SetNomeLivro(String nomeLivro){
		_nomeLivro = nomeLivro;
	}
	
}
