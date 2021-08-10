package ru.geekbrains.lession1;

public class Cat {
    private String name;
    private int runDistance;
    private int jumpHeight;

//    public Cat () {
//    }

    public Cat (String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run () {
        System.out.println("Cat " + name + " is running");
    }
    public void jump () {
        System.out.println("Cat " + name + " is jumping");
    }

    public int getRun_distance () {
        return runDistance;
    }

    public int getJump_height () {
        return jumpHeight;
    }
}
