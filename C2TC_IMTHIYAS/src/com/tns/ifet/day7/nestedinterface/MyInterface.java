//Nested Interface
package com.tns.ifet.day7.nestedinterface;

public interface MyInterface {
	 void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
}