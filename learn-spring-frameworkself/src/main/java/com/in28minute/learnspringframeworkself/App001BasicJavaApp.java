package com.in28minute.learnspringframeworkself;

import com.in28minute.learnspringframeworkself.game.GameRunner;
import com.in28minute.learnspringframeworkself.game.PacmanGame;
import com.in28minute.learnspringframeworkself.game.SuperContra;

public class App001BasicJavaApp {

	public static void main(String[] args) {
		
		
		//var game = new MarioGame();
		//var game = new SuperContra();
		 var game = new PacmanGame();
		
		
		var gameRunner = new GameRunner(game);	
		//var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();

	}

}
