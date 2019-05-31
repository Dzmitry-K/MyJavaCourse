/**
 *      Напишите метод public List<Double> readValues() throws ..., читающий числа
 *      с плавающей точкой из ввода консоли, через Scanner. Сгенерируйте подходящие исключения,
 *      если ввод если введены данные, не относящиеся к числам с плавающей точкой.
 *      Ввод:  1 2 3 4 aaaa
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
}
