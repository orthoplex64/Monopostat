package com.cmurr.monopostat;

import java.io.PrintStream;

import com.cmurr.monopostat.spaces.GoSpace;

public class Main {
	
	public static PrintStream t = System.out;
	
	public static void main(String[] args) throws Throwable {
		t.println("Start main");
		ProbsBoard probs = new ProbsBoard();
		ProbsBoard nextProbs = new ProbsBoard();
		ProbsBoard averageVisits = new ProbsBoard();
		probs.put(GoSpace.GO, new Fraction(1));
		for (int turn = 0; turn < 10; turn++) {
			t.println("Turn " + turn + ":");
			probs.printProbs(t);
		}
//		Fraction f1 = new Fraction(2,3);
//		Fraction f2 = new Fraction(5,6);
//		t.println(f1);
//		t.println(f2);
//		t.println(f1.cl().add(f2).divide(2));
//		t.println(Fraction.gcd(17, 12));
		t.println("End main");
	}
}
