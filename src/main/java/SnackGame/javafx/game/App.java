package SnackGame.javafx.game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
	static Group root;
	
	
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		root = CreatBord.creatBord();
		
		
		Scene scene = new Scene(root, Constants.sceneWidth, Constants.sceneHeight, Color.BLACK);
		
		
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
}
