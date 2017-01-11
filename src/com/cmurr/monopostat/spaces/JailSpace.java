package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class JailSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final JailSpace JAIL = new JailSpace();
	
	static {
		t.println("Start JailSpace init");
		JAIL.setPrev(StreetSpace.CONNECTICUT);
		JAIL.setNext(StreetSpace.ST_CHARLES);
		t.println("End JailSpace init");
	}
}
