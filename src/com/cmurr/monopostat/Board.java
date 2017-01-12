package com.cmurr.monopostat;

import com.cmurr.monopostat.spaces.Space;

public class Board {
	
	private ClassMap allSpaces;
	
	public Board() {
		allSpaces = new ClassMap();
		for (Space space : Space.getAllSpaces()) {
			allSpaces.add(space);
		}
	}
}
