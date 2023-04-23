package Entities;
import java.lang.Math;


public class Rational implements Scalar{
	
	private int numerator;
	private int denominator;
	
    public Rational(int numerator, int denominator)
    {        
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    private int gcd(int a, int b) 
    {
        if (b == 0) 
            return a;
        else 
            return gcd(b, a % b);
        
    }

    public Rational reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;
        return new Rational(reducedNumerator, reducedDenominator);
    }

    public Scalar add(Scalar s) {
        int outputNumerator = numerator * s.getDenominator() + s.getNumerator() * denominator;
        int outputDenominator = denominator * s.getDenominator();
        return new Rational(outputNumerator, outputDenominator).reduce();
      }

    public Scalar mul(Scalar s) {
        int outputNumerator = numerator * s.getNumerator();
        int outputDenominator = denominator * s.getDenominator();
        return new Rational(outputNumerator, outputDenominator).reduce();
      }

    public Scalar neg() {
        return new Rational(-numerator, denominator);
      }
     
    public Scalar power(int exponent) {
        int outputNumerator = (int) Math.pow(numerator,exponent);
        int outputDenominator = (int) Math.pow(denominator,exponent);
        return new Rational(outputNumerator, outputDenominator).reduce();
      }

    public int sign() {
        if (numerator > 0) 
          return 1;
        else if (numerator < 0) 
          return -1;
        else 
          return 0;
        
      }

    public boolean equals(Object o) {
        if (o instanceof Scalar) {
            Rational r = (Rational) o;
            return numerator == r.getNumerator() && denominator == r.getDenominator();
        }
        else 
            return false;
    }

    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        } 
        else {
            return numerator + "/" + denominator;
        }             
    }
    
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
