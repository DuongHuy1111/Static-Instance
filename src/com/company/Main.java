package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Huy", 11);
        System.out.println(hs1);
        System.out.println(HocSinh.count);

        HocSinh hs2 = new HocSinh("Quang", 26);
        System.out.println(hs2);
        System.out.println(HocSinh.count);

        System.out.println("\n" + PhepToan.getInstance().cong(1, 1));
    }
}
