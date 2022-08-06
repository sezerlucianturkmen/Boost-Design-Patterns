package com.boost.singelton.eager;

public class Robot2 {

	private static Robot2 instance = new Robot2();

	private Robot2() {

	}

	public static Robot2 getInstance() {

		return instance;
	}

	public void turnOn() {
		System.out.println(hashCode() + "----> it is working..");
	}
}
