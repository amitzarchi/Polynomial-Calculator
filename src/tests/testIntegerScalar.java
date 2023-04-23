package tests;
import Entities.IntegerScalar;

public class testIntegerScalar {

    public boolean testAdd(IntegerScalar n1, IntegerScalar n2, IntegerScalar expectedResult) {
        return n1.add(n2).equals(expectedResult);
    }
    public boolean testMul(IntegerScalar n1, IntegerScalar n2, IntegerScalar expectedResult) {
        return n1.mul(n2).equals(expectedResult);
    }
    public boolean testNeg(IntegerScalar n, IntegerScalar expectedResult) {
        return n.neg().equals(expectedResult);
    }
    public boolean testPower(IntegerScalar n, int exponent, IntegerScalar expectedResult) {
        return n.power(exponent).equals(expectedResult);
    }
    public boolean testSign(IntegerScalar n, int sign) {
        return n.sign() == sign;
    }
    public boolean testEquals(IntegerScalar n1, IntegerScalar n2, boolean equal) {
        return n1.equals(n2) == equal;
    }
    public boolean testToString(IntegerScalar n, String expectedString) {
        return n.toString().equals(expectedString);
    }


    public void run() {
        final IntegerScalar n2 = new IntegerScalar(2);
        final IntegerScalar n7 = new IntegerScalar(7);
        final IntegerScalar nn7 = new IntegerScalar(7);
        final IntegerScalar n5 = new IntegerScalar(5);
        final IntegerScalar nM5 = new IntegerScalar(-5);
        final IntegerScalar nM10 = new IntegerScalar(-10);
        final IntegerScalar nM125 = new IntegerScalar(-125);

        if(!testAdd(n5, n2, n7))
            {
            System.out.println("testIntegerScalar.testAdd Failed"); 
            }
        if(!testMul(nM5, n2, nM10)) 
            {
            System.out.println("testIntegerScalar.testMul Failed"); 
            }
        if(!testNeg(nM5, n5)) 
            {
            System.out.println("testIntegerScalar.testNeg Failed"); 
            }

        if(!testPower(nM5, 3, nM125)) 
            {
            System.out.println("testIntegerScalar.testPower Failed"); 
            }

        if(!testSign(nM5, -1)) 
            {
            System.out.println("testIntegerScalar.testSign Failed"); 
            }

        if(!testEquals(n7, nn7, true)) 
            {
            System.out.println("testIntegerScalar.testEquals Failed"); 
            }

        if(!testToString(nM125, "-125")) 
            {
            System.out.println("testIntegerScalar.testToString Failed"); 
            }
    }
}
