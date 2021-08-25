package com.ccagas;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " " + getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " " + getName() + " -> startEngine()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " " + getName() + " -> startEngine()";
    }
}
