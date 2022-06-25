package com.will.hackerrank;

import java.util.ArrayList;
import java.util.List;

/*

https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
 */

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            if (n > 0) {
                posCount++;
            } else if (n == 0) {
                zeroCount++;
            } else {
                negCount++;
            }
        }
        System.out.printf("%.5f\n", (float) posCount / arr.size());
        System.out.printf("%.5f\n", (float) negCount / arr.size());
        System.out.printf("%.5f\n", (float) zeroCount / arr.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(-4);
        l.add(3);
        l.add(-9);
        l.add(0);
        l.add(4);
        l.add(1);
        plusMinus(l);
    }
}
