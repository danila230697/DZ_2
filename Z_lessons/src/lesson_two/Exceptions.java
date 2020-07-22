package lesson_two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exceptions {

/*
	 1. Есть строка вида: "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";

	 (другими словами матрица 4x4)
	 1 3 1 2
	 2 3 2 2
	 5 6 7 1
	 3 3 1 0

	 Написать метод, на вход которого подаётся такая строка,
	 метод должен преобразовать строку в двумерный массив типа String[][];

	 2. Преобразовать все элементы массива в числа типа int,
	 просуммировать, поделить полученную сумму на 2, и вернуть результат;

	 3. Ваш метод должен бросить исключения в случаях:
	    Если размер матрицы, полученной из строки, не равен 4x4;
	    Если в одной из ячеек полученной матрицы не число; (например символ или слово)
	 4. В методе main необходимо вызвать полученный метод, обработать возможные исключения и вывести результат расчета.

* */
    public static void main(String[] args) {

        methodB();

        System.out.println("all finished ok");
    }

    static void methodA(int a, int b) {
        // open file
        // read file

        FileInputStream is = null;

        try {
           is = new FileInputStream("");
        } catch (IOException anyArgumentName) {
            throw new RuntimeException(anyArgumentName);
        } finally {
            try {
                is.close();
            } catch (NullPointerException | IOException e) {
                e.printStackTrace();
            }
        }

        try (FileOutputStream fos = new FileOutputStream("")) {

        } catch (IOException e) {

        }
    }

    static void methodB() {
        return;
    }

    static void methodC() throws IOException {
        IOException ioe = new IOException("hi, i'm ioe");
        throw ioe;
    }
}
