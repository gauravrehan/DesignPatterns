package com.home.designpatterns.singleton;

import java.io.Serializable;

public class SingletonFactory implements Serializable {
	private static final SingletonFactory INSTANCE = new SingletonFactory();
	
	private SingletonFactory()
	{}
	
	public static SingletonFactory getInstance()
	{
		return INSTANCE;
	}
	
	private Object readResolve()
	{
		return INSTANCE;
	}

}
