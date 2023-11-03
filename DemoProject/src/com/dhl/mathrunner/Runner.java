package com.dhl.mathrunner;

import com.dhl.math.Volume;

public class Runner {

	public static void main(String[] args) {
		//volume of Sphere
				double radius=10,height=8;
				double volumeS;
				volumeS=Volume.volumeOfSphere(radius);
				System.out.println("Volume of sphere ="+volumeS);
				
				//volume of Cylinder
				Volume Vol=new Volume();
				double volCyl=Vol.volumeOfCylinder(radius, height);
				System.out.println("Volume of Cylinder="+volCyl);
						
				//volume of a Pyramid
				
				
				//Volume of Cone

	}

}
