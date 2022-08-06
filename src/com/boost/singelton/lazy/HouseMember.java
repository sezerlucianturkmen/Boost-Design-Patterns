package com.boost.singelton.lazy;

public class HouseMember extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			Robot.getInstance().turnOn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		super.run();
	}

	public void callRobot() {
		System.out.println(Robot.getInstance().hashCode());
	}

}
