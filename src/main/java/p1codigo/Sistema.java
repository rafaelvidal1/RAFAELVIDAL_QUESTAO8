package p1codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sistema {
	
	public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/company.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
	
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
	
	void Persistir(Usuario u0){
		
	}
	
	Usuario ProcurarBD(String nome){
		Usuario u0 = new Usuario(nome,true,0);
		return u0;
	}
}
