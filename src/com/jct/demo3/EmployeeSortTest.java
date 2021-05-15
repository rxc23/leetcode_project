package com.jct.demo3;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("hh", 35000);
        staff[1] = new Employee("cc", 75000);
        staff[2] = new Employee("tt", 38000);

        Arrays.sort(staff);
        for (Employee e : staff) {
            System.out.println(e.toString());
        }
    }
}
