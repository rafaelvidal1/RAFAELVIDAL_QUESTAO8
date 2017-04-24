package p1codigo;

public class Emprestimo {
	private String _nomeLivro;
	private String _nomeUsuario;
	private int _prazo=0;
	
	Emprestimo(String nomeLivro,String nomeUsuario,int prazo){
		_nomeLivro = nomeLivro;
		_nomeUsuario = nomeUsuario;
		_prazo = prazo;
	}
	
	Emprestimo(String nomeLivro,String nomeUsuario){
		_nomeLivro = nomeLivro;
		_nomeUsuario = nomeUsuario;
	}
	
	public int GetPrazo(){
		return _prazo;
	}
	
	public void SetPrazo(int prazo){
		_prazo = prazo;
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
