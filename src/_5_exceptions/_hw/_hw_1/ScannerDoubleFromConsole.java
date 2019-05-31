/**
 *      1. Напишите метод public List<Double> readValues() throws ..., читающий числа
 *      с плавающей точкой из ввода консоли, через Scanner. Сгенерируйте подходящие исключения,
 *      если ввод если введены данные, не относящиеся к числам с плавающей точкой.
 *      Ввод:  1 2 3 4 aaaa
 *
 *      2. Напишите метод public double sumOfValues() throws ..., вызывающий метод из предыдущего упражнения
 *      и возвращающий сумму введеных значений в разных строках. Организуйте распространение любых исключений
 *      вызывающему коду.
 *      Ввод:   1 2 3 4
 *              2 3 4 aaa
 */

package _5_exceptions._hw._hw_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerDoubleFromConsole {
    public List readValues() throws Throwable {
        Scanner in = new Scanner(System.in);
        List<Double> doubleList = new ArrayList<>();
        try {
            while ((in.hasNext())) {
                doubleList.add(Double.valueOf(in.next()));
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return doubleList;
    }

    public static double sumOfValues(List<Double> doubleList) throws Throwable {
        Double summ = 0d;
        for (Double elem : doubleList) {
            summ += elem;
        }
        return summ;
    }
}
