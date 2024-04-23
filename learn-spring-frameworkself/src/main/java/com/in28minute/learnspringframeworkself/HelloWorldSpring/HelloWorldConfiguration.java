package com.in28minute.learnspringframeworkself.HelloWorldSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record person (String name , int age , address address) {};
record address (String city , int citycode,String post,String street) {};


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name()
	{
		return "pratik coder";
	}
	
	@Bean
	public int age()
	{
		return 23;
	}
	
	@Bean
	public float age2()
	{
		return (float)34.56;
	}
	
	@Bean
	public person person()
	{
		var persondetails = new person("pratik" , 24 ,new address("punee",24,"pune Eest","DM road") );
		return persondetails;
	}
	
	@Bean
	@Primary
	public person person2callmethod()
	{
		var persondetails = new person(name(),age(),address()); //existing bean use to take a value
		return persondetails;
	}
	
	@Bean
	public person person3Parameter(String name , int age ,address address3)
	{
		var persondetails = new person(name,age,address3); //existing bean use to take a value
		return persondetails;
	}
	
	@Bean
	@Primary
	public address address1()
	{
		var myaddress = new address("pune",23333333,"pune west","DD road");
		return myaddress;
	}
	
	
	@Bean(name = "address3")
	public address address()
	{
		var myaddress = new address("Mumbai",24,"mumbai west","DS road");
		return myaddress;
	}
	

}
