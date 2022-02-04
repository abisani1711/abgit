package com.vehicledekho.main;
import java.util.ArrayList;
import java.util.List;

import com.vehicledekho.data.*;
import com.vehicledekho.ui.*;
public class Vehiclemanagement {
	
	
	
	
 public static void main(String[] args){
	 
	 Bike b1 = new Bike();
	 b1.setDicky(true);
	 b1.setSideWheelAttachment(true);
	 b1.setTrunkBox(false);
	 b1.setDisplacement("149 cc");
	 b1.setEngineType("Liquid-cooled, 4-stroke, SOHC, 4-valve");
	 b1.setFuelCapacity(20);
	 b1.setFrontSuspension("Telescopic upside Down Fork (USD Fork), Dia. 37 mm");
	 b1.setRearSuspension("Linked-Type Monocross Suspension");
	 b1.setMaximumTorque("25 nm");
	 b1.setTransmissionType("Manual");
	 b1.setPrice(250000);
	 b1.setGroundClearance(170);
//	 InformationDisplay.printVehicleDetails(b1);
	 
	 
	 Car c1 = new Car();
	 c1.setCrashSensor(true);
	 c1.setNumberOfAirbags(2);
	 c1.setPowerDoorLocks(true);
	 c1.setRearSeatBelts(true);
	 c1.setSeatingCapacity(4);
	 c1.setDisplacement("1498 cc");
	 c1.setEngineType("1.5L TSI EVO with ACT");
	 c1.setFrontSuspension("McPherson Strut");
	 c1.setRearSuspension("Coupled Torsion Beam Axle");
	 c1.setMaximumTorque("250 nm");
	 c1.setTransmissionType("Automatic");
	 c1.setPrice(2500000);
	 c1.setGroundClearance(188);
	 c1.setFuelCapacity(260);
//	 InformationDisplay.printVehicleDetails(c1);
 
 Vehicle vehicles[] = new Vehicle[2];
	vehicles[0] = c1;
	vehicles[1] = b1;
	
	List<Vehicle> list = new ArrayList<Vehicle>();
	list.add(c1);
	list.add(b1);
	InformationDisplay.informationDisplay(list);
 }//small letter variable
 //remove quantity
 //make car and bike objects here
}

