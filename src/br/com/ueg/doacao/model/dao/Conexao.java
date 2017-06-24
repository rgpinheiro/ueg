package br.com.ueg.doacao.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public abstract class Conexao {
	
	private static final String driver = "org.postgresql.Driver";
	private	static final String user = "postgres";
	private static final String senha = "1234"; 
	private static final String url = "jdc:postgresql://localhost:5432/doacao/";
	private static Connection con = null;
	private PreparedStatement st = null;
	
	public  Connection getConnetion(){
		try {
			Connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Conexao.con;
	}
	

	private void Connect() throws Exception{
		try {
			if (con == null) {
				Class.forName(driver);
				 Conexao.con = DriverManager.getConnection(url, user, senha);
				 Conexao.con.setAutoCommit(false);
			}else if (Conexao.con.isClosed()) {
				Conexao.con = DriverManager.getConnection(url, user, senha);
				Conexao.con.setAutoCommit(false);
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	

}
