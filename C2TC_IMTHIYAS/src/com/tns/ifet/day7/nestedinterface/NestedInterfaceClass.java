//Child class implements inner interface
package com.tns.ifet.day7.nestedinterface;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		 System.out.println("Print method of nested interface");
	}

	

}