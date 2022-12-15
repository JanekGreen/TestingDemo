package com.sda;

public class Account {
    private final String name;
    private int balance;
    private final int maxDebit;

    /**
     * withdraws money from an account
     * @param amount to withdraw
     * @return amount of money after the operation and
     * -1 if withdrawal was not possible because the amount to withdraw is too big
    * */
    public int withdraw(int amount){
        return -1;
    }
    /**
     * deposits money to an account
     * @param amount to deposit
     * @return amount of money after the operation
     * */
    public int deposit(int amount){
        return -1;
    }

    public Account(String name, int maxDebit) {
        this.name = name;
        this.maxDebit = maxDebit;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMaxDebit() {
        return maxDebit;
    }

}
