package com.compositionHouse;

public class Lamp {
	private int onSettings;

	public Lamp(int onSettings) {
		super();
		this.onSettings = onSettings;
	}
	
	public int getOnSettings() {
		return onSettings;
	}
	
	public void turnOn() {
		System.out.println("You turn on the lamp.");
		switch (this.onSettings) {
		case 1:
			System.out.println("Lamp is on mode 1. Pretty dim still.");
			break;
		case 2:
			System.out.println("Lamp is on mode 2. Moderate lighting.");
			break;
		case 3:
			System.out.println("Lamp is on mode 3. It is so bright your eyes have been blinded.");
			break;
		default:
			System.out.println("You tried to put the lamp on "+onSettings+" But, it didn't have that mode so you got so frustrated that you threw the lamp out the window");
			break;
		}
		
	}

}
