package Scaner_1;

import java.util.Scanner; // импортируем класс

/**
 * Created by APetryshche on 31.01.2017.
 */
public class Scaner_int
{
    public static void checkNumber()
    {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;
        System.out.println("Введите целое число: ");

        if (sc.hasNextInt()) // возвращает истинну если с потока ввода можно считать целое число
        {
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(i*2);
        }
        else
        {
            System.out.println("Вы ввели не целое число");
        }

    }

    public void printSomsing()
    {
        System.out.println("Hello, Word!");
    }

    public static void main(String[] args)
    {
        checkNumber();
    }
}
