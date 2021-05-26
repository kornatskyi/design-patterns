package com.company;

public class Main {
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void main(String[] args) {

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

    }
}
