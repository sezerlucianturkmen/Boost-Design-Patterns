package com.boost.factory;

public class Runner {

	public static void main(String[] args) {

		Transport transport;

		transport = TransportFactory.builder(ETransportType.GROUND);
		transport = TransportFactory.builder(ETransportType.SEA);

	}

}
