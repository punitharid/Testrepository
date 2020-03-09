package com.java;

import java.util.logging.Logger;

public class HelloWorld {
	
	private HelloWorld()
	{
		
	}
public static void main(String[] args)
{
	Logger.getLogger("Hello World");	
	Test testObj = new Test();
	testObj.method1();
	int count=0;
	if (count <1)
	{
		Logger.getLogger("Test major and minor errors");
		
	}
}
}
