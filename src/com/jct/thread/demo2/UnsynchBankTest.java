package com.jct.thread.demo2;

/**
 * 银行转账
 *
 * @Author: dongjie
 * @Date: 2021/5/25 16:48
 */
public class UnsynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; ++i) {
            int fromAccount = i;
            //创建线程
            new Thread(() -> {
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double account = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, account);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {

                }
            }).start();
        }
    }
}
