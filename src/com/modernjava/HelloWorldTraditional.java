package com.modernjava;

public class HelloWorldTraditional implements HelloWorld {
    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println(helloWorldTraditional.sayHelloWorld());
    }
}
