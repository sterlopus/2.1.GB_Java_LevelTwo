package ru.geekbrains.lession2;
// Extentions lession

import static java.lang.Integer.parseInt;

public class Lession2 {

/*  1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
    подаче массива другого размера необходимо бросить исключение MyArraySizeException.

    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
    просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
    ячейке лежит символ или текст вместо числа), должно быть брошено исключение
    MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

    3. В методе main() вызвать полученный метод, обработать возможные исключения
    MyArraySizeException и MyArrayDataException и вывести результат расчета.*/

    public static void main(String[] args) throws MyArrayWrongFormatException {
        String[][] a;
        a = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "c", "4"}
        };
        try {
            ArrayChecker(a);
        } catch (MyArraySizeException e) {
            System.out.println("array must be 4x4");
        }
    }

    public static void ArrayChecker(String[][] incomeArray) throws MyArraySizeException, MyArrayWrongFormatException {

        if (incomeArray.length != 4) {
            throw new MyArraySizeException("array must be 4x4");
        } else {
//            System.out.println("OKAY");

            int i,j,sum = 0;
            for (i = 0; i < (incomeArray.length); i++) {
                for (j = 0; j < (incomeArray.length); j++) {
                   try {
                       sum += parseInt(incomeArray[i][j]);
                   } catch (NumberFormatException e) {
                       throw new MyArrayWrongFormatException (i+1, j+1,"wrong data in position ");
                   } catch (ArrayIndexOutOfBoundsException e){
                       throw new MyArraySizeException("array must be 4x4");
                   }
                }
            }
            System.out.println("sum = " + sum);
        }
    }
}