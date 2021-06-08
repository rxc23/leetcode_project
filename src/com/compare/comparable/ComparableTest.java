package com.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        User user1 = new User("张三", 10);
        User user2 = new User("李四", 20);
        User user3 = new User("王五", 30);
        User user4 = new User("赵六", 40);

        ArrayList<User> list = new ArrayList<>();
        list.add(user4);
        list.add(user2);
        list.add(user1);
        list.add(user3);
        Collections.sort(list);
        for (User user : list) {
            System.out.println(user.userName + "--" + user.age);
        }

    }
}
