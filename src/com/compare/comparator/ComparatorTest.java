package com.compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        User user1 = new User("张三", 10);
        User user2 = new User("李四", 20);
        User user3 = new User("王五", 30);
        User user4 = new User("赵六", 40);

        List<User> list = new ArrayList<>();
        list.add(user4);
        list.add(user2);
        list.add(user1);
        list.add(user3);

        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age - o2.age;  //按照年龄升序排序
//                return o2.age-o1.age;  按照年龄降序排序
//                return o1.age.compareTo(o2.age)  //同上
            }
        });

        for (User user : list) {
            System.out.println(user.userName + "---" + user.age);
        }
    }
}
