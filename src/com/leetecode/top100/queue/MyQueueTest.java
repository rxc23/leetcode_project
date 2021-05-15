package com.leetecode.top100.queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println("队列出队的第" + "1" + "个是：" + queue.pop());
        System.out.println("队列出队的第" + "2" + "个是：" + queue.pop());
        System.out.println("队列出队的第" + "3" + "个是：" + queue.pop());

    }
}
