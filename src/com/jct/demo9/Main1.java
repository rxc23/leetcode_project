package com.jct.demo9;


import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda表达式--方法引用
 *
 * @Author: 董杰
 * @Date:2021/5/13 11:17
 */
public class Main1 {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person("zhangsan", 12);
        people[1] = new Person("sili", 15);
        people[2] = new Person("wangwu", 18);
        people[3] = new Person("zhaoliu", 20);
        /**忽略名字大小写按照字典顺序进行排序
         * Person{name='sili', age=15}
         * Person{name='wangwu', age=18}
         * Person{name='zhangsan', age=12}
         * Person{name='zhaoliu', age=20}
         */
//        Arrays.sort(people, Comparator.comparing(Person::getName));
//          Arrays.sort(people, ((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())));

        /**按照名字长度进行排序
         * Person{name='sili', age=15}
         * Person{name='wangwu', age=18}
         * Person{name='zhaoliu', age=20}
         * Person{name='zhangsan', age=12}
         */
//        Arrays.sort(people,Comparator.comparing(Person::getName,((o1, o2) -> o1.length()-o2.length())));
//          Arrays.sort(people,(o1, o2) -> o1.getName().length()-o2.getName().length());

        /**按照年龄大小进行排序
         * Person{name='zhangsan', age=12}
         * Person{name='sili', age=15}
         * Person{name='wangwu', age=18}
         * Person{name='zhaoliu', age=20}
         */
        Arrays.sort(people, Comparator.comparing(Person::getAge, ((o1, o2) -> Integer.compare(o1, o2))));
        Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
