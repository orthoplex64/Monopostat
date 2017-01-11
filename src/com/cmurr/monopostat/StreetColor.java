package com.cmurr.monopostat;

import java.awt.Color;

public enum StreetColor {
	
	BROWN(0x955436),
	LIGHT_BLUE(0xAAE0FA),
	PINK(0xD93A96),
	ORANGE(0xF7941D),
	RED(0xED1B24),
	YELLOW(0xFEF200),
	GREEN(0x1FB25A),
	DARK_BLUE(0x0072BB);
	
	public final Color color;
	
	private StreetColor(int rgb) {
		color = new Color(rgb, false);
	}
}
