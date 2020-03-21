package com.example.designpattern.strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
