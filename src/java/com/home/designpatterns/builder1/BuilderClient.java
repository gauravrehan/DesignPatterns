package com.home.designpatterns.builder1;

public class BuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NutritionFact fact = new NutritionFact.Builder(1, 2).altName("black sea").calori(1).carb(2).build();
		System.out.println(fact);
	}

}
