package Entities;


public class Monomial {

    private int exponent;
    private Scalar coefficient;

    private Scalar one = new IntegerScalar(1);
    private Scalar minusOne = new IntegerScalar(-1);
    private Scalar zero = new IntegerScalar(0);

    public Monomial(int exponent, Scalar coefficient) {
        if (exponent < 0)
            throw new IllegalArgumentException("Exponent can not be negative.");
        this.exponent = exponent;
        this.coefficient = coefficient;
    }

    public Monomial add(Monomial m) {
        if (m.getExponent() != exponent)
            return null;
        else {
            return new Monomial(exponent, coefficient.add(m.getCoefficient()));
        }
    }

    public Monomial mul(Monomial m) {
        return new Monomial(exponent + m.getExponent(), coefficient.mul(m.getCoefficient()));
    }

    public Scalar evaluate(Scalar s) {
        return coefficient.mul(s.power(exponent));
    }

    public Monomial derivative(){
        if (exponent == 0)
            return new Monomial(0, new IntegerScalar(0));
        else
            return new Monomial(exponent-1, coefficient.mul(new IntegerScalar(exponent)));
    }

    public int sign() {
        return coefficient.sign();
    }

    public boolean equals(Object o) {
        if (o instanceof Monomial) {
            Monomial m = (Monomial) o;
            return m.getCoefficient().equals(coefficient) && m.getExponent() == exponent;
        }
        else
            return false;
    }

    public String toString() {
        if (coefficient.equals(one) & exponent > 1 ) 
            return "x^" + exponent;
        else if (coefficient.equals(one) & exponent == 1 ) 
            return "x";
        else if (coefficient.equals(minusOne) & exponent == 1) 
            return "-x" + exponent;
        else if (coefficient.equals(minusOne) & exponent > 1) 
            return "-x^" + exponent;
        else if (coefficient.equals(zero)) 
            return "";
        else if (exponent == 0)
            return coefficient.toString();
        else if (exponent == 1)
            return coefficient.toString() + "x";
        else 
            return coefficient.toString()+ "x^" + exponent;
    }

    public int getExponent(){
        return exponent;
    }
    public Scalar getCoefficient(){
        return coefficient;
    }

}
