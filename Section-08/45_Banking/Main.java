package com.ccagas;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of the Philippine Islands");

        bank.addBranch("Muntinlupa");

        bank.addCustomer("Muntinlupa", "Candie", 50.05);
        bank.addCustomer("Muntinlupa", "Mar", 175.34);
        bank.addCustomer("Muntinlupa", "Rebel", 220.12);

        bank.addBranch("Makati");
        bank.addCustomer("Makati", "Riley", 150.54);

        bank.addCustomerTransaction("Muntinlupa", "Mar", 44.22);
        bank.addCustomerTransaction("Muntinlupa", "Mar", 12.44);
        bank.addCustomerTransaction("Muntinlupa", "Rebel", 1.65);

        bank.listCustomers("Muntinlupa", true);
//        bank.listCustomers("Makati", true);

    }
}
