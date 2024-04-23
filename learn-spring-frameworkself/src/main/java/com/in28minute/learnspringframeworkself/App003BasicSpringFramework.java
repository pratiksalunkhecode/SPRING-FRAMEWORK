package com.in28minute.learnspringframeworkself;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minute.learnspringframeworkself.game.GameRunner;
import com.in28minute.learnspringframeworkself.game.GamingConsole;
import com.in28minute.learnspringframeworkself.game.PacmanGame;

public class App003BasicSpringFramework {

	public static void main(String[] args) {
		
	try(var context	=
			new AnnotationConfigApplicationContext
			    (GamingConfiguration.class)){
		
		
	
	
	context.getBean(GamingConsole.class).up();
	context.getBean(GameRunner.class).run();	


	}

}
}
