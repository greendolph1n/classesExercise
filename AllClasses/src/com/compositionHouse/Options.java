package com.compositionHouse;

import java.util.Scanner;

public class Options {
	private int fanMode;
	private boolean fanSwitch;
	private int lampMode;
	private boolean lampSwitch;
	private boolean speakerSwitch;
	private boolean nintendoPower;
	private boolean drankBadMilk;
	Scanner scanner = new Scanner(System.in);

	public Options(int fanMode, boolean fanSwitch, int lampMode, boolean lampSwitch, boolean speakerSwitch,
			boolean nintendoPower, boolean drankBadMilk) {
		super();
		this.fanMode = fanMode;
		this.fanSwitch = fanSwitch;
		this.lampMode = lampMode;
		this.lampSwitch = lampSwitch;
		this.speakerSwitch = speakerSwitch;
		this.nintendoPower = nintendoPower;
		this.drankBadMilk = drankBadMilk;
	}

	public void Choices() {

		System.out.println("Welcome to Derek's story 'One brisk Summer Night'\n\nINSTRUCTIONS: Enter '1' if yes, otherwise, enter any other **NUMBER**.\nNow, let's begin\n\nEnter 1 to turn the fan on");
		fanSwitch = trueOrFalse(scanner.nextInt());
		if (fanSwitch) {
			System.out.println("What mode do you want the fan on? There are three levels. 1,2 and 3.");

			fanMode = scanner.nextInt();
		}

		System.out.println("Would you like the lamp on too? Enter 1 to turn on the lamp");
		lampSwitch = trueOrFalse(scanner.nextInt());
		if (lampSwitch) {
			System.out.println("What level would you like the lamp on? Enter 1,2 or 3?");
			lampMode = scanner.nextInt();
		}

		System.out.println("Enter 1 if you remembered to charge your speaker.");
		speakerSwitch = trueOrFalse(scanner.nextInt());

		System.out.println("Would you like to play on your Nintendo Switch? Enter '1' to play");
		nintendoPower = trueOrFalse(scanner.nextInt());

		System.out.println(
				"You pause for a moment. Your stomach grumbles..Did you drink some bad milk? Enter 1 if you did.");
		drankBadMilk = trueOrFalse(scanner.nextInt());
	}

	public boolean trueOrFalse(int checker) {
		if (checker == 1) {
			return true;
		} else {
			return false;
		}
	}

	public int getFanMode() {
		System.out.println();
		return fanMode;
	}

	public boolean isFanSwitch() {
		return fanSwitch;
	}

	public int getLampMode() {
		return lampMode;
	}

	public boolean isLampSwitch() {
		return lampSwitch;
	}

	public boolean isSpeakerSwitch() {
		return speakerSwitch;
	}

	public boolean isNintendoPower() {
		return nintendoPower;
	}

	public boolean isDrankBadmilk() {
		return drankBadMilk;
	}

}
