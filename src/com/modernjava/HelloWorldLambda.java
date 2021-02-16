package com.modernjava;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld using Lambda

        /*HelloWorld helloWorldInterface = () -> {
            return "Hello World!!";
        }; */

        HelloWorld helloWorldInterface = () -> "Hello World!!";

        System.out.println(helloWorldInterface.sayHelloWorld());


    }
}
