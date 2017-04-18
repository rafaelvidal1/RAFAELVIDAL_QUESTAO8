package p1codigo;

public class Sistema {
	
	boolean Inserir(String nomeUsuario){
		Usuario u0 = new Usuario(nomeUsuario,true);
		boolean flag = true;
		try{
			Persistir(u0);
		}catch(Exception e){
			System.out.println(e.getMessage());
			flag = false;
		}
		
		return flag;
	}
	
	boolean EmprestarLivro(String nomeUsuario,String nomeLivro){
		boolean flag;
		Usuario u0;

		u0 = ProcurarBD("nomeUsuario");
		flag = u0.GetStatus();
		
		return flag;
	}
	
	void Persistir(Usuario u0){
		
	}
	
	Usuario ProcurarBD(String nome){
		Usuario u0 = new Usuario(nome,true);
		return u0;
	}
	
}
