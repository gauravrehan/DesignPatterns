package com.home.designpatterns.builder2;

public class NutritionFact {

	private int price = -1;
	private int quantity = -1;
	private int calori = 0;
	private int carb = 0;
	private String altName = null;
	
	
	public void setPrice(int price) {
		this.price = price;
	}





	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





	public void setCalori(int calori) {
		this.calori = calori;
	}





	public void setCarb(int carb) {
		this.carb = carb;
	}





	public void setAltName(String altName) {
		this.altName = altName;
	}





	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Class = " + this.getClass() + " Price = " + price + " Quantity = "+ quantity + " altName = " + altName
				+ " carb = " + carb + " calori = " + calori;
	}
	
}
