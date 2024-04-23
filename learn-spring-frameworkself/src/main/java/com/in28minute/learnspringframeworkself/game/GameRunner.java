package com.in28minute.learnspringframeworkself.game;

public class GameRunner {
	
	GamingConsole game; // new class you need bind always
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("the running game" + game);
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
	

}
