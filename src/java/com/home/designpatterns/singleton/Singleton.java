package com.home.designpatterns.singleton;


/*
 * Singleton with lazy init
 */
public class Singleton {
	
	private volatile static Singleton INSTANCE;
	
	private Singleton()
	{}
	
	public static Singleton getInstance()
	{
		if(INSTANCE == null)
		{
			synchronized (Singleton.class)
			{
				if(INSTANCE == null)
					INSTANCE = new Singleton();
				
			}
		}
		return INSTANCE;
		
	}
}
