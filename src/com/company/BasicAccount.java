package com.company;



public class BasicAccount implements IAccount {
    protected int AccountNumber;
    protected double withdrewLimit;
    protected double CurrentBalance;
    protected double Creditlimit;


    public BasicAccount(int AccountNumber, double withdrewLimit) {
        this.AccountNumber = AccountNumber;
        this.withdrewLimit = withdrewLimit;
        this.CurrentBalance = 0.0;
        this.Creditlimit = 0.0;


    }

    @Override
    public void Deposit(double amount) {
        this.CurrentBalance += amount;

    }

    @Override
    public double withdrew(double amount) {
        if (amount > this.withdrewLimit) {
            this.CurrentBalance = this.withdrewLimit;
            return this.withdrewLimit;

        } else {
            this.CurrentBalance -= amount;
            return amount;

        }

    }

    @Override
    public double getCurrentBalance() {
        return this.CurrentBalance;
    }

    @Override
    public int getAccountNumber() {
        return this.AccountNumber;
    }
}
