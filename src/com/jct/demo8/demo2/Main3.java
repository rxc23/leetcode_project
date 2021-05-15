package com.jct.demo8.demo2;

import com.google.common.base.Supplier;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

/**
 * @Author: dongjie
 * @Date: 2021/5/15 15:34
 */
public class Main3 {
    @Test
    public void test1() {
        //old
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        runnable.run();

        //new
        Runnable lambda = () -> System.out.println("hello lambda");
        lambda.run();

        //old
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是匿名内部类创建线程");
            }
        }).start();

        //new
        new Thread(() -> System.out.println("这是lambda表达式创建线程")).start();
    }

    /**
     * 四大核心函数式接口
     * Consumer<T>：消费型接口
     * void accept(T t);
     * <p>
     * Supplier<T>：供给行接口
     * T get();
     * <p>
     * Function<T,R> : 函数型接口
     * R apply(T t);
     * <p>
     * Predicate<T> : 断言型接口
     * R apply(T t);
     */
    @Test
    public void test2() {
        // Consumer<T>：消费型接口
        Consumer<String> comsumer = e -> System.out.println("hello" + e);
        comsumer.accept("hello");

        // Supplier<T>：供给行接口
        Supplier<String> supplier = () -> "hello";
        System.out.println(supplier.get());

        //Function<T,R> : 函数型接口
        Function<Integer, Integer> function = (e) -> e * 10;
        Integer sum = function.apply(10);
        System.out.println(sum);

        //Predicate<T> : 断言型接口
        Predicate<String> predicate = e -> e.equals("hello world");
        System.out.println(predicate.test("hello"));
        System.out.println(predicate.test("hello world"));

    }

    /**
     * 方法引用：若 Lambda 体中的内容有方法已经实现，我们可以使用“方法引用”
     * （可以理解为方法引用是 Lambda 表达式的另外以中表现形式）
     * 主要有三种语法格式：
     * 对象::实列方法名
     * 类::静态方法名
     * 类::实列方法名
     * 注意：
     * 1. Lambda 体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的韩术列表和返回值保持一致！
     * 2. 若 Lambda 参数列表中的第一个参数是实例方法的调用者，而第二个参数是实例方法的参数时，可以用 ClassName::method
     * 数组引用：Type[]::new
     */

    @Test
    public void test3() {
        //对象::实列方法名
        Consumer<String> consumer = System.out::println;
        consumer.accept("hello world");

        Employee employee = new Employee(10);
        Supplier<Integer> supplier = employee::getAge;
        System.out.println(supplier.get());

        //类::静态方法名
        Comparator<Integer> compare = Integer::compare;
        System.out.println(compare.compare(1, 10));

        //构造器引用
        Function<Integer, Employee> function = Employee::new;
        System.out.println(function.apply(11));

        //数组引用：Type[]::new
        IntConsumer aNew = String[]::new;


    }
}
