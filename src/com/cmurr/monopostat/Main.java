package com.cmurr.monopostat;

import java.io.PrintStream;

public class Main {
	
	public static PrintStream t = System.out;
	
	public static void main(String[] args) throws Throwable {
		t.println("Start main");
		Board board = new Board();
		t.println("End main");
	}
}
