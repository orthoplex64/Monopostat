package com.cmurr.monopostat;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cmurr.monopostat.spaces.*;

public class ProbsBoard implements Map<Space, Fraction> {
	
	private static final Set<Space> allSpaces = Space.getAllSpaces();
	private Map<Space, Fraction> probsMap;
	
	public ProbsBoard() {
		probsMap = new HashMap<>();
		putAll(new Fraction(0));
	}
	
	public ProbsBoard putAll(Fraction frac) {
		for (Space space : allSpaces) {
			probsMap.put(space, frac.cl());
		}
		return this;
	}
	
	public void printProbs(PrintStream t) {
		Space space = GoSpace.GO;
		do {
			t.println(space + ": " + get(space));
			space = space.getNext();
		} while (space != GoSpace.GO);
	}
	
	@Override
	public void clear() {
		probsMap.clear();
	}
	
	@Override
	public boolean containsKey(Object key) {
		return probsMap.containsKey(key);
	}
	
	@Override
	public boolean containsValue(Object value) {
		return probsMap.containsValue(value);
	}
	
	@Override
	public Set<Entry<Space, Fraction>> entrySet() {
		return probsMap.entrySet();
	}
	
	@Override
	public Fraction get(Object key) {
		return probsMap.get(key);
	}
	
	@Override
	public boolean isEmpty() {
		return probsMap.isEmpty();
	}
	
	@Override
	public Set<Space> keySet() {
		return probsMap.keySet();
	}
	
	@Override
	public Fraction put(Space key, Fraction value) {
		return probsMap.put(key, value);
	}
	
	@Override
	public void putAll(Map<? extends Space, ? extends Fraction> m) {
		probsMap.putAll(m);
	}
	
	@Override
	public Fraction remove(Object key) {
		return probsMap.remove(key);
	}
	
	@Override
	public int size() {
		return probsMap.size();
	}
	
	@Override
	public Collection<Fraction> values() {
		return probsMap.values();
	}
}
