package ru.geekbrains.lession1;

public class Robot {
    private final String name;
    private final int runDistance;
    private final int jumpHeight;

//    public Robot (){
//    }

    public Robot (String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run () {
        System.out.println("Robot " + name + " is running");
    }
    public void jump () {
        System.out.println("Robot " + name + " is jumping");
    }

    public int getRun_distance () {
        return runDistance;
    }

    public int getJump_height () {
        return jumpHeight;
    }
}
