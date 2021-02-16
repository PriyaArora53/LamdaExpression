package com.modernjava;

public class ConcatenateLambda {
    public static void main(String[] args) {
        Concatenate obj = (a , b) -> a + " " + b;
        System.out.println( obj.sConcat("Hello", "World"));
    }
}
