package p1codigo;

public class Usuario {
	private String _nome;
	private boolean _status;
	
	Usuario(String nome,boolean status){
		_nome = nome;
		_status = status;
	}
	
	void SetNome(String nome){
		_nome=nome;
	}
	
	String GetNome(){
		return _nome;
	}
	
	void SetStatus(boolean status){
		_status=status;
	}
	
	boolean GetStatus(){
		return _status;
	}

}
