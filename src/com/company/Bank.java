package com.company;



import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    protected List<IAccount> lst = new ArrayList<>();

    public Bank() {
    }

    @Override
    public void OpenAccount(IAccount account) {
        if (!this.lst.contains(account)) {
            this.lst.add(account);
            System.out.println("entered succesfully");
        }
    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (int i = 0; i < this.lst.size(); ++i) {
            IAccount temp = (IAccount) this.lst.get(i);
            if (temp.getAccountNumber() == accountNumber) {
                if (temp.getCurrentBalance() < 0.0D) {
                    System.out.println("Sorry , you cant close your account while you in debt");
                } else {
                    this.lst.remove(i);
                    System.out.println("we succesfully removed you from the bank");
                }
            }
        }

    }


    @Override
    public List<IAccount> GetALLAccounts() {
        return this.lst;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> lstDebt = new ArrayList<>();

        for (int i = 0; i < this.lst.size(); ++i) {
            if (((IAccount) this.lst.get(i)).getCurrentBalance() < 0.0D) {
                lstDebt.add((IAccount) this.lst.get(i));
            }
        }

        return lstDebt;
    }


    @Override
    public List<IAccount> GetAllAccountsWithBalance(double BalanceAbove) {
        List<IAccount> lstBigger = new ArrayList();

        for(int i = 0; i < this.lst.size(); ++i) {
            if (((IAccount)this.lst.get(i)).getCurrentBalance() > BalanceAbove) {
                lstBigger.add((IAccount)this.lst.get(i));
            }
        }

        return lstBigger;
    }


}
