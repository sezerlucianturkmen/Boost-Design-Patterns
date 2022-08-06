package com.boost.factory;

public class Truck extends Transport {

	public Truck() {
		super(ETransportType.GROUND);

	}

	@Override
	protected void construct() {
		System.out.println("Truck is working");

	}

}
