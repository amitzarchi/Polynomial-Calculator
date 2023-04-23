package tests;


import Entities.Rational;

public class testRational {
    public boolean testReduce(Rational r, Rational expectedResult) {
        return r.reduce().equals(expectedResult);
    }
    public boolean testAdd(Rational r1, Rational r2, Rational expectedResult) {
        return r1.add(r2).equals(expectedResult);
    }
    public boolean testMul(Rational r1, Rational r2, Rational expectedResult) {
        return r1.mul(r2).equals(expectedResult);
    }
    public boolean testNeg(Rational r, Rational expectedResult) {
        return r.neg().equals(expectedResult);
    }
    public boolean testPower(Rational r, int exponent, Rational expectedResult) {
        return r.power(exponent).equals(expectedResult);
    }
    public boolean testSign(Rational r, int sign) {
        return r.sign() == sign;
    }
    public boolean testEquals(Rational r1, Rational r2, boolean equal) {
        return r1.equals(r2) == equal;
    }
    public boolean testToString(Rational r, String expectedString) {
        return r.toString().equals(expectedString);
    }

    public void run(){
        final Rational r1 = new Rational(10, 20);
        final Rational reducedR1 = new Rational(1, 2);
        if (!testReduce(r1, reducedR1)) 
        {
            System.out.println("testRational.reduce Failed"); 
        }
        
        final Rational r2 = new Rational(3, 4);
        final Rational r3 = new Rational(1, 2);
        final Rational sum = new Rational(5, 4);
        if (!testAdd(r2, r3, sum))
        {
            System.out.println("testRational.add Failed"); 
        }
        final Rational mul = new Rational(3, 8);
        if (!testMul(r2, r3, mul))
        {
            System.out.println("testRational.testMul Failed"); 
        }
        final Rational rM2 = new Rational(3, -4);
        if (!testNeg(rM2, r2))
        {
            System.out.println("testRational.testNeg Failed"); 
        }
        final Rational pow = new Rational(81, 256);
        if (!testPower(r2, 4, pow))
        {
            System.out.println("testRational.testPower Failed"); 
        }
        if (!testSign(rM2, -1))
        {
            System.out.println("testRational.testSign Failed"); 
        }
        final Rational rrM2 = new Rational(-3, 4);
        if (!testEquals(rM2, rrM2, true))
        {
            System.out.println("testRational.testEquals Failed"); 
        }
        if (!testToString(rM2, "-3/4"))
        {
            System.out.println("testRational.testToString Failed"); 
        }
    }


        
    }
