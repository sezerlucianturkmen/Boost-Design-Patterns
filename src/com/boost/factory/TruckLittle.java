package com.boost.factory;

public class TruckLittle extends Transport {

	public TruckLittle() {
		super(ETransportType.GROUND);
	}

	@Override
	protected void construct() {
		System.out.println("TruckLittle is working");

	}

}
