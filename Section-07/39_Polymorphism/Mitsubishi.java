package com.ccagas;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
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
