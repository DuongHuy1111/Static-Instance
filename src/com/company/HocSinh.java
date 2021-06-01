package com.company;

public class HocSinh {
    private String ten;
    private int tuoi;
    public static int count;

    public HocSinh(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
        count++;
    }

    @Override
    public String toString() {
        return ten + ":" + tuoi;
    }
}
