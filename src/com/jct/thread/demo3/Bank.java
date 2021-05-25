package com.jct.thread.demo3;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行转账对象
 *
 * @Author: dongjie
 * @Date: 2021/5/25 16:49
 */
public class Bank {
    private final double[] accounts;
    //创建非公平锁
    private Lock lock;
    //创建条件对象
    private Condition sufficeentFunds;

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
        lock = new ReentrantLock();
        sufficeentFunds = lock.newCondition();
    }

    /**
     * 转账
     *
     * @param from
     * @param to
     * @param amount
     */
    public void transfer(int from, int to, double amount) throws InterruptedException {
        lock.lock();
        try {
            while (accounts[from] < amount) {
                //线程被阻塞，释放锁
                sufficeentFunds.await();
            }
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("total balance:%10.2f%n", getTotalBalance());
            //线程被唤醒
            sufficeentFunds.signalAll();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 转账总金额
     *
     * @return
     */
    public double getTotalBalance() {
        lock.lock();
        try {
            double sum = 0;
            for (double a : accounts) {
                sum += a;
            }
            return sum;
        } finally {
            lock.unlock();
        }
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
