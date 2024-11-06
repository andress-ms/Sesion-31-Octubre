package models;

import interfaces.Actions;

public class Dog implements Actions  {

    private String breed;
    private int age;

    public Dog() {
    }

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void walk() {
        System.out.println("walking...");
        System.out.println("panting...");
    }

    @Override
    public void eat() {
        System.out.println("eating...");
        System.out.println("wagging tail");
    }
}
