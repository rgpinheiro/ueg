package br.com.ueg.doacao.users;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class MainUsers extends Application {

	//
	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent parent = FXMLLoader.load(getClass().getResource("Users.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.show();
		//
	}

	public static void main(String[] args) {
		launch(args);
	}

}
