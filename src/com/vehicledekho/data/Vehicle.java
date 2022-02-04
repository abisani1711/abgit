package com.vehicledekho.data;

import com.vehicledekho.main.Vehiclemanagement;


public class Vehicle extends Vehiclemanagement {
	
	public String displacement;
	public String engineType;
	public String maximumTorque;
	public String transmissionType;
	public int price;
	public int fuelCapacity;
	public int groundClearance;
	public String frontSuspension;
	public String rearSuspension;
	
public Vehicle(){
	System.out.println("==================");
	System.out.println("This is a vehicle constructor");
}

public String getDisplacement() {
	return displacement;
}

public void setDisplacement(String displacement) {
	this.displacement = displacement;
}

public String getEngineType() {
	return engineType;
}

public void setEngineType(String engineType) {
	this.engineType = engineType;
}

public String getMaximumTorque() {
	return maximumTorque;
}

public void setMaximumTorque(String maximumTorque) {
	this.maximumTorque = maximumTorque;
}

public String getTransmissionType() {
	return transmissionType;
}

public void setTransmissionType(String transmissionType) {
	this.transmissionType = transmissionType;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getFuelCapacity() {
	return fuelCapacity;
}

public void setFuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
}

public int getGroundClearance() {
	return groundClearance;
}

public void setGroundClearance(int groundClearance) {
	this.groundClearance = groundClearance;
}

public String getFrontSuspension() {
	return frontSuspension;
}

public void setFrontSuspension(String frontSuspension) {
	this.frontSuspension = frontSuspension;
}

public String getRearSuspension() {
	return rearSuspension;
}

public void setRearSuspension(String rearSuspension) {
	this.rearSuspension = rearSuspension;
}



}



