package com.cmurr.monopostat.spaces;

import java.io.PrintStream;

import com.cmurr.monopostat.Main;

public class TaxSpace extends Space {
	
	public static PrintStream t = Main.t;
	
	public static final TaxSpace TAX_INCOME = new TaxSpace("INCOME TAX", 200);
	public static final TaxSpace TAX_LUXURY = new TaxSpace("LUXURY TAX", 100);
	
	static {
		t.println("Start TaxSpace init");
		TAX_INCOME.setPrev(StreetSpace.BALTIC);
		TAX_INCOME.setNext(RailroadSpace.READING);
		t.println("End TaxSpace init");
	}
	
	public final String text;
	public final int amount;
	
	private TaxSpace(String text, int amount) {
		this.text = text;
		this.amount = amount;
	}
}