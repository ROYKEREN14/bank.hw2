package com.company;

public class check {
    public check() {
    }

    public static void main(String[] args) {
        PremiumAccount pa = new PremiumAccount(1234);
        BasicAccount ba = new BasicAccount(1235, 400.0D);
        StandardAccount sa = new StandardAccount(1236, -500.0D);
        pa.Deposit(100.0D);
        ba.Deposit(100.0D);
        sa.Deposit(100.0D);
        double check1 = sa.withdrew(605.0D);
        double check2 = ba.withdrew(600.0D);
        Bank b = new Bank();
        b.OpenAccount(sa);
        b.OpenAccount(pa);
        b.OpenAccount(ba);
        b.CloseAccount(pa.AccountNumber);
        b.CloseAccount(sa.AccountNumber);
        b.GetAllAccountsInDebt();
        b.GetAllAccountsWithBalance(-800.0D);
    }
}
