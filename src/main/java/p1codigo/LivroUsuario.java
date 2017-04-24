package p1codigo;

public class LivroUsuario {
	private String _nomeLivro;
	private String _statusPrazo;
	
	public String GetNomeLivro(){
		return _nomeLivro;
	}
	
	public void SetNomeLivro(String nomeLivro){
		_nomeLivro = nomeLivro;
	}
	
	public String GetStatusPrazo(){
		return _statusPrazo;
	}
	
	public void SetStatusPrazo(String statusPrazo){
		_statusPrazo = statusPrazo;
	}

}
