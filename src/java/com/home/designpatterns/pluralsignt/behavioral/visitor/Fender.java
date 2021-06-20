package com.home.designpatterns.pluralsignt.behavioral.visitor;

public class Fender implements AtvPart {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
