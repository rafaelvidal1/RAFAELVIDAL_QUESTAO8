package p1codigo;

public class Sistema {
	
	
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
	
	boolean EmprestarLivro(String nomeUsuario,String nomeLivro){
		boolean flag;
		Usuario u0;
		
		u0 = ProcurarBD(nomeUsuario);
		flag = u0.GetStatus();
		
		return flag;
	}
	
	void Persistir(Usuario u0) throws Exception{
		System.out.println("usu�rio adicionado ao BD");
		 
	}
	
	Usuario ProcurarBD(String nome){
		
		System.out.printf("Usu�rio %s ssendo procurado no BD! \n",nome);
		//Deveria procurar no BD aqui, mas como n�o h� BD foi criado um usu�rio gen�rico que ser� retornado.
		
		Usuario u0 = new Usuario(nome,true,0);
		return u0;
	}
}
