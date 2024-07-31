package com.company;

public class TestException extends DivisionException {

    public TestException(String e) {
        super(e);
    }

    static void divide(int a, int b) throws DivisionException {
        if (b == 0)
            throw new DivisionException("Denominator cannot be zero");
    }

    public static void main(String[] args) {
        try {
            divide(5, 0);
        }
//        catch (DivisionException e) {
//            throw new DivisionException();
//        }
        finally {
            System.out.println("executed");
        }
    }

}
