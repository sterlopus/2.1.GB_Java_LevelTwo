package ru.geekbrains.lession1;

public class Treadmill {
    private int length;

    public Treadmill (){
    }

    public Treadmill(int length) {
        this.length = length;
    }

    public void running (String name, int run_distance) {
        if (run_distance > this.length)  {
            System.out.println( name + " is run over this treadmill");
        } else {
            System.out.println( name + " couldn't run over this treadmill");
        }
    }
}
