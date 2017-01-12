package com.cmurr.monopostat.spaces;

import java.io.PrintStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.cmurr.monopostat.Main;

public abstract class Space {
	
	public static PrintStream t = Main.t;
	
	protected Space prev;
	protected Space next;
	
	private static Set<Space> allSpaces = new HashSet<>();
	
	static {
		t.println("Start Space init");
		// load all spaces
		GoSpace.GO.equals(null);
		t.println("End Space init");
	}
	
	protected Space() {
		allSpaces.add(this);
	}
	
	public static Set<Space> getAllSpaces() {
		return Collections.unmodifiableSet(allSpaces);
	}
	
	public Space getPrev() {
		return prev;
	}
	
	public Space getNext() {
		return next;
	}
	
	public void setPrev(Space space) {
		prev = space;
	}
	
	public void setNext(Space space) {
		next = space;
	}
}
