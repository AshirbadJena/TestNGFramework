package org.abstraction.java;

public class ChildAirIndia extends ParentAircraft {
	
	public static void main(String[] args) {
		//ParentAircraft pa=new ParentAircraft();
		//we cant make object of abstract class
		ChildAirIndia ca=new ChildAirIndia();
		ca.engine();
		ca.aircraftColor(); 
		
		
		
		
	}


	@Override
	public void aircraftColor() {
		// TODO Auto-generated method stub
		System.out.println("Body color red");
		
	}
	
}
