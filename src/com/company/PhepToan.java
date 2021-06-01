package com.company;

public class PhepToan {
    private static PhepToan instance;
    private int count;

    private PhepToan() {
        // for singleton
    }

    public static PhepToan getInstance() {
        if (instance == null) {
            instance = new PhepToan();
        }
        return instance;
    }

    public double cong(int a, int b) {
        count++;
        return a + b;
    }

    public double tru(int a, int b) {
        count++;
        return a - b;
    }
}
