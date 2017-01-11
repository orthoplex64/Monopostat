package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class GoToJailSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final GoToJailSpace GO_TO_JAIL = new GoToJailSpace();
	
	static {
		t.println("Start GoToJailSpace init");
		GO_TO_JAIL.setPrev(StreetSpace.MARVIN);
		GO_TO_JAIL.setNext(StreetSpace.PACIFIC);
		t.println("End GoToJailSpace init");
	}
}
