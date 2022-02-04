package com.vehicledekho.data;
//import com.vehicledekho.*;
//import com.vehicledekho.ui.*;
public class Car extends Vehicle {
	public Car(){
	System.out.println("This is a car constructor");
	}
	 private int numberOfWheels;
	    private int modelNumber_car;
	    private int price_car;
	    
		public int getNumberOfWheels() {
			return numberOfWheels;
		}
		public void setNumberOfWheels(int numberOfWheels) {
			this.numberOfWheels = numberOfWheels;
		}
		public int getModelNumber_car() {
			return modelNumber_car;
		}
		public void setModelNumber_car(int modelNumber_car) {
			this.modelNumber_car = modelNumber_car;
		}
		public int getPrice_car() {
			return price_car;
		}
		public void setPrice_car(int price_car) {
			this.price_car = price_car;
		}

		public static void main(String[] args){
			 Car c1= new Car();
			 c1.setNumberOfWheels(4);
			 c1.setModelNumber_car(23456);
			 c1.setPrice_car(500000);
			 System.out.println("Model number is "+c1.getModelNumber_car()+" price is "+c1.getPrice_car()+" and number of wheels is "+c1.getNumberOfWheels());
		
			 Car c2= new Car();
			 c2.setNumberOfWheels(4);
			 c2.setModelNumber_car(2534456);
			 c2.setPrice_car(900000);
			 System.out.println("Model number is "+c2.getModelNumber_car()+" price is "+c2.getPrice_car()+" and number of wheels is "+c2.getNumberOfWheels());
		
		}
		
}
