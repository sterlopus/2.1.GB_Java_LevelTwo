package ru.geekbrains.lession1;

public class Wall {
    private int height;

    public Wall (){
    }

    public Wall(int height) {
        this.height = height;
    }

    public void jumping (String name, int jump_height) {
        if (jump_height > height)  { // this.height????
            System.out.println( name + " is jumped over this wall");
        } else {
            System.out.println( name + " couldn't jump over this wall");
        }
    }
}
