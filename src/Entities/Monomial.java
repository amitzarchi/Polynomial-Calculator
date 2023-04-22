package Entities;


public class Monomial {

    private int exponent;
    private Scalar coefficient;

    public Monomial(int exponent, Scalar coefficient) {
        if (exponent < 0)
            throw new IllegalArgumentException("Exponent can not be negative.");
        this.exponent = exponent;
        this.coefficient = coefficient;
    }

    public Monomial add(Monomial m) {
        if (m.getExponent() != exponent)
            return null;
        else
    }

    public int getExponent(){
        return exponent;
    }
    public Scalar getCoefficient(){
        return coefficient;
    }

}
