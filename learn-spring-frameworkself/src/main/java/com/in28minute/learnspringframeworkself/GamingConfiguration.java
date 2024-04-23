package com.in28minute.learnspringframeworkself;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minute.learnspringframeworkself.game.GameRunner;
import com.in28minute.learnspringframeworkself.game.GamingConsole;
import com.in28minute.learnspringframeworkself.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game()
	{
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner()
	{
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}
	
	
	
/*	var game = new MarioGame();
	var game = new SuperContra();
	var game = new PacmanGame();
	
	
	var gameRunner = new GameRunner(game);	
	var gameRunner = new GameRunner(marioGame);
	
	gameRunner.run(); */
	

}
