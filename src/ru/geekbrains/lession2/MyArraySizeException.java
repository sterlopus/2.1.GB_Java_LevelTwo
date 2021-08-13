package ru.geekbrains.lession2;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super();
    }

    public MyArraySizeException (String alert) {
        super(alert);
    }
}
