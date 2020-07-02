package com.classExercises;

public class Carpet {
	private double cost;

	public Carpet(double cost) {
	//	super();
		if (cost<0) {
			cost=0;
		}
		this.cost = cost;
	}

	public double getCost() {
		return this.cost;
	}
	

}
