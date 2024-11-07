package com.javaforfun.lambdafunctions;

public class MainGreeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet());

        // using lambda expression
        GreeterFunctionalInterface greeterFunction = () -> System.out.println("hello! using lambda");
        // calling the method.
        greeterFunction.printString();
        // calling default implemented method
        greeterFunction.printStr();

        AdditionInterface additionFunction = (int a, int b) -> a + b;
        System.out.println(additionFunction.add(0, 0));


        // passing lambda to function parameter
        greet(() -> System.out.println("hello! from parameter lamda"));
        // passing function variable as parameter
        greet(greeterFunction);
    }

    public static void greet(GreeterFunctionalInterface greeter){
        greeter.printString();
    }
}
