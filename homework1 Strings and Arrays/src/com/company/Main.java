package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main t= new Main();
        //q1
        int[] num1 ={1,2,3,2};
        int[] num2 ={1,1,1,1,1};
        int[] num3 ={1,2,3,4,5};
        System.out.println(t.getUniqueSum(num1));
        System.out.println(t.getUniqueSum(num2));
        System.out.println(t.getUniqueSum(num3));
        System.out.println(t.getUniqueSum("==============================");

        //q2
        int[] q2n1 ={-4,-1,0,3,,10};
        int[] q2n2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(t.arraySquare(q2n1)));
        System.out.println(Arrays.toString(t.arraySquare(q2n2)));
        System.out.println("===================================");

        //q3
        int[] q3t1 = {2, 3, 4, 2, 2, 3, 5, 7};
        int[] q3t2 = {0, 0, 1, 1};
        System.out.println(t.getFirstUnique(q3t1));
        System.out.println(t.getFirstUnique(q3t2));
        System.out.println("===================================");

        //q4
        String q4s1 = "a";
        String q4s11 = "b";
        String q4s2 = "aa";
        String q4s21 = "ab";
        String q4s3 = "aabb";
        String q4s31 = "cbavvbnba";
        System.out.println(t.canConstruct(q4s1, q4s11));
        System.out.println(t.canConstruct(q4s2, q4s21));
        System.out.println(t.canConstruct(q4s3, q4s31));
        System.out.println("===================================");

        //q5
        String q5t1 = "1A3d4s5t";
        String q5t2 = "A2bb2d4";
        System.out.println(t.isDigiCharSeq(q5t1));
        System.out.println(t.isDigiCharSeq(q5t2));
    }


    }
}
