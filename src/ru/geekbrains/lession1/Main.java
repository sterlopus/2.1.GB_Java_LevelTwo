package ru.geekbrains.lession1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Beings[] beings = {
                new Human("Mary", 4, 2),
                new Human("Doris", 5, 3),
                new Cat("Barsik", 3, 1),
                new Cat("Smelly", 2, 1),
                new Robot("R2D2", 1, 0),
                new Robot("Verter", 10, 5)
                };

        Preps[] preps = {
                new Wall(1),
                new Treadmill(4),
                new Wall(2),
                new Wall(4),
                new Treadmill(5)
                };

        System.out.println("zero output");

    }
}
