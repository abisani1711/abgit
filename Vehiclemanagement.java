package com.vehicledekho;
import com.vehicledekho.data.*;
public class Vehiclemanagement {
	
 public static void main(String[] args){
	 Vehicle vehicle = new Vehicle();
		vehicle.setBrandName("Honda");
		vehicle.setFuelType("Petrol");
		vehicle.setQuantity(50);
	System.out.println("Vehicle brand name is:"+ vehicle.getBrandName());
	System.out.println("Vehicle fuel type is:"+ vehicle.getFuelType());
	System.out.println("Vehicle Quantity is:"+ vehicle.getQuantity());
 }
   
  
}

