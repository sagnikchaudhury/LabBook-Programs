package com.cg;

public class CurrentAccount extends Account {
    private double overdraftLimit = getBalance();

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance())
            super.withdraw(amount);
        else
            System.out.println("Overdraft limit reached");
    }
}