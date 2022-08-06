package SnackGame.javafx.game;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Snake {
	static ArrayList<Rectangle> snake;
	
	static void creatSnake() {
		snake = new ArrayList<>();
		snakeAdd(20, 20);
		snakeAdd(19, 20);
		snakeAdd(18,20);
	}
	static void snakeAdd(int i, int j) {
		snake.add(CreatBord.rectArr[i][j]);
	}
	static void updateSnake() {
		for(Rectangle rect : snake) {
			rect.setFill(Color.GREENYELLOW);
		}
	}
}
