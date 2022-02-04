package com.vehicledekho.data;

//import com.vehicledekho.*;

public class Bike extends Vehicle{

	public Bike() {
		System.out.println("This is a bike constructor");
	}
    private int numberOfWheels;
    private int modelNumber;
    private int price;
    
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
 public static void main(String[] args){
	 Bike b1= new Bike();
	 b1.setNumberOfWheels(2);
	 b1.setModelNumber(234);
	 System.out.println("Model number is "+b1.getModelNumber()+" and number of wheels is "+b1.getNumberOfWheels());
 

	 Bike b2= new Bike();
	 b2.setNumberOfWheels(2);
	 b2.setModelNumber(7841);
	 System.out.println("Model number is "+b2.getModelNumber()+" and number of wheels is "+b2.getNumberOfWheels());
 
 }
}

