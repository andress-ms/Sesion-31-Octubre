package models;

import interfaces.Actions;

public class Cat implements Actions {
    private String color;
    private int age;

    public Cat() {
    }

    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void walk() {
        System.out.println("walking...");
        System.out.println("purring...");
    }

    @Override
    public void eat() {
        System.out.println("eating...");
        System.out.println("meowing...");
    }
}
