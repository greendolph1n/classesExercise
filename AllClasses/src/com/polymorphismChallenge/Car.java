package com.polymorphismChallenge;

/**
 * @author derek
 *
 */
class Car {
	private boolean engine;
	private int cylinders, wheels;
	private String cylinderType;

	public Car(boolean engine, int cylinders, int wheels, String cylinderType) {
		super();
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.cylinderType = cylinderType;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public String getCylinderType() {
		return cylinderType;
	}

	public void startEngine() {
		System.out.println("Engine is running.");
	}

	public void accelerate() {
		System.out.println("Now accelerating");
	}

	public void brake() {
		System.out.println("Vehicle has braked");
	}
	
	public static void main(String[] args) {
		Car car= new ToyotaSienna(false,4,4,"Four cylinder",true);
		car.startEngine();
	}

}

class ToyotaSienna extends Car{
	private boolean broken;

	public ToyotaSienna(boolean engine, int cylinders, int wheels, String cylinderType, boolean brokenRadio) {
		super(engine, cylinders, wheels, cylinderType);
		this.broken = broken;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine is broken. Cannot start.");
		//super.startEngine();
	}
	
	
	
}




