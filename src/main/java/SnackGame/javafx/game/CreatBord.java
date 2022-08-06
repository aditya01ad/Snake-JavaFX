package SnackGame.javafx.game;

import java.util.Random;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CreatBord {
	
	static Rectangle[][] rectArr = new Rectangle[Constants.numOfRect][Constants.numOfRect];
	
	static Group bord;
	static Random random = new Random();
	
	
	public static Group creatBord() {
		bord = new Group();
		drawRects();
		Snake.creatSnake();
		Food.creatFood();
		Snake.updateSnake();
		
		return bord;
	}
	private static void drawRects() {
		for(int i=0; i<Constants.numOfRect; i++) {
			for(int j=0; j<Constants.numOfRect; j++) {
				rectArr[i][j] = new Rectangle();
				rectArr[i][j].setX(40 + i*Constants.rectSize);
				rectArr[i][j].setY(40 + j*Constants.rectSize);
				rectArr[i][j].setHeight(Constants.rectSize);
				rectArr[i][j].setWidth(Constants.rectSize);
				rectArr[i][j].setFill(Color.RED);
				rectArr[i][j].setStroke(Color.DARKBLUE);
				bord.getChildren().add(rectArr[i][j]);
			}
		}
	}
	
	
}
