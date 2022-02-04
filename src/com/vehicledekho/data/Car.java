package com.vehicledekho.data;
//import com.vehicledekho.*;
//import com.vehicledekho.ui.*;
public class Car extends Vehicle {
	
	public int seatingCapacity;
	public int numberOfAirbags;
	public boolean powerDoorLocks;
	public boolean rearSeatBelts;
	public boolean crashSensor;
	
	public Car(){
	System.out.println("This is a car constructor");
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getNumberOfAirbags() {
		return numberOfAirbags;
	}

	public void setNumberOfAirbags(int numberOfAirbags) {
		this.numberOfAirbags = numberOfAirbags;
	}

	public boolean isPowerDoorLocks() {
		return powerDoorLocks;
	}

	public void setPowerDoorLocks(boolean powerDoorLocks) {
		this.powerDoorLocks = powerDoorLocks;
	}

	public boolean isRearSeatBelts() {
		return rearSeatBelts;
	}

	public void setRearSeatBelts(boolean rearSeatBelts) {
		this.rearSeatBelts = rearSeatBelts;
	}

	public boolean isCrashSensor() {
		return crashSensor;
	}

	public void setCrashSensor(boolean crashSensor) {
		this.crashSensor = crashSensor;
	}
	
		
}
