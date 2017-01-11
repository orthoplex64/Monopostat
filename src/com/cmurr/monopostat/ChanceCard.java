package com.cmurr.monopostat;

public enum ChanceCard {
	
	JAIL("GO TO JAIL. GO DIRECTLY TO JAIL, DO NOT PASS GO, DO NOT COLLECT $200."),
	ANTIJAIL("GET OUT OF JAIL FREE. This card may be kept until needed or traded."),
	ADV_GO("ADVANCE TO GO. (COLLECT $200)"),
	ADV_BOARDWALK("ADVANCE TO BOARDWALK."),
	ADV_ILLINOIS("ADVANCE TO ILLINOIS AVENUE. IF YOU PASS GO, COLLECT $200."),
	ADV_ST_CHARLES("ADVANCE TO ST. CHARLES PLACE. IF YOU PASS GO, COLLECT $200."),
	ADV_NEAR_RAIL("ADVANCE TO THE NEAREST RAILROAD. If UNOWNED, you may buy it from the Bank. If OWNED, pay owner twice the rental to which they are otherwise entitled."),
	ADV_NEAR_RAIL2("ADVANCE TO THE NEAREST RAILROAD. If UNOWNED, you may buy it from the Bank. If OWNED, pay owner twice the rental to which they are otherwise entitled."),
	ADV_NEAR_UTIL("ADVANCE TO THE NEAREST UTILITY. If UNOWNED, you may buy it from the Bank. If OWNED, throw dice and pay owner ten times the amount thrown."),
	ADV_READING("TAKE A TRIP TO READING RAILROAD. IF YOU PASS GO, COLLECT $200."),
	REPAIRS("MAKE GENERAL REPAIRS ON ALL YOUR PROPERTY. FOR EACH HOUSE PAY $25, FOR EACH HOTEL PAY $100."),
	BUILDING_LOAN("YOUR BUILDING LOAN MATURES. COLLECT $150."),
	BANK_DIV("BANK PAYS YOU DIVIDEND OF $50."),
	SPEEDING("SPEEDING FINE $15."),
	CHAIRMAN("YOU HAVE BEEN ELECTED CHAIRMAN OF THE BOARD. PAY EACH PLAYER $50."),
	BACK_THREE("GO BACK THREE SPACES");
	
	public final String text;
	
	private ChanceCard(String text) {
		this.text = text;
	}
}
