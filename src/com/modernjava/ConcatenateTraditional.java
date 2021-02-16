package com.modernjava;

public class ConcatenateTraditional implements Concatenate {
    @Override
    public String sConcat(String a, String b) {
        return a+b;
    }

    public static void main(String[] args) {
        ConcatenateTraditional obj = new ConcatenateTraditional();
        System.out.println(obj.sConcat("Hello ", "World!!"));
    }
}
