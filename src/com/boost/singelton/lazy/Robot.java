package com.boost.singelton.lazy;

public class Robot {

	private static Robot instance;

	private Robot() {

	}

	public static Robot getInstance() {
		if (instance == null) {
			instance = new Robot();
		}
		return instance;
	}

	public void turnOn() {
		System.out.println(hashCode() + "----> it is working..");
	}
}
