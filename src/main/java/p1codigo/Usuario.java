package p1codigo;

public class Usuario {
	private String _nome;
	private boolean _status;
	private int _tempoBan;
	
	Usuario(String nome,boolean status,int tempoBan){
		_nome = nome;
		_status = status;
		_tempoBan = tempoBan;
	}
	
	void SetNome(String nome){
		_nome=nome;
	}
	
	String GetNome(){
		return _nome;
	}
	
	void SetTempoBan(int tempoBan){
		_tempoBan=tempoBan;
	}
	
	int GetTempoBan(){
		return _tempoBan;
	}
	
	void SetStatus(boolean status){
		_status=status;
	}
	
	boolean GetStatus(){
		return _status;
	}

}
