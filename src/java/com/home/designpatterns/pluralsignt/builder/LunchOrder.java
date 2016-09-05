package com.home.designpatterns.pluralsignt.builder;

/*
 * handles complex constructors and large number of parameters 
 * Avoids telescopic constructors
 * have support for immutability
 * example: 
 * StringBuilder
 * DocumentBuilder
 * Locale.Builder
 * 
 * Features:
 * Uses static inner class
 * calls appropriate constructor
 * negates the need for exposed setters
 * 
 * Builder vs Prototype
 * Builder: handles complex constructions,  No interface required, can be a seperate class, works with legacy code.
 * Prototype: implemented around a clone, avoids calling complex constructor, difficult in implementing legacy code.
 */
public class LunchOrder {
	
	public static class Builder{
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public Builder()
		{
			
		}
		
		public LunchOrder build()
		{
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread)
		{
			this.bread = bread; 
			return this;
		}
		
		public Builder condiments(String condiments)
		{
			this.condiments = condiments; 
			return this;
		}
		
		public Builder dressing(String dressing)
		{
			this.dressing = dressing; 
			return this;
		}
		
		public Builder meat(String meat)
		{
			this.meat = meat; 
			return this;
		}
	}
	
	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;
	
	private LunchOrder(Builder builder)
	{
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
	
	

}
