package com.home.designpatterns.singleton;

enum SingletonEnum {
	INSTANCE;

	public String sayHello()
	{
		return "hi";
	}
}


public class SingletonEnumTest
{

	public static void main(String [] a)
	{
		System.out.println(SingletonEnum.INSTANCE.sayHello());
	}
}