package Entities;

public class Rational implements Scalar{
	
	private int numerator;
	private int denominator;
	
    public Rational(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    private int gcd(int a, int b) 
    {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
}
