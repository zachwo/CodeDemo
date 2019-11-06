package com.oracle.task4;

public class ATM {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public ATM(Account account) {
        this.account = account;
    }

    public void saveMoney(double money){
        this.account.setBalance(this.account.getBalance()+money);
    }

    public void withdraw(double money) throws MyException{
        if(this.account.getBalance()>=money){
            this.account.setBalance(this.account.getBalance()-money);
        }else{
            throw new MyException("余额不足");
        }
    }
}
