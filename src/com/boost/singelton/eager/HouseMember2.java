package com.boost.singelton.eager;

import com.boost.singelton.lazy.Robot;

public class HouseMember2 extends Thread {

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
