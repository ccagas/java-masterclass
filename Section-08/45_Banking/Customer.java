package com.ccagas;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmt) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmt);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amt) {
        this.transactions.add(amt);
    }
}
