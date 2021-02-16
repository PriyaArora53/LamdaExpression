package com.modernjava;

public class IncrementByFiveTraditional implements IncrementByFive {
    @Override
    public int incrementByFive(int a) {
        return a+5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional obj = new IncrementByFiveTraditional();
        System.out.println(obj.incrementByFive(2));
    }
}
