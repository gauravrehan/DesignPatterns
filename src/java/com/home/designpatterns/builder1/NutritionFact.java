package com.home.designpatterns.builder1;

public class NutritionFact {

	private int price = -1;
	private int quantity = -1;
	
	private int calori = 0;
	private int carb = 0;
	private String altName = null;
	
	public static class Builder {
		
		private int price = -1;
		private int quantity = -1;
		
		private int calori = 0;
		private int carb = 0;
		private String altName = null;
		
		public Builder(int price, int quantity)
		{
			this.price = price;
			this.quantity = quantity;
		}
		
		public Builder calori(int calori)
		{
			this.calori = calori;
			return this;
		}
		
		public Builder carb(int carb)
		{
			this.carb = carb;
			return this;
		}
		
		public Builder altName(String altName)
		{
			this.altName = altName;
			return this;
		}
		
		public NutritionFact build()
		{
			return new NutritionFact(this);
		}
		
		
	}
	
	private NutritionFact (Builder builderClient)
	{
		price = builderClient.price;
		quantity = builderClient.quantity;
		altName = builderClient.altName;
		carb = builderClient.carb;
		calori = builderClient.calori;
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
