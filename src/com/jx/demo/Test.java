package com.jx.demo;

import org.apache.log4j.Logger;

public class Test {
	private static Logger logger=Logger.getLogger(Test.class);
	public static void main(String[] args){
		System.out.println("This is println message");
		//��¼debug�������Ϣ
		logger.debug("this is debug message");
		logger.info("This is info message ");
		logger.error("This is error message");  
	}

}
