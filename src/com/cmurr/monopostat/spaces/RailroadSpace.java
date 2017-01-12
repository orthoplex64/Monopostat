package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class RailroadSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final RailroadSpace READING = new RailroadSpace("READING RAILROAD");
	public static final RailroadSpace PENNSYLVANIA = new RailroadSpace("PENNSYLVANIA RAILROAD");
	public static final RailroadSpace B_AND_O = new RailroadSpace("B. & O. RAILROAD");
	public static final RailroadSpace SHORT = new RailroadSpace("SHORT LINE");
	
	static {
		t.println("Start RailroadSpace init");
		READING.setPrev(TaxSpace.TAX_INCOME);
		READING.setNext(StreetSpace.ORIENTAL);
		PENNSYLVANIA.setPrev(StreetSpace.VIRGINIA);
		PENNSYLVANIA.setNext(StreetSpace.ST_JAMES);
		B_AND_O.setPrev(StreetSpace.ILLINOIS);
		B_AND_O.setNext(StreetSpace.ATLANTIC);
		SHORT.setPrev(StreetSpace.PENNSYLVANIA);
		SHORT.setNext(ChanceSpace.CHANCE_DARK_BLUE);
		t.println("End RailroadSpace init");
	}
	
	public final String text;
	
	private RailroadSpace(String text) {
		super();
		this.text = text;
	}
}
