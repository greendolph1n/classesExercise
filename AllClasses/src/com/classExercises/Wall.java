package com.classExercises;

public class Wall {
	private double width;
	private double height;

	public Wall() {
		// super();
	}

	public Wall(double width, double height) {
		// super();
		if (width < 0) {
			width = 0;
		}
		if (height < 0) {
			height = 0;
		}
		this.width = width;
		this.height = height;
	}

	public void setWidth(double width) {
		if(width<0) {
			width=0;
		}
		this.width = width;
	}

	public void setHeight(double height) {
		if(height<0) {
			height=0;
		}
		this.height = height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getArea() {
		return (this.width*this.height);
	}
}
