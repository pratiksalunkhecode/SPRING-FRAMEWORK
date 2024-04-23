package com.in29minute.learnspringonce.game;

public class GameRunner{
	
	GamingConsole game;

	

	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}



	public void run(GamingConsole game) {
		game.down();
		game.up();
		game.left();
		game.right();
		
	}
	
	

}
