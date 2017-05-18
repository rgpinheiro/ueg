package br.com.ueg.doacao.telaprincipal;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TelaController implements Initializable {

	@FXML
	private BorderPane rootPane;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	
	
	@FXML
	private void adicionarDoacao(ActionEvent event){
		
		
	}
	
	@FXML
	private void adicionarOngs(ActionEvent event){
		
	}
	
	@FXML
	private void adicionarUser(ActionEvent event){
		
	}
	
	
	void loadWindow(String loc, String titulo) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(loc));
			Stage stage = new Stage(StageStyle.DECORATED);
			stage.setTitle(titulo);
			stage.setScene(new Scene(parent));
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
