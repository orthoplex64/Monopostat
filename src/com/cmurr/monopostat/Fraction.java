package com.cmurr.monopostat;

public class Fraction extends Number {
	
	private static final long serialVersionUID = 1L;
	
	private int numer;
	private int denom;
	
	public static int gcd(int a, int b) {
		int temp = 0;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return Math.abs(a * b) / gcd(a, b);
	}
	
	public Fraction(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;
		if (this.numer < 0 && this.denom < 0) {
			this.numer *= -1;
			this.denom *= -1;
		}
		if ((this.numer ^ this.denom) >> 31 == 1) {
			this.numer |= 1 << 31;
			this.denom &= ~(1 << 31);
		}
		reduce();
	}
	
	public Fraction(int val) {
		this(val, 1);
	}
	
	public Fraction cl() {
		return new Fraction(numer, denom);
	}
	
	private Fraction reduce() {
		if (numer == 0) {
			if (denom == 0) {
				return this;
			} else {
				denom = 1;
				return this;
			}
		}
		if (denom == 0) {
			numer = 1;
			return this;
		}
		int gcd = gcd(Math.abs(numer), Math.abs(denom));
		numer /= gcd;
		denom /= gcd;
		return this;
	}
	
	public Fraction add(Fraction other) {
		int lcm = lcm(denom, other.denom);
		numer = numer * (lcm / denom) + other.numer * (lcm / other.denom);
		denom = lcm;
		return reduce();
	}
	
	public Fraction add(int val) {
		return add(new Fraction(val));
	}
	
	public Fraction subtract(Fraction other) {
		return add(other.cl().multiply(-1));
	}
	
	public Fraction subtract(int val) {
		return subtract(new Fraction(val));
	}
	
	public Fraction multiply(Fraction other) {
		numer *= other.numer;
		denom *= other.denom;
		return reduce();
	}
	
	public Fraction multiply(int val) {
		return multiply(new Fraction(val));
	}
	
	public Fraction divide(Fraction other) {
		numer *= other.denom;
		denom *= other.numer;
		return reduce();
	}
	
	public Fraction divide(int val) {
		return divide(new Fraction(val));
	}
	
	@Override
	public String toString() {
		return numer + "/" + denom;
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Fraction) {
			Fraction frac = (Fraction) other;
			// fractions will always be in reduced form, so just compare
			// numerator and denominator
			return numer == frac.numer && denom == frac.denom;
		}
		return false;
	}
	
	@Override
	public double doubleValue() {
		return (double) numer / denom;
	}
	
	@Override
	public float floatValue() {
		return (float) numer / denom;
	}
	
	@Override
	public int intValue() {
		return (int) doubleValue();
	}
	
	@Override
	public long longValue() {
		return (long) doubleValue();
	}
}
