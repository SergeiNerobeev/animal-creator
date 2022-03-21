package com.animal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList <Animal> animals = new ArrayList<>();

        while (true) {

            System.out.println();
            System.out.println("--------------Type command: add/list/exit--------------");

            String chose = scanner.next().trim().toUpperCase(Locale.ROOT);
            Command command = Command.valueOf(chose.trim().toUpperCase(Locale.ROOT));

            switch (command) {

                case ADD -> {

                    System.out.println("-------Which animal do you choose: cat/dog/duck?-------");
                    String typeOfAnimal = scanner.next().trim().toUpperCase(Locale.ROOT).toLowerCase(Locale.ROOT);

                    switch (typeOfAnimal) {
                        case "cat"-> {

                            Animal animal = new Cat();
                            animalCreator(animal, scanner);
                            animals.add(animal);
                         
                        }
                        case "dog" -> {

                            Animal animal = new Dog();
                            animalCreator(animal, scanner);
                            animals.add(animal);
                                                    }
                        case "duck" -> {

                            Animal animal = new Duck();
                            animalCreator(animal, scanner);
                            animals.add(animal);
                        }
                        default ->
                            System.out.println("Use only cat/dog/duck/");
                    }
                }
                case LIST -> {

                    System.out.println(animals.toString());
                }
                case EXIT -> {
                    System.out.println("-----------------The Program is over-------------------");
                    System.exit(0);
                }
                default -> {
                    System.out.println("-----------Wrong command use only add/list/exit-----------");
                }

            }

        }

    }
    static void animalCreator(Animal animal, Scanner scanner)
    {
        System.out.println("Enter name");
        animal.setName(scanner.next());
        System.out.println("Enter age");
        animal.setAge(scanner.nextInt());
        System.out.println("Enter weight");
        animal.setWeight(scanner.nextInt());
        System.out.println("Enter color");
        animal.setColor(scanner.next());
        animal.say();

    }

}








