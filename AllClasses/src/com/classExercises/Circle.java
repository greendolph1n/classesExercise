package com.classExercises;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		if (radius < 0) {
			radius = 0;
		}
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * (Math.pow(this.radius, 2));
	}
	
	
	public static void main(String[] args) {
		Circle circle=new Circle(5);
		System.out.println(circle.getArea());
		
	}

}
