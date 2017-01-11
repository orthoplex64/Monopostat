package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class UtilitySpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final UtilitySpace ELECTRIC = new UtilitySpace("ELECTRIC COMPANY", 150);
	public static final UtilitySpace WATER = new UtilitySpace("WATER WORKS", 150);
	
	static {
		t.println("Start UtilitySpace init");
		ELECTRIC.setPrev(StreetSpace.ST_CHARLES);
		ELECTRIC.setNext(StreetSpace.STATES);
		WATER.setPrev(StreetSpace.VENTNOR);
		WATER.setNext(StreetSpace.MARVIN);
		t.println("End UtilitySpace init");
	}
	
	public final String text;
	public final int price;
	
	private UtilitySpace(String text, int price) {
		this.text = text;
		this.price = price;
	}
}
