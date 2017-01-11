package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class GoSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final GoSpace GO = new GoSpace();
	
	static {
		t.println("Start GoSpace init");
		GO.setPrev(StreetSpace.BOARDWALK);
		GO.setNext(StreetSpace.MEDITERRANEAN);
		t.println("End GoSpace init");
	}
}
