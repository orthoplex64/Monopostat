package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;
import com.cmurr.monopostat.Street;

public class StreetSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final StreetSpace MEDITERRANEAN = new StreetSpace(Street.MEDITERRANEAN);
	public static final StreetSpace BALTIC = new StreetSpace(Street.BALTIC);
	public static final StreetSpace ORIENTAL = new StreetSpace(Street.ORIENTAL);
	public static final StreetSpace VERMONT = new StreetSpace(Street.VERMONT);
	public static final StreetSpace CONNECTICUT = new StreetSpace(Street.CONNECTICUT);
	public static final StreetSpace ST_CHARLES = new StreetSpace(Street.ST_CHARLES);
	public static final StreetSpace STATES = new StreetSpace(Street.STATES);
	public static final StreetSpace VIRGINIA = new StreetSpace(Street.VIRGINIA);
	public static final StreetSpace ST_JAMES = new StreetSpace(Street.ST_JAMES);
	public static final StreetSpace TENNESSEE = new StreetSpace(Street.TENNESSEE);
	public static final StreetSpace NEW_YORK = new StreetSpace(Street.NEW_YORK);
	public static final StreetSpace KENTUCKY = new StreetSpace(Street.KENTUCKY);
	public static final StreetSpace INDIANA = new StreetSpace(Street.INDIANA);
	public static final StreetSpace ILLINOIS = new StreetSpace(Street.ILLINOIS);
	public static final StreetSpace ATLANTIC = new StreetSpace(Street.ATLANTIC);
	public static final StreetSpace VENTNOR = new StreetSpace(Street.VENTNOR);
	public static final StreetSpace MARVIN = new StreetSpace(Street.MARVIN);
	public static final StreetSpace PACIFIC = new StreetSpace(Street.PACIFIC);
	public static final StreetSpace NORTH_CAROLINA = new StreetSpace(Street.NORTH_CAROLINA);
	public static final StreetSpace PENNSYLVANIA = new StreetSpace(Street.PENNSYLVANIA);
	public static final StreetSpace PARK = new StreetSpace(Street.PARK);
	public static final StreetSpace BOARDWALK = new StreetSpace(Street.BOARDWALK);
	
	static {
		t.println("Start StreetSpace init");
		MEDITERRANEAN.setPrev(GoSpace.GO);
		MEDITERRANEAN.setNext(CommunityChestSpace.CHEST_BROWN);
		BALTIC.setPrev(CommunityChestSpace.CHEST_BROWN);
		BALTIC.setNext(TaxSpace.TAX_INCOME);
		ORIENTAL.setPrev(RailroadSpace.READING);
		ORIENTAL.setNext(ChanceSpace.CHANCE_LIGHT_BLUE);
		VERMONT.setPrev(ChanceSpace.CHANCE_LIGHT_BLUE);
		VERMONT.setNext(CONNECTICUT);
		CONNECTICUT.setPrev(VERMONT);
		CONNECTICUT.setNext(JailSpace.JAIL);
		ST_CHARLES.setPrev(JailSpace.JAIL);
		ST_CHARLES.setNext(UtilitySpace.ELECTRIC);
		STATES.setPrev(UtilitySpace.ELECTRIC);
		STATES.setNext(VIRGINIA);
		VIRGINIA.setPrev(STATES);
		VIRGINIA.setNext(RailroadSpace.PENNSYLVANIA);
		ST_JAMES.setPrev(RailroadSpace.PENNSYLVANIA);
		ST_JAMES.setNext(CommunityChestSpace.CHEST_ORANGE);
		TENNESSEE.setPrev(CommunityChestSpace.CHEST_ORANGE);
		TENNESSEE.setNext(NEW_YORK);
		NEW_YORK.setPrev(TENNESSEE);
		NEW_YORK.setNext(FreeParkingSpace.FREE_PARKING);
		KENTUCKY.setPrev(FreeParkingSpace.FREE_PARKING);
		KENTUCKY.setNext(ChanceSpace.CHANCE_RED);
		INDIANA.setPrev(ChanceSpace.CHANCE_RED);
		INDIANA.setNext(ILLINOIS);
		ILLINOIS.setPrev(INDIANA);
		ILLINOIS.setNext(RailroadSpace.B_AND_O);
		ATLANTIC.setPrev(RailroadSpace.B_AND_O);
		ATLANTIC.setNext(VENTNOR);
		VENTNOR.setPrev(ATLANTIC);
		VENTNOR.setNext(UtilitySpace.WATER);
		MARVIN.setPrev(UtilitySpace.WATER);
		MARVIN.setNext(GoToJailSpace.GO_TO_JAIL);
		PACIFIC.setPrev(GoToJailSpace.GO_TO_JAIL);
		PACIFIC.setNext(NORTH_CAROLINA);
		NORTH_CAROLINA.setPrev(PACIFIC);
		NORTH_CAROLINA.setNext(CommunityChestSpace.CHEST_GREEN);
		PENNSYLVANIA.setPrev(CommunityChestSpace.CHEST_GREEN);
		PENNSYLVANIA.setNext(RailroadSpace.SHORT);
		PARK.setPrev(ChanceSpace.CHANCE_DARK_BLUE);
		PARK.setNext(TaxSpace.TAX_LUXURY);
		BOARDWALK.setPrev(TaxSpace.TAX_LUXURY);
		BOARDWALK.setNext(GoSpace.GO);
		t.println("End StreetSpace init");
	}
	
	public final Street street;
	
	private StreetSpace(Street street) {
		super(street.name);
		this.street = street;
	}
}
