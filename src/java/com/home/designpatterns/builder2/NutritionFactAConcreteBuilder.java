package com.home.designpatterns.builder2;

public class NutritionFactAConcreteBuilder extends NutritionFactAbstractBuilder {
	
	private NutritionFact nutritionFact;

	private int price;
	private int quantity;
	private String altName;
	private int calori;
	private int carb;
	
	@Override
	NutritionFact build() {
		
		if (price < 0 ) throw new IllegalStateException("price cannot be less than 0.");
		// TODO Auto-generated method stub
		nutritionFact = new NutritionFact();
		nutritionFact.setAltName(altName);
		nutritionFact.setPrice(price);
		nutritionFact.setQuantity(quantity);
		nutritionFact.setCalori(calori);
		nutritionFact.setCarb(carb);
		return nutritionFact;
		
	}

	@Override
	void price(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	@Override
	void quantity(int quantity) {
		// TODO Auto-generated method stub
		this.quantity = quantity;
	}

	@Override
	void altName(String altName) {
		// TODO Auto-generated method stub
		this.altName = altName;
	}

	@Override
	void calori(int calori) {
		// TODO Auto-generated method stub
		this.calori = calori;
	}

	@Override
	void carb(int carb) {
		// TODO Auto-generated method stub
		this.carb = carb;
	}

}
