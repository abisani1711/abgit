package com.vehicledekho.data;

//import com.vehicledekho.*;

public class Bike extends Vehicle{

	public boolean trunkBox;
	public boolean dicky;
	public boolean sideWheelAttachment;
	
	
	public Bike() {

		System.out.println("This is a bike constructor");
	}


	public boolean isTrunkBox() {
		return trunkBox;
	}


	public void setTrunkBox(boolean trunkBox) {
		this.trunkBox = trunkBox;
	}


	public boolean isDicky() {
		return dicky;
	}


	public void setDicky(boolean dicky) {
		this.dicky = dicky;
	}


	public boolean isSideWheelAttachment() {
		return sideWheelAttachment;
	}


	public void setSideWheelAttachment(boolean sideWheelAttachment) {
		this.sideWheelAttachment = sideWheelAttachment;
	}
   
 }

//constructor after variables
