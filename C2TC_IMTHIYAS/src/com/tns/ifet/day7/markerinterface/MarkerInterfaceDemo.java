// Usage of the marker interface
package com.tns.ifet.day7.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
	}
}
