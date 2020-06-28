package com.compositionHouse;

public class Fan {
	private int onSettings;
	private boolean notBroken;

	public Fan(int onSettings, boolean notBroken) {
		super();
		this.onSettings = onSettings;
		this.notBroken = notBroken;
	}

	public void turnOn() {
		if (notBroken) {
			System.out.println("You turn on the fan.");
			switch (this.onSettings) {
			case 1:
				System.out.println("Fan is on mode 1. Light breeze.");
				break;
			case 2:
				System.out.println("Fan is on mode 2. Moderate Breeze.");
				break;
			case 3:
				System.out.println(
						"Fan is on mode 3. You are hanging on to your chair for dear life as the wind pushes you back so immensely that you go bald.");
				break;
			default:
				System.out.println("You tried to put the switch on " + onSettings
						+ " But, it didn't have that mode so you got frustrated causing you to throw the fan out the window");
				break;
			}
		}
		else {
			System.out.println("You turned on the broken fan and it didn't do anything. Then you realized it wasn't even on.");
		}

	}
}
