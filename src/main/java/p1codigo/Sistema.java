package p1codigo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	List<Usuario> BD = new ArrayList<Usuario>(); 
	
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
		Usuario u0;
		
		u0 = ProcurarBD(nomeUsuario);
		
		if(u0==null){
			return false;
		}
		
		return u0.GetStatus();
	}
	
	void Persistir(Usuario u0) throws Exception{
		BD.add(u0);
		System.out.println("usuário adicionado ao BD");
		 
	}
	
	Usuario ProcurarBD(String nome){
		
		System.out.printf("Usuário %s sendo procurado no BD! \n",nome);
		for(Usuario u : BD){
			if(u.GetNome() == nome){
				return u;
			}
		}
		return null;
	}
	
	boolean Remover(String nome){
		return false;
	}
}
