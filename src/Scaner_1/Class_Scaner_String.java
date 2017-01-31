package Scaner_1;

import java.util.Scanner;

/**
 * Created by APetryshche on 31.01.2017.
 */
public class Class_Scaner_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                System.out.println(i);
            }
        }
    }
}
