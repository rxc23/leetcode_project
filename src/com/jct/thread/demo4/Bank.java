package com.jct.thread.demo4;

import java.util.Arrays;


/**
 * 银行转账对象
 *
 * @Author: dongjie
 * @Date: 2021/5/25 16:49
 */
public class Bank {
    private final double[] accounts;

    /**
     * 银行构造方法
     *
     * @param n
     * @param initialBalance
     */
    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        //给acounts填充值
        Arrays.fill(accounts, initialBalance);
    }

    /**
     * 转账
     *
     * @param from
     * @param to
     * @param amount
     */
    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        while (accounts[from] < amount) {
            //线程被阻塞，释放锁
            this.wait();
        }
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf("total balance:%10.2f%n", getTotalBalance());
        //线程被唤醒
        this.notifyAll();
    }


    /**
     * 转账总金额
     *
     * @return
     */
    public synchronized double getTotalBalance() {
        double sum = 0;
        for (double a : accounts) {
            sum += a;
        }
        return sum;
    }

    /**
     * 账户的大小
     *
     * @return
     */
    public int size() {
        return accounts.length;
    }
}
