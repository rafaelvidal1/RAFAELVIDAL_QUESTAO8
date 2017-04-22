package p1codigo;

public class Livro {
	private String _status;
	private String _nome;
	
	Livro(String nome,String status){
		_nome = nome;
		_status=status;
	}
	
	public void SetNome(String nome){
		_nome=nome;
	}
	
	public String GetNome(){
		return _nome;
	}
	
	public void SetStatus(String status){
		_status=status;
	}
	
	public String GetStatus(){
		return _status;
	}

}
