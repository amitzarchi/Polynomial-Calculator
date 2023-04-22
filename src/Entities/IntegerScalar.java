package Entities;

public class IntegerScalar implements Scalar {
    private int number;

    public IntegerScalar(int num) {
        this.number = num;
    }

    @Override
    public Scalar add(Scalar s) {
        return new IntegerScalar(this.getValue() + s.getValue());
    }

    @Override
    public Scalar mul(Scalar s) {
        return new IntegerScalar(this.getValue() * s.getValue());
    }

    @Override
    public Scalar neg() {
        return new IntegerScalar(-this.getValue());
    }

    @Override
    public Scalar power(int exponent) {
        return new IntegerScalar((int) Math.pow(this.getValue(), exponent));
    }

    @Override
    public int sign() {
        if (this.number > 0) {
            return 1;
        } else if (this.number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof IntegerScalar) {
            IntegerScalar i = (IntegerScalar) o;
            return this.getValue() == i.getValue();
        } else {
            return false;
        }
    }

    @Override
    public int getValue() {
        return this.number;
    }

    @Override
    public String toString() {
        return Integer.toString(this.number);
    }
}
