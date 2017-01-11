package com.cmurr.monopostat.spaces;

public abstract class Space {
	
	protected Space prev;
	protected Space next;
	
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
