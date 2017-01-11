package com.cmurr.monopostat;

import java.util.HashSet;
import java.util.Set;

import com.cmurr.monopostat.spaces.Space;

public class Board {
	
	private Set<Space> allSpaces;
	
	static {
		
	}
	
	public Board() {
		allSpaces = new HashSet<>();
	}
}