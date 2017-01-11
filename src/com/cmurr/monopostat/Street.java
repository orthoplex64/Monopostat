package com.cmurr.monopostat;

public enum Street {
	
	MEDITERRANEAN(StreetColor.BROWN, "MEDITERRANEAN AVENUE", 60),
	BALTIC(StreetColor.BROWN, "BALTIC AVENUE", 60),
	ORIENTAL(StreetColor.LIGHT_BLUE, "ORIENTAL AVENUE", 100),
	VERMONT(StreetColor.LIGHT_BLUE, "VERMONT AVENUE", 100),
	CONNECTICUT(StreetColor.LIGHT_BLUE, "CONNECTICUT AVENUE", 120),
	ST_CHARLES(StreetColor.PINK, "ST. CHARLES PLACE", 140),
	STATES(StreetColor.PINK, "STATES AVENUE", 140),
	VIRGINIA(StreetColor.PINK, "VIRGINIA AVENUE", 160),
	ST_JAMES(StreetColor.ORANGE, "ST. JAMES PLACE", 180),
	TENNESSEE(StreetColor.ORANGE, "TENNESSEE AVENUE", 180),
	NEW_YORK(StreetColor.ORANGE, "NEW YORK AVENUE", 200),
	KENTUCKY(StreetColor.RED, "KENTUCKY AVENUE", 220),
	INDIANA(StreetColor.RED, "INDIANA AVENUE", 220),
	ILLINOIS(StreetColor.RED, "ILLINOIS AVENUE", 240),
	ATLANTIC(StreetColor.YELLOW, "ATLANTIC AVENUE", 260),
	VENTNOR(StreetColor.YELLOW, "VENTNOR AVENUE", 260),
	MARVIN(StreetColor.YELLOW, "MARVIN GARDENS", 280),
	PACIFIC(StreetColor.GREEN, "PACIFIC AVENUE", 300),
	NORTH_CAROLINA(StreetColor.GREEN, "NORTH CAROLINA AVENUE", 300),
	PENNSYLVANIA(StreetColor.GREEN, "PENNSYLVANIA AVENUE", 320),
	PARK(StreetColor.DARK_BLUE, "PARK PLACE", 350),
	BOARDWALK(StreetColor.DARK_BLUE, "BOARDWALK", 400);
	
	public final StreetColor color;
	public final String name;
	public final int price;
	
	private Street(StreetColor color, String name, int price) {
		this.color = color;
		this.name = name;
		this.price = price;
	}
}