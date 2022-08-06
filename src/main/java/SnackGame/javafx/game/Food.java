package SnackGame.javafx.game;

import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Food {
	static int foodI;
	static int foodJ;
	static Rectangle food;
	static Random random = new Random();
	static void creatFood() {
		foodI = random.nextInt(1, Constants.numOfRect-1);
		foodJ = random.nextInt(1, Constants.numOfRect-1);
		food = CreatBord.rectArr[foodI][foodJ];
		food.setFill(Color.DEEPSKYBLUE);
	}
	static void changeFood() {
		foodI = random.nextInt(1, Constants.numOfRect-1);
		foodJ = random.nextInt(1, Constants.numOfRect-1);
		food.setFill(Color.RED);
		food = CreatBord.rectArr[foodI][foodJ];
		food.setFill(Color.DEEPSKYBLUE);
	}
}
