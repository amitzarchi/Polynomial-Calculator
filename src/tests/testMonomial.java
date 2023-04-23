package tests;

import Entities.Monomial;
import Entities.Rational;
import Entities.Scalar;

public class testMonomial {
    public boolean testAdd(Monomial m1, Monomial m2, Monomial expectedResult) {
        return m1.add(m2).equals(expectedResult);
    }
    public boolean testMul(Monomial m1, Monomial m2, Monomial expectedResult) {
        return m1.mul(m2).equals(expectedResult);
    }
    public boolean testEvaluate(Monomial m, Scalar s, Scalar expectedResult) {
        return m.evaluate(s).equals(expectedResult);
    }
    public boolean testDerivative(Monomial m, Monomial expectedResult) {
        return m.derivative().equals(expectedResult);
    }
    public boolean testSign(Monomial m, int sign) {
        return m.sign() == sign;
    }
    public boolean testEquals(Monomial m1, Monomial m2, boolean equal) {
        return m1.equals(m2) == equal;
    }
    public boolean testToString(Monomial m, String expectedString) {
        return m.toString().equals(expectedString);
    }
    public void run(){
        final Monomial m1 = new Monomial(3, new Rational(8,3));
        final Monomial m2 = new Monomial(3, new Rational(7 ,6));        
        final Monomial sum = new Monomial(3, new Rational(23 ,6));        
        if (!testAdd(m1, m2, sum))
        {
            System.out.println("testMonomial.testAdd Failed"); 
        }
        final Monomial mul = new Monomial(6, new Rational(28, 9));
        if (!testMul(m1, m2, mul))
        {
            System.out.println("testMonomial.testMul Failed"); 
        }
        if (!testEvaluate(m1, new Rational(8,2), new Rational(512, 3)))
        {
            System.out.println("testMonomial.testEvaluate Failed"); 
        }
        final Monomial m1d = new Monomial(2, new Rational(8,1));
        if (!testDerivative(m1, m1d))
        {
            System.out.println("testMonomial.testDerivative Failed"); 
        }
        final Monomial mM2 = new Monomial(3, new Rational(7 ,-6));        
        if (!testSign(mM2, -1))
        {
            System.out.println("testMonomial.testSign Failed"); 
        }
        final Monomial mM22 = new Monomial(3, new Rational(7 ,-6));        

        if (!testEquals(mM2, mM22, true))
        {
            System.out.println("testMonomial.testEquals Failed"); 
        }
        if (!testToString(mM2, "-7/6x^3"))
        {
            System.out.println(mM2.toString()); 

            System.out.println("testMonomial.testToString Failed"); 
        }
    }


}
