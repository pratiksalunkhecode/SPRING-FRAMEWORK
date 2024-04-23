package com.in29minute.learnspringonce;

import com.in29minute.learnspringonce.game.GameRunner;
import com.in29minute.learnspringonce.game.MarioGame;
import com.in29minute.learnspringonce.game.SuperContra;

public class AppBasicJava {

	public static void main(String[] args) {
		
		
		//var game = new MarioGame();		
		var game = new SuperContra();
		
	
		
	    var gameRunner = new GameRunner(game);
		
		gameRunner.run(game);
		//gameRunner.run(null);
		
		
		

	}

}
