package com.home.designpatterns.builder2;

public abstract class NutritionFactAbstractBuilder {

	abstract NutritionFact build();
	abstract void price(int price);
	abstract void quantity(int quantity);
	abstract void altName(String altName);
	abstract void calori(int calori);
	abstract void carb(int carb);
}
