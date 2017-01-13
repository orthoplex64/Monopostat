package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class FreeParkingSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final FreeParkingSpace FREE_PARKING = new FreeParkingSpace("Free Parking");
	
	static {
		t.println("Start FreeParkingSpace init");
		FREE_PARKING.setPrev(StreetSpace.NEW_YORK);
		FREE_PARKING.setNext(StreetSpace.KENTUCKY);
		t.println("End FreeParkingSpace init");
	}
	
	private FreeParkingSpace(String displayName) {
		super(displayName);
	}
}
