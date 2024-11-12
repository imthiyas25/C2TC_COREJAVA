//Executor class for ChildThread
package com.tnsif.daythirteen;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(20, "First");
		ChildThread threadTwo = new ChildThread(5, "Second");

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException
		//threadOne.run(); // single threaded application 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}
