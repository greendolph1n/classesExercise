package com.compositionHouse;

public class Main {
	public static void main(String[] args) {
		
	

	
	Options options=new Options(1,false,1,false,false,false,false);
	options.Choices();
	
	
	Lamp lamp = new Lamp(options.getLampMode());
	Fan fan= new Fan(options.getFanMode(),options.isFanSwitch());
	Nintendo nintendo= new Nintendo(options.isNintendoPower(),"smash");
	Sick sick= new Sick(options.isDrankBadmilk());
	BoseSpeaker speaker= new BoseSpeaker(options.isSpeakerSwitch());
	
	
	Desk desk=new Desk(fan,lamp,speaker,nintendo,sick);
	desk.getFan().turnOn();
	desk.getLamp().turnOn();
	desk.getSpeaker().turnOn();
	desk.getNintendo().turnOn();
	desk.getSick().notFeelingWell();
	
	
	
	
}
}