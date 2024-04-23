package com.in28minute.learnspringframeworkself.HelloWorldSpring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minute.learnspringframeworkself.game.GameRunner;
import com.in28minute.learnspringframeworkself.game.PacmanGame;

public class App002HelloWorldSpring {

	public static void main(String[] args) {
		
		//Launch the spring framework
		 try (var context  = 
				  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);){
				
		//configure the things that we want to spring manage = @Configuration
		  
		 
		  System.out.println( context.getBean("name"));
		  
		  System.out.println( context.getBean("age"));
		  
		  System.out.println( context.getBean("age2"));
		  
		  System.out.println( context.getBean("person"));
		  System.out.println( context.getBean("person2callmethod"));
		  System.out.println( context.getBean("person3Parameter"));
		  System.out.println( context.getBean(person.class));
		  
		 System.out.println( context.getBean("address3"));
		 System.out.println( context.getBean(address.class));
		
//		 Arrays.stream(context.getBeanDefinitionNames())
//		 .forEach(System.out::println); // print all the bean thoes present in spring framework
		 
		 //context.getBeanDefinitionCount();
	
		 } 
		

	}

}
