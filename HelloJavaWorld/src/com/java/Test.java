package com.java;

import java.util.logging.Logger;

public class Test {

	public void method1()
	{
		Logger logger = Logger.getLogger(HelloWorld.class.getName());
		logger.info("Test method1");
	}
}
