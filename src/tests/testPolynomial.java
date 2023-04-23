package tests;

import java.util.LinkedList;
import java.util.List;

import Entities.IntegerScalar;
import Entities.Monomial;
import Entities.Polynomial;
import Entities.Scalar;
import Entities.Rational;


public class testPolynomial {
    public boolean testBuild(String s, Polynomial expectedPolynomial) {
        return Polynomial.build(s).equals(expectedPolynomial);
    }
    public boolean testAdd(Polynomial p1, Polynomial p2, Polynomial expectedResult) {
        return p1.add(p2).equals(expectedResult);
    }
    public boolean testMul(Polynomial p1, Polynomial p2, Polynomial expectedResult) {
        return p1.mul(p2).equals(expectedResult);
    }
    public boolean testEvaluate(Polynomial p, Scalar s, Scalar expectedResult) {
        return p.evaluate(s).equals(expectedResult);
    }
    public boolean testEquals(Polynomial p1, Polynomial p2, boolean equal) {
        return p1.equals(p2) == equal;
    }
    public boolean testToString(Polynomial p, String expectedString) {
        return p.toString().equals(expectedString);
    }
    public void run() {

        Monomial m1 = new Monomial(1,new IntegerScalar(1));
        Monomial m2 = new Monomial(2,new IntegerScalar(3));
        Monomial m3 = new Monomial(3,new Rational(-1,2));
        List<Monomial> mList = new LinkedList<>();
        mList.add(m1);        mList.add(m2);        mList.add(m3);
        Polynomial p1 = new Polynomial(mList);

        Monomial m4 = new Monomial(0,new IntegerScalar(5));
        Monomial m5 = new Monomial(1,new IntegerScalar(2));
        Monomial m6 = new Monomial(3,new Rational(4,1));
        Monomial m7 = new Monomial(4,new Rational(5,-1));
        List<Monomial> mList2 = new LinkedList<>();
        mList2.add(m4);        mList2.add(m5);        mList2.add(m6);          mList2.add(m7);
        Polynomial p2 = new Polynomial(mList2);

        Monomial m8 = new Monomial(0,new IntegerScalar(5));
        Monomial m9 = new Monomial(1,new Rational(3,1));        
        Monomial m10 = new Monomial(2,new IntegerScalar(3));
        Monomial m11 = new Monomial(3,new Rational(7,2));
        Monomial m12 = new Monomial(4,new Rational(-5,1));
        List<Monomial> mList3 = new LinkedList<>();
        mList3.add(m8);        mList3.add(m9);        mList3.add(m10);      mList3.add(m11);     mList3.add(m12);
        Polynomial p3 = new Polynomial(mList3);

        Monomial m13 = new Monomial(1,new IntegerScalar(5));
        Monomial m14 = new Monomial(2,new Rational(17,1));        
        Monomial m15 = new Monomial(3,new Rational(7,2));
        Monomial m16 = new Monomial(4,new Rational(3,1));
        Monomial m17 = new Monomial(5,new Rational(7,1));
        Monomial m18 = new Monomial(6,new Rational(-17,1));
        Monomial m19 = new Monomial(7,new Rational(5,2));

        List<Monomial> mList4 = new LinkedList<>();
        mList4.add(m13);        mList4.add(m14);        mList4.add(m15);      mList4.add(m16);     mList4.add(m17);     mList4.add(m18);     mList4.add(m19);
        Polynomial p4 = new Polynomial(mList4);


        if (!testBuild("0  1 3  1/-2", p1))
        {
            System.out.println("testPolynomial.testBuild Failed"); 
        }
        if (!testAdd(p1, p2, p3))
        {
            System.out.println("testPolynomial.testAdd Failed"); 
        }
        if (!testMul(p1, p2, p4))
        {
            System.out.println("testPolynomial.testMul Failed"); 
        }
        if (!testEvaluate(p1, new IntegerScalar(5), new Rational(35, 2)))
        {
            System.out.println("testPolynomial.testEvaluate Failed"); 
        }
        if (!testEquals(p1, p2, false))
        {
            System.out.println("testPolynomial.testEquals Failed"); 
        }
        if (!testToString(p1, "x + 3x^2 - 1/2x^3"))
        {
            System.out.println("testPolynomial.testToString Failed"); 
        }
    }

    }

