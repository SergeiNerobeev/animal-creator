package com.animal;

public class Duck extends Animal implements Flying {

    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Duck() {}

    @Override
    public void say()
    {
        System.out.println("Quack!");
    }

    public void fly()
    {
    System.out.println("I fly");
    }
   }
