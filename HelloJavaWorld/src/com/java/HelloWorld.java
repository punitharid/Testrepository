package com.java;

import java.util.logging.Logger;

public class HelloWorld {
	
	private HelloWorld()
	{
		
	}
public static void main(String[] args)
{
	
	Logger logger = Logger.getLogger(HelloWorld.class.getName()); 
	logger.info("Hello World");	
	Test testObj = new Test();
	testObj.method1();
	int count=0;
	if (count <1)
	{
		logger.info("Test major and minor errors");
		
	}
}
}
