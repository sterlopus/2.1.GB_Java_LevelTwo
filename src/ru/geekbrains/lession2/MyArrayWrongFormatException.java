package ru.geekbrains.lession2;

public class MyArrayWrongFormatException extends Exception {
    public MyArrayWrongFormatException() {
        super();
    }

    public MyArrayWrongFormatException(int i, int j, String alert) {
        super(alert + i + "x" +j);
    }
}
