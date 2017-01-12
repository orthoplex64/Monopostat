package com.cmurr.monopostat.spaces;

import java.awt.Color;
import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class ChanceSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final ChanceSpace CHANCE_LIGHT_BLUE = new ChanceSpace(0x000000);
	public static final ChanceSpace CHANCE_RED = new ChanceSpace(0x000000);
	public static final ChanceSpace CHANCE_DARK_BLUE = new ChanceSpace(0x000000);
	
	static {
		t.println("Start ChanceSpace init");
		CHANCE_LIGHT_BLUE.setPrev(StreetSpace.ORIENTAL);
		CHANCE_LIGHT_BLUE.setNext(StreetSpace.VERMONT);
		CHANCE_RED.setPrev(StreetSpace.KENTUCKY);
		CHANCE_RED.setNext(StreetSpace.INDIANA);
		CHANCE_DARK_BLUE.setPrev(RailroadSpace.SHORT);
		CHANCE_DARK_BLUE.setNext(StreetSpace.PARK);
		t.println("End ChanceSpace init");
	}
	
	public final Color color;
	
	private ChanceSpace(int rgb) {
		super();
		color = new Color(rgb, false);
	}
}
