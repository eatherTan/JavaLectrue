package com.example.designpattern.strategy;

public class Client {

    public static void main(String[] args) {

        AddStrategy addStrategy = new AddStrategy();
        Environment environment = new Environment(addStrategy);
        environment.calculate(3,4);

        SubtractStrategy subtractStrategy = new SubtractStrategy();
        environment.setStrategy(subtractStrategy);
        environment.calculate(3,4);

        MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
        environment.setStrategy(multiplyStrategy);
        environment.calculate(3,4);

        DivideStrategy divideStrategy = new DivideStrategy();
        environment.setStrategy(divideStrategy);
        environment.calculate(3,4);

    }
}
