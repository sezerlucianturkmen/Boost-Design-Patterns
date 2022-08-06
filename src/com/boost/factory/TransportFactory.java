package com.boost.factory;

public class TransportFactory {

	public static Transport builder(ETransportType type) {

		switch (type) {

		case GROUND:
			return new TruckLittle();
		case SEA:
			return new Ship();
		default:
			return new Truck();

		}

	}

}
