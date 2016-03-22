package com.home.designpatterns.builder2;

public class BuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NutritionFactAbstractBuilder builder = new NutritionFactAConcreteBuilder();
		builder.price(0);
		builder.quantity(2);
		builder.calori(3);
		builder.altName("NFact");
		builder.carb(4);
		
		NutritionFact fact = builder.build();
		System.out.println(fact);
	}

}
