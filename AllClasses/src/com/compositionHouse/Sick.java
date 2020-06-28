package com.compositionHouse;

public class Sick {
boolean isSick;

public Sick(boolean isSick) {
	super();
	this.isSick = isSick;
}
public void notFeelingWell() {
	if(isSick) {
	System.out.println("You just vomited all over your desk. Who's gonna clean that? \n'No one, and definitly not me' you thought."
			+ "You decide to go to bed with a lump of stinky vomit on your desk.\n\n\n***THE END***");
	}
	else {
		System.out.println("For a second, you thought you were gonna throw up all over your desk.\nLuckily you realized you weren't sick. You decide to go downstairs"
				+ "\nto grab a warm glass of milk. Unfortunately, you fall down the stairs to your death. \n\n\n***THE END***" );
	}
}
}
