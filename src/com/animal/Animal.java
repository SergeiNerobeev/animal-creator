package com.animal;

import java.util.Objects;
import java.util.Scanner;
    public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

        public Animal(String name, int age, int weight, String color) {
            this.name = name;

            this.age = age;
            this.weight = weight;
            this.color = color;
        }
        public Animal(){}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void say()
        {
            System.out.println("I say");
        }
        public void eat()
        {
            System.out.println("I eat");
        }
        public void drink()
        {
            System.out.println("I drink");
        }

        @Override
    public String toString() {
            if(age == 1) {
            return "Hi! " +
                    "My name is " + name +
                    ", I am " + age + " god" +
                    ", I am " + weight + " kilos" +
                    ", I am " + color + ".";
        }else if(age == 21 ){                    // Animals do not live more than 21 years.
            return "Hi! " +
                    "My name is " + name +
                    ", I am " + age + " god" +
                    ", I am " + weight + " kilos" +
                    ", I am " + color + ".";
        }else if(age > 4 ){
            return "Hi! " +
                    "My name is " + name +
                    ", I am " + age + " let" +
                    ", I am " + weight + " kilos" +
                    ", I am " + color + ".";
        }else{
            return "Hi! " +
                    "My name is " + name +
                    ", I am " + age + " goda" +
                    ", I am " + weight + " kilos" +
                    ", I am " + color + ".";
        }
   }
}