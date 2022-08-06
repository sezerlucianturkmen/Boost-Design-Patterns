package com.boost.factory;

public abstract class Transport {

	private ETransportType type = null;

	public Transport(ETransportType type) {
		this.type = type;
	}

	private void midOperation() {

	}

	protected abstract void construct();

	public ETransportType getType() {
		return type;
	}

	public void setType(ETransportType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transport [type=" + type + "]";
	}

}
