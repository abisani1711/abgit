package com.vehicledekho.ui;

import java.util.List;

import com.vehicledekho.data.*;
import com.vehicledekho.main.*;


public class InformationDisplay {
//	public static void printVehicleDetails(Bike b1){
//		
//		System.out.println("Bike displacement are:" + b1.getDisplacement());
//		System.out.println("Bike has a dicky:" + b1.isDicky());
//		System.out.println("Bike has a side wheel attachment:" + b1.isSideWheelAttachment());
//		System.out.println("Bike displacement are:" + b1.getDisplacement());
//		System.out.println("Bike engine type is:" + b1.getEngineType());
//		System.out.println("Bike fuel capacity are:" + b1.getFuelCapacity());
//	}
//
//	public static void printVehicleDetails(Car c1) {
//		System.out.println("Car has a displacement of:" + c1.getDisplacement());
//		System.out.println("Car has a crash sensor:" + c1.isCrashSensor());
//		System.out.println("Number of airbags in car:" + c1.getNumberOfAirbags());
//		System.out.println("Car has power door locks:" + c1.isPowerDoorLocks());
//		System.out.println("Car has rear seatbelts:" + c1.isRearSeatBelts());
//		System.out.println("Seating Capacity of car:" + c1.getSeatingCapacity());
//		System.out.println("Engine type of car:" + c1.getEngineType());
//		
//		
//	}


	public static void informationDisplay(List<Vehicle> list) {
		
		for (Vehicle vehicle: list){
			System.out.println("================");
			System.out.println("");
			System.out.println("Dsiplacement: " + vehicle.getDisplacement());
			System.out.println("Engine Type: " + vehicle.getEngineType());
			System.out.println("Front Suspension: " + vehicle.getFrontSuspension());
			System.out.println("Rear Suspension: " + vehicle.getRearSuspension());
			System.out.println("Fuel capacity: " + vehicle.getFuelCapacity());
			System.out.println("Ground Clearance(in mm): " + vehicle.getGroundClearance());
			System.out.println("Maximum Torque: " + vehicle.getMaximumTorque());
			System.out.println("Transmission Type: " + vehicle.getTransmissionType());
			System.out.println("Price in Rs: " + vehicle.getPrice());
			if(vehicle instanceof Car){
				Car car = (Car)vehicle;
				System.out.println("The details of cars are listed above");
			}
			else if(vehicle instanceof Bike){
				Bike bike = (Bike)vehicle;
				System.out.println("The details of bike are listed above");
			}
		}
		
	}
	
	
}
