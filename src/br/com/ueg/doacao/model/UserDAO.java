package br.com.ueg.doacao.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.ueg.doacao.model.dao.Conexao;
import br.com.ueg.doacao.view.users.UserController;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class UserDAO extends Conexao {
	
	
	
	public void adicionarUsuario(User user) throws Exception{
		Connection cnn = super.getConnetion();
		
		String nome = user.getUserNome().getText();
		String senha = user.getUserEmail().getText();
		String confirmacao = user.getUserConfirmacaoSenha().getText();
		String email = user.getUserEmail().getText();
		String celular = user.getUserCelular().getText();
		
		boolean flag = nome.isEmpty() || senha.isEmpty() || confirmacao.isEmpty() || email.isEmpty() || celular.isEmpty();
		
		if (flag) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setContentText("Favor Preencher todos os campos");
			alert.showAndWait();
			return;
		} 
		
		String StringSQL = "";
		if (user.getId() == null || user.getId().longValue() == 0) {
			StringSQL = "insert into users values(?,?,?,?)";
			PreparedStatement st = cnn.prepareStatement(StringSQL);
			st.setString(1, nome);
			st.setString(2, senha);
			st.setString(3, email);
			st.setString(3, celular);
			st.executeUpdate();
			cnn.commit();
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setHeaderText(null);
			alert.setContentText("Salvo com sucesso");
			alert.showAndWait();
		}
	}

}
