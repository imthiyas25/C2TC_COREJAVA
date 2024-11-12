//Program to demonstrate accessing classes and methods of different package
package com.tns.ifet.day4.secondpackage;

import com.tns.ifet.day4.firstpackage.Base;

public class Executor {
	public static void main(String[] args) {
		// accessing different package class
		Base b1 = new Base();

		// private, default and protected members can't access

		/*
		 * b1.varPrivate=21; b1.methodPrivate(); b1.varDefault=11; b1.methodDefault();
		 * b1.varProtected=31; b1.methodProtected();
		 */

		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}