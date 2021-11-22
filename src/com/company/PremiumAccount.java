package com.company;




    public class PremiumAccount implements IAccount {
        protected int AccountNumber;
        protected double CurrentBalance;

        public PremiumAccount(int AccountNumber) {
            this.AccountNumber = AccountNumber;

        }

        @Override
        public void Deposit(double amount) {
            this.CurrentBalance += amount;
        }

        @Override
        public double withdrew(double amount) {
            this.CurrentBalance -= amount;
            return amount;
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
