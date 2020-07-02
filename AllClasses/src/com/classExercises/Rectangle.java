package com.classExercises;

public class Rectangle {
	private double width, length;

	public Rectangle(double width, double length) {
		super();
		if (width < 0) {
			width = 0;
		}
		if (length < 0) {
			length = 0;
		}
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

	public double getArea() {
		return this.length * this.width;

	}

}
