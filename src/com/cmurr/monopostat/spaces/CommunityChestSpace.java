package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class CommunityChestSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final CommunityChestSpace CHEST_BROWN = new CommunityChestSpace("Community Chest (first)");
	public static final CommunityChestSpace CHEST_ORANGE = new CommunityChestSpace("Community Chest (second)");
	public static final CommunityChestSpace CHEST_GREEN = new CommunityChestSpace("Community Chest (third)");
	
	static {
		t.println("Start CommunityChestSpace init");
		CHEST_BROWN.setPrev(StreetSpace.MEDITERRANEAN);
		CHEST_BROWN.setNext(StreetSpace.BALTIC);
		CHEST_ORANGE.setPrev(StreetSpace.ST_JAMES);
		CHEST_ORANGE.setNext(StreetSpace.TENNESSEE);
		CHEST_GREEN.setPrev(StreetSpace.NORTH_CAROLINA);
		CHEST_GREEN.setNext(StreetSpace.PENNSYLVANIA);
		t.println("End CommunityChestSpace init");
	}
	
	private CommunityChestSpace(String displayName) {
		super(displayName);
	}
}
