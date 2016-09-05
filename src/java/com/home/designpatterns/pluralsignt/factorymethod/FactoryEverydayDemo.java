package com.home.designpatterns.pluralsignt.factorymethod;

import java.util.Calendar;

public class FactoryEverydayDemo {

	public static void main(String[] a)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}
