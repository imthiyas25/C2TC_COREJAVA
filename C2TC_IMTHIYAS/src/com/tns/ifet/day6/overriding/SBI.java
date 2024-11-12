//Program to demonstrate method overriding - Runtime Polymorphism
package com.tns.ifet.day6.overriding;

//subclass
public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}
