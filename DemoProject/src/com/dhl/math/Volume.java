package com.dhl.math;

public class Volume {
	public static double volumeOfSphere(double r) {
	double volume=4*3.14*r*r*r/3;
		return volume;
	}

	public double volumeOfCylinder(double r,double h) {
		return 3.14*r*r*h;
		
	}

}
