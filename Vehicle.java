package com.vehicledekho.data;

import com.vehicledekho.Vehiclemanagement;


public class Vehicle extends Vehiclemanagement {
private int Quantity;
private String brandName;
private String fuelType;

public Vehicle() {
	System.out.println("This is a vehicle constructor");
}

public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}


public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}



public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

public static void main(String[] args){
	 
	
	 
}

}



