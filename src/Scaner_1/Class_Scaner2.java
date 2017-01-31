package Scaner_1;

import java.util.Scanner;

/**
 * Created by APetryshche on 31.01.2017.
 */
public class Class_Scaner2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double i;

        if (sc.hasNextDouble()) {
            i = sc.nextDouble(); // если ввести букву s, то случится ошибка во время исполнения
            System.out.println(i / 3);
        }
        else
        {
            System.out.println("Ошибочка!!!");
        }
    }
}
