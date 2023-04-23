package tests;


public class mainTester {
    public static void main(String[] args){
    
    final testIntegerScalar integerScalarTester = new testIntegerScalar();
    final testRational rationalTester = new testRational();
    final testMonomial monomialTester = new testMonomial();
    final testPolynomial polynomialTester = new testPolynomial();

    integerScalarTester.run();
    rationalTester.run();
    monomialTester.run();
    polynomialTester.run();
    }
}
