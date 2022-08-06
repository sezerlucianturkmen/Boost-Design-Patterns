package com.boost.factory;

public class Ship extends Transport {

	public Ship() {
		super(ETransportType.SEA);

	}

	@Override
	protected void construct() {
		System.out.println("Ship is working");

	}

}
