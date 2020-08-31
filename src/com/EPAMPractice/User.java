package com.EPAMPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int age;
    private int salary;
}
