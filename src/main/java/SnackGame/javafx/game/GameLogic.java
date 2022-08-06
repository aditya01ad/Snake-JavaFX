package SnackGame.javafx.game;

public class GameLogic {
	static int score = 0;
	
	static void snakeMove() {
		
	}
	static void eat() {
		if(Snake.snake.get(0) == Food.food) {
			Snake.snakeAdd(Food.foodI, Food.foodJ);
			Food.changeFood();
			score++;
		}
	}
	
	
}
